package assignment2.A2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumofSOC extends MainClass implements Runnable {
	
	String[] liness;
	
	public NumofSOC(String[] lines) {
		this.liness=lines;
	}
	
	   public void run() {
		   
			   int count = 0;
			   for(String line : liness) {
					 Pattern c = Pattern.compile("[A-Z]+\\d");
					 Pattern soc = Pattern.compile("ST+[A-Z]+");
					
					 Matcher s=c.matcher(line); 
					 while(s.find()) { 
						 Matcher numsoc=soc.matcher(s.group()); 
						 while (numsoc.find()) {			 
							if (numsoc.group().equals("STIV")) {
							}else {
								count++;
							}
								
							}
							 
						 }
						
					 
					 }
			   System.out.println("---------------------------------------------------------------------" );
			   System.out.println("Thread 4: - Total is "+ count+" courses from SOC");
			   System.out.println("---------------------------------------------------------------------" );
			   }
		   
		
	   }