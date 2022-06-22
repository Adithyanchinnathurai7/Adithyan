import java.io.File;
import java.lang.System.Logger;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import org.apache.log4j.PropertyConfigurator;

public class MTask {
	
	public static void main(String[] args) {
		
		
		
		
		
		
		double distance,speed;
		
		Scanner s=new Scanner(System.in);
		
		
		
		
		System.out.println("Enter Speed in Hours");
		
		speed=s.nextDouble();
		
		System.out.println("Enter Distance in KM");
		
		distance=s.nextDouble();
		
		LocalDate date=LocalDate.now();
		LocalTime time=LocalTime.now();
		
		LocalDateTime l=LocalDateTime.of(date,time);
		
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-mm-yyy");
		DateTimeFormatter m=DateTimeFormatter.ofPattern("hh:mm");
		
		
		
		String dd=l.format(f);
		String tt=l.format(m);
		
		double tm=distance/speed;
		
		int hr=(int) tm;
		
		
		System.out.println(tm);
		
	
		LocalDateTime el=l.plusHours(hr);
		
		long p2 = ChronoUnit.DAYS.between(l, el);
		
		int n=(int) p2+1;
		
		int g=0,j=0;
		
		for(int i=0;i<=n;i++) {
			
			LocalDateTime l7=l.plusDays(g);
			
			g++;
			
			DayOfWeek as=l7.getDayOfWeek();
			
			if(DayOfWeek.SUNDAY.equals(as)) {
				
				n++;
				j++;
				
			}
			
		}
		
		LocalDateTime l5=el.plusDays(j);
		
		String sss=l5.format(f);
		System.out.println("End Time is............."+sss);
		
		s.close();
		
		System.out.println("Ended...............");
		
	}
	
}
	
		