package vin;

import java.util.Scanner;

public class Switch
{

	public static void main(String[] args)
	{
		
		Scanner hq=new Scanner(System.in);
		System.out.println("Enter the num:");
		int nuw=hq.nextInt();
		switch(nuw)
		{
		case 1:
			System.out.println("C");
			break;
		case 2:
			System.out.println("Enter the num:");
			int jd=hq.nextInt();
			switch(jd)
			{
				case 1:
					System.out.println("java");
					break;
				case 2:
					System.out.println("javascript");
					break;
				default:
					System.out.println("DBMS");
					break;
					
			}break;
			
			
		default:
			System.out.println("C++");
			
		}
	}

}
