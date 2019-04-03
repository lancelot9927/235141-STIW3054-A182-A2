package assignment2.A2;


import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class CalDays extends MainClass implements Runnable {

	String[] liness;

	
	public CalDays(String[] lines) {
		this.liness=lines;
	}
    @Override
    public void run() {
 
	 int mo=0;
	 int dh1 = 0;
	 int dh2 = 0;
	 int dl1 = 1000;
	 int dl2 = 0;
	 String test =null;
	 for(String line : liness) {
		 if(line.equals(" ")) {
			 
		 }else {
		 test = line;
		 Pattern datam = Pattern.compile("\\/+\\d+\\/");//get /month/(String)
		 Pattern datam2 = Pattern.compile("\\d+");//get month(number)
		 Pattern datad = Pattern.compile("\\d+\\/+\\d+\\/+\\d+");//get day/month/year(String)
		 Pattern datad2 = Pattern.compile("^\\d+\\/+");// get day/(String) from datad  
		 Pattern datad3 = Pattern.compile("^\\d+");// get day(number) from datad2
		 Matcher m=datam.matcher(test);
		 Matcher d=datad.matcher(test); 
		 while(m.find()) { 
			 Matcher m2=datam2.matcher(m.group()); 
	
			 while(m2.find()) {
				 mo=Integer.parseInt(m2.group());

				 if(mo==6) {
					
					 while(d.find()) {
						 Matcher d2=datad2.matcher(d.group()); 
							
						 while(d2.find()) {
							 Matcher d3=datad3.matcher(d2.group()); 
							 while (d3.find()) {
								 dh2 =  Integer.parseInt(d3.group());

										if (dh1<dh2) {
											dh1 = dh2;
										}//dh1 is the last day
							 }
							
						 }
						 
				 }
									 
				 }else {
					 while(d.find()) {
						 Matcher d2=datad2.matcher(d.group()); 
						 while(d2.find()) {
							 Matcher d3=datad3.matcher(d2.group()); 
						
							 while (d3.find()) {
								 dl2 =  Integer.parseInt(d3.group());
										if (dl1 > dl2) {
											dl1 = dl2;
										}//dl1 is the first day
							 }
				 }
			 }
		 }
		 } 
		  }

    }
	
	// System.out.println(line);
	
}

	
		int days = dh1-dl1+31+1-8;//-8 is Malaysia new year
		System.out.println("---------------------------------------------------------------------" );
		System.out.println("Thread 2 : - Total days is : "+days );
		System.out.println("---------------------------------------------------------------------" );
}
}
