package assignment2.A2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListofSOC extends MainClass implements Runnable {
	
	String[] liness;
	
	public ListofSOC(String[] lines) {
		this.liness=lines;
	}
	
	   public void run() {
		   System.out.println("---------------------------------------------------------------------" );
		   System.out.println("Thread 3: -  List of SOC crouses : " );
			   int count = 0;
			   for(String line : liness) {
				  
				   
					 Pattern c = Pattern.compile("[A-Z]+\\d");
					 Pattern soc = Pattern.compile("ST+[A-Z]+");
					 Matcher s=c.matcher(line); 
					 if (line.equals(" ")) {
						 
					 }else {
					 while(s.find()) { 
						 Matcher numsoc=soc.matcher(s.group()); 
						 while (numsoc.find()) {			 
							if (numsoc.group().equals("STIV")) {
							}else {
								
								System.out.println(line);
							}
						 }	
						
							}
							 
						 }
						
					
					 }
		//	   System.out.println(count);
			   System.out.println("---------------------------------------------------------------------" );
			   }
		   
		
	   }
