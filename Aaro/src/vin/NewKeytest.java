package vin;

public class NewKeytest
{
	
		String s;
		public NewKeytest(String s)
		{
			this.s=s;
			//System.out.println(s);
			
			
		}
		public static void main(String[] args)
		{
			//this keyword cannot be used inside a static method
			NewKeytest obj=new NewKeytest("some");
//			obj.NewKeytest("some value...");
			obj.printS("aaaaaaaaaa");
		}
		
		 public void printS(String s) 
		{
			System.out.println(s);
			System.out.println(this.s);
			
		}
	
}
	class Death
	{
	
	
	}
	


