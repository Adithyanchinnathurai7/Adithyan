package vin;

public class Trymethod
{

	public static void main(String[] args) 
	{
		Trymethod gd=new Trymethod();
		gd.met(10 );
		Trymethod.sMet();
		

	}
	

	
	public void met(int i)
	{
		 i=i+10;
		System.out.println(i);
		met2("Super",89 );
	}
	public void met2(String s,int i)
	{
		 
			System.out.println(s+":"+i);
	}
	public static void sMet()
	{
		int a=4;
		int b=6;
		int c=a+b;
		System.out.println(c);
		tmet("Good",c);
		
	}
	public static void tmet(String d,int c) 
	{
		System.out.println(d+":"+c);
	}
	
}