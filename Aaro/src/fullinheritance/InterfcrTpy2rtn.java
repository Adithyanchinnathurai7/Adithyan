package fullinheritance;
//interface 
//implements object creation types
//b). interface return type empty method
public class InterfcrTpy2rtn 
{

	public static void main(String[] args)
	{
		//1.anonymous
		int value;
		value=new FInterTwo()
				{
					@Override
					public int met() {
						
						return 10;
					}
				}.met();
				System.out.println("anonymous tpy return tpye vlue "+value);
				
		//2.reference
				
				FInterTwo two=new InterfcrTpy2rtn()::Mymethod2;
				value=two.met();
				System.out.println("reference type return type value "+value);
				
		//3.lambda
				FInterTwo donLambda=()->
						{
							return 1000;
						};
						value=donLambda.met();
						System.out.println("lambda's return type valu "+value);
						
		//normal
						
						FInterTwo norm=new MyFInterTwoImpl();
						value=norm.met();
						System.out.println("normal return value "+value);
	}
	
	//2.reference's  method
	public int Mymethod2()
	{
		return 100;
	}
}
	// normal
	class  MyFInterTwoImpl implements FInterTwo
	{
		@Override
		public int met() {
			
			return 107;
		}
	}


 
interface FInterTwo
{
	public int met();
}