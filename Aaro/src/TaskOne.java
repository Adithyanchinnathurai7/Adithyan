
import java.util.Date;
import java.util.Scanner;

import java.text.*;
import java.time.LocalDateTime;

public class TaskOne {

	public static void main(String[] args) {
		
		  
       
        
			Scanner in = new Scanner(System.in);
	        System.out.print("Please Enter speed: ");
	        int speed = in.nextInt();
	        System.out.print("Please Enter distance: ");
	        float distance = in.nextInt();
	        
	        
	        
	        
	        
	        
	        LocalDateTime dtn=new LocalDateTime new ();
	        
	        Date dNow = new Date( );
	       // SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd :");

	        SimpleDateFormat 
	        System.out.println("Current Date: " + ft.format(dNow));
	        
	        float time = (float)distance / speed;
	        
	        System.out.println("Your estimation time is: " + time );
	    }
	}
