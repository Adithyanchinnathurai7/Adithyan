package fullinheritance;

public class inhrnc 
{

	public static void main(String[] args) 
	{
		Subclass ed=new Subclass();
		ed.met();
		ed.abd(8);
		ed.abd();
		
		
	
	
	}

}
	abstract class Superclass
	{
		String cut="dummy";
		final public void met()//using final or contractor
		{
			System.out.println("super class method");
		}
		abstract public void abd();
		
			
		
	}
	class Subclass extends Superclass
	{
		public void abd()
		{
			System.out.println("sub class method");
		}
		public void abd(int i) 
		{
			System.out.println(i);
		}
		
	}
	class Subclass1 extends Superclass
	{
		public void abd()
		{
			System.out.println("sub class method");
		}
	}
	