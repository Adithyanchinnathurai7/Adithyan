package adiproject;


import java.time.Duration;
import java.util.Scanner;

import org.apache.commons.lang.time.DurationFormatUtils;

public class Truck
{

	public static void main(String[] args) 
	{
		
		Scanner dia= new Scanner(System.in);
		System.out.println("Duration:");
		int dura =dia .nextInt();
		Object du=DurationFormatUtils.formatDurationHMS(dura);
		
		System.out.println("Speed:");
		int Speed =dia .nextInt();
		
		
		int date=dura/Speed;
		System.out.println(date);
		
	}

	
}


