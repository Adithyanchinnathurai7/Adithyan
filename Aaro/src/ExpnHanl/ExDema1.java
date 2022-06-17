package ExpnHanl;

public class ExDema1 
{

	public static void main(String[] args)
	{
		System.out.println("Before Exception ");
		try 
		{
			int i=1/0;
		}
		catch(ArithmeticException r) 
		{
			System.out.println(r);	
			new Handler().handle(r);
		}
		System.out.println("After Exception");
		
	}

}
class Handler
{
	public void handle(ArithmeticException a)
	{
		System.out.println("Dont't Divided Zero");
	}
}