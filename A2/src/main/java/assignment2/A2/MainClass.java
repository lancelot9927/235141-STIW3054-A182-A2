package assignment2.A2;

import java.io.File;
import java.io.IOException;
 
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
 
public class MainClass {
	public static void main(String[] args)  throws IOException, Exception{
		

		
		try (PDDocument pdoc = PDDocument.load(new File("C:\\Users\\Administrator\\Desktop\\A182 Draft Stud.pdf"))) {
			
			pdoc.getClass();
			
			if(!pdoc.isEncrypted()) {
				PDFTextStripperByArea stripper = new PDFTextStripperByArea();
				stripper.setSortByPosition(true);
				PDFTextStripper tStripper = new PDFTextStripper();
				
				String pdfFileInText = tStripper.getText(pdoc);
				
				String[] lines = pdfFileInText.split("\\r?\\n");
				
				
				CalDays days = new CalDays(lines);
				CalCourse course = new CalCourse(lines);
				ListofSOC soc = new ListofSOC(lines);
				NumofSOC num = new NumofSOC(lines);
				STIW3054 stiw = new STIW3054(lines);
				
				Thread t1 = new Thread(course);
				t1.start();
				t1.join();
				Thread.sleep(2000);
				
				
				Thread t2 = new Thread(days);
				t2.start();
				Thread.sleep(2000);
				
				Thread t4 = new Thread(num);
				t4.start();
				  try{
			            t4.join();
			        } catch (InterruptedException e){
			            e.printStackTrace();
			        }
				  Thread.sleep(2000);
				
				Thread t3 = new Thread(soc);
				t3.start();
				 try{
			            t3.join();
			        } catch (InterruptedException e){
			            e.printStackTrace();
			}
				 Thread.sleep(2000);
				 
				 Thread t5 = new Thread(stiw);
				 t5.start();
				/*
				 * for(String line : lines) {
				 * 
				 * System.out.println(line);
				 * 
				 * }
				 */
				
			}
			
		} catch (InvalidPasswordException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
	}
 
}

