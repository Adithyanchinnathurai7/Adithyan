package fullinheritance;
//interface 
//implements object creation types
//c). interface string return type empty method

public class InterfcTpy3rtns 
{

	public static void main(String[] args) 
	{
		// anonymous 
		String val=new FInterThree()
		{
			@Override
			public String met(int i, String s) 
			{
				
				return i +":"+s;
			}
		}.met(07, "anonymous");
		System.out.println("value ..."+val);
		
		//reference
		
		FInterThree three=new InterfcTpy3rtns()::mymethod3;
		val=three.met(12, "reference");
		System.out.println("value..."+val);
		
		//lambda
		FInterThree rumLambda=(int i,String str)->
		{
			return i+":"+str;
		}; val= rumLambda.met(15,"lambda");
		
		System.out.println("value"+val);
		
		//normal
		
		FInterThree norml=new InterfcthreeImp();
		val=norml.met(20," normal");
		System.out.println("value "+val);
		
	}
	
	public String mymethod3(int i,String s) 
		
	{
		return i+":"+s;
	}
}
	class InterfcthreeImp implements FInterThree
	{
		 @Override
		public String met(int i, String s) 
		 {
			
			return i+":"+s; 
		}
	}
	

interface FInterThree
{
	public String met(int i,String s);
}