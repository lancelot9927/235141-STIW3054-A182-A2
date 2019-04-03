package assignment2.A2;


import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class CalCourse extends MainClass implements Runnable {

	String[] liness;
	
	
	public CalCourse(String[] lines) {
		this.liness=lines;
	}
    @Override
    public void run() {
 {
	 String a = null;
	 for(String line : liness) {
		 Pattern num = Pattern.compile("^\\d+");
		 Matcher m=num.matcher(line); 
		 while(m.find()) { 
		 a=m.group();
		 }
		 	
		//  System.out.println(line);
		  
		  }
	 System.out.println("---------------------------------------------------------------------" );
	 System.out.println("Thread 1: - Total "+a+" course");
	 System.out.println("---------------------------------------------------------------------" );
	 
}
}
}
