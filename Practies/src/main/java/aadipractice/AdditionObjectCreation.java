package aadipractice;

public class AdditionObjectCreation
{

	public static void main(String[] args) 
	{
		Addition sum=new Addition();
		sum.Addd();
		sum.sub();
		
	}

}
class Addition
{
	public void Addd()
	{
	
		int n=90,e=69;
		int m=n+e;
		
		System.out.println(m);
		
	}
	public void sub() 
	{
		int o=16,l=96;
		int b=o+l;
		System.out.println(b);
	}
}