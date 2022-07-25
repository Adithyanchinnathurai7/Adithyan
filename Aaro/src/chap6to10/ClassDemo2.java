package chap6to10;

public class ClassDemo2
{
	public static void main(String[] args) 
	{
		Test ts=new Test();
		ts.met1();
		ts.met2();
		int b=ts.met3();
		System.out.println(b);
		
	}
}
class Test
{
	int i=2; //intance variable default value 0
	
	void met1()
	{
		int a=1;
		System.out.println(a);
		System.out.println(i);
	}
	void met2()
	{
		System.out.println(i);
	}
	int met3()
	{
		return 10;
	}
	
}