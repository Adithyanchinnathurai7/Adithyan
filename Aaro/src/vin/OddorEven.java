package vin;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		Scanner n1=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a1=n1.nextInt();
		
		if(a1%2==0)
			System.out.println(a1+"is Even ");
		else
			System.out.println(a1+" is Odd ");

		
	}

}
