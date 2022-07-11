package vin;

public class RefValTry 
{

	public static void main(String[] args) 
	{
		int n=100;
		int k=n;
		n=n+10;
		System.out.println(n);
		System.out.println(k);
		
		String str="Good";
		String temp=str;
		str=str+"Morning";
		System.out.println(str);
		System.out.println(temp);
		
		Wood duo=new Wood();
		Wood tem=duo;
		
		duo.size=110000;
		
		System.out.println(duo.size);
		System.out.println(tem.size);
	}

}
class Wood
{
	int size=10;
}