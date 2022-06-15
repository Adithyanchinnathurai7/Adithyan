package newtypes;

import java.lang.reflect.Method;

public class Reflection2
{

	public static void main(String[] args) throws Exception
	{
		Demo deo=new Demo();// normal static
		System.out.println(deo);
		
		Demo demo=(Demo)Class.forName("newtypes.Demo").newInstance();//dynamic
		System.out.println(demo);
		
		demo=(Demo)Class.forName("newtypes.Demo").getConstructor().newInstance();
		System.out.println(demo);
		
		demo=(Demo)Class.forName("newtypes.Demo").getConstructor(String.class,int.class).newInstance("hello",100);
		System.out.println(demo);
		
		Class c=demo.getClass();
		Method m=c.getDeclaredMethod("met",String.class,Employee.class);
		
		m.setAccessible(false);
		System.out.println(m);
		m.invoke(demo,"hello",new Employee());
		
	}

}
class Demo
{
	public Demo()
	{
		System.out.println("Empty constructor");
	}
	public Demo(String str,int i)
	{
		System.out.println(str+"....................."+i);
	}
	public void met(String s,Employee e) {
		System.out.println(s+"............."+e);
	}
}
class Employee{
//	public Employee() {
//		System.out.println("employee obj created...");
//	}
}

