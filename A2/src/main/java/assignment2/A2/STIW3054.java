package assignment2.A2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class STIW3054 extends MainClass implements Runnable{
String[] liness;
	
	public STIW3054(String[] lines) {
		this.liness=lines;
	}
	
	   public void run() {
		   
			   int count = 0;
			   for(String line : liness) {
					 Pattern stiw = Pattern.compile(" STIW3054");
					
					 Matcher s=stiw.matcher(line); 
					 while(s.find()) { 
						 
						   System.out.println("---------------------------------------------------------------------" );
						   System.out.println("Thread 5: - Detail of STIW3054 is :  " + line);
						   System.out.println("---------------------------------------------------------------------" );
					 
					 }
			 
			   }

}
}