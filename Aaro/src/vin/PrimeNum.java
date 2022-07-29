package vin;

import java.util.Scanner;

public class PrimeNum 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter your num:");
		int i=sc.nextInt(); 
	
		
			if(i==0||i==1||i==2||i==3||i==5||i==7)
			{
				System.out.print(i+" is prime ");
			}
			else if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0)
			{
				System.out.print(i+" is prime ");
			}
			else
			{
				System.out.println("is not prime");
			}
			
			
		/*	for(int i=0;i<=100;i++)
			{
				if(i==0||i==1||i==2||i==3||i==5||i==7)
				{
					System.out.print(i+" ");
				}
				else if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0)
				{
					System.out.print(i+" ");
				}*/
			
		}

	}




