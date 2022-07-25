package vin;

import java.util.Scanner;

public class Numfloyed {

	public static void main(String[] args) {
		int count,num=1,j;
		Scanner get=new Scanner(System.in);
		System.out.println("Enter the row:");
		int row =get.nextInt();
		System.out.println("num tringle");
		   for(count=1;count<=row;count++)
		   {
			   for(j=1;j<=count;j++)
			   {
				   System.out.print(num+" ");
				   num++;
			   }System.out.println();
		   }
	}

}
