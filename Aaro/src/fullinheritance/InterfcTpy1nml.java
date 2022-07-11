package fullinheritance;


// interface 
// implements object creation types
//a).normal interface simple empty method
//1.anonymous
//2.reference
//3.lambda
//4.normal object creation

public class InterfcTpy1nml 
{

	public static void main(String[] args) 
	{
		//1.anonymous
	new FInterOne()
		{
			@Override
			public void met()
			{
				System.out.println("anonymous inner class met called..");
				
			}
		}.met();
		
	

		
		
		//method reference
		FInterOne one=InterfcTpy1nml::mymethod;
		one.met();
		
		
		//lambda
		
		FInterOne oneLambda=()->
		{

			System.out.println("logic in lambda called");
			}; oneLambda.met();
		
		//normal object creation
		FInterOne onem=new MyFInterOneImpl();
		onem.met();
		
		
	}
	
	//method
	public static void mymethod()
	{
		System.out.println("my method called..");
	}
}
	class MyFInterOneImpl implements FInterOne
	{
		@Override
		public void met() 
		{
			System.out.println("met normal old implementation called");
			
		} 
	

	}

interface FInterOne
{
	public void met();
}


		




