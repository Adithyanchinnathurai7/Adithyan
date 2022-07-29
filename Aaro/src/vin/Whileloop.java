package vin;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		int num,sum=0;
		Scanner get=new Scanner(System.in);
		
		System.out.println("enter the num below 10:");
		num=get.nextInt();
		
		while(num<=10) {
			sum=sum+num;
			num++;
			}
			System.out.format("the num is %d",sum);
	}

}
