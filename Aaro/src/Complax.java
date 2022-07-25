
public class Complax {

	public static void main(String[] args) 
	{
		
		
		B b=new B();
		A s=new A();
		b.met(s);
		System.out.println(b.met(s).j);
	
	}

}

class B  
{
	public void met1(A a)
	{
		a.j=6;
	}
	public A met(A a)
	{
		return a;
	}
}
class A
{
	int j=10;
}