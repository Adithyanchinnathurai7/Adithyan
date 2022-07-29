package exe1;

public class Test1constroctor 
{

	public static void main(String[] args) 
	{
		new Super();
		Super.meth();
	}

}
class Super
{
	int b=5;
	static 
	{
		System.out.println("don'need object");
	}
	Super()
	{
		int a=2;
		int g=6;
		int c=a+g;
		System.out.println("must need object"+c);
	}
	static void meth()
	{
		System.out.println("void meth");
	}
}
