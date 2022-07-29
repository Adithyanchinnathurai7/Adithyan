package vin;

import java.util.Scanner;

public class AreaRSTC 
{

	public static void main(String[] args)
	{
	/*	System.out.println("Rectangle");
		Scanner ans=new Scanner(System.in);
		System.out.println("Enter length:");
		double l=ans.nextDouble();
		System.out.println("Enter width:");
		double w=ans.nextDouble();
		double area=l*w;
		System.out.println("area of Rectangle:"+area);*/
		
	/*	System.out.println("Squre");
		Scanner ans=new Scanner(System.in);
		System.out.println("Enter a:");
		
		double a=ans.nextDouble();
		double area=a*a;
		System.out.println("area of Rectangle:"+area);*/
		
	/*	System.out.println("Triangle");
		Scanner ans=new Scanner(System.in);
		System.out.println("Enter base:");
		double b=ans.nextDouble();
		System.out.println("Enter hight:");
		double h=ans.nextDouble();
		double area= h*b*1/2;
		System.out.println("area of Triangle:"+area);*/
		
		
		System.out.println("Circle");
		Scanner ans=new Scanner(System.in);
		System.out.println("Enter a:");
		double c=ans.nextDouble();
		double area= Math.PI*(c*c);
		System.out.println("area of circle : "+area);
		double circumference=Math.PI*2*c;
		System.out.println("circumference of circle : "+circumference);
		
		
	}

}
