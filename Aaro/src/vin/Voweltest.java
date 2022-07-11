package vin;


import java.util.Scanner;

public class Voweltest 
{

	public static void main(String[] args) 
	{
		String [] a1= {"a","e","i","o","u"};
		Scanner n=new Scanner(System.in);
		
		System.out.println("enter a character:");
		
		
		String ch=n.nextLine();		
		
			
		if(a1[0].equals(ch)||a1[1].equals(ch)||a1[2].equals(ch)||a1[3].equals(ch)||a1[4].equals(ch))
				
		{
			System.out.println(ch+ " is vowel");
		}
		else
		{
			System.out.println(ch+ " is not vowel");
		}
	}

}
