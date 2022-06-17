package newtypes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Reflection
{

	public static void main(String[] args)throws Exception
	{
		Politician diamond=new Politician();
		PoliceStation a1=new PoliceStation();
		TeaMaster tea=new TeaMaster();
		a1.arrest(tea);
	}
}
	class PoliceStation
	{
		public void arrest(Object obj) throws Exception
		{
			//Politician dia=(Politician)obj;
			
			Class c=obj.getClass();
			Field f=c.getField("name");
			System.out.println(f.get(obj));
			
			Method m=c.getMethod("service");
			m.invoke(obj);
			alexInrogation(obj);
		}
		public void alexInrogation(Object obj) throws Exception
		{
			Class c=obj.getClass();
			Field f=c.getDeclaredField("secretName");
			f.setAccessible(true);
			System.out.println(f.get(obj));
			
			Method m=c.getDeclaredMethod("secretService");
			m.setAccessible(true);
			m.invoke(obj);
			
			
		}
	}


class Politician 
{
	public String name="i am Good man";
	private String secretName="i am a gund thife";
	public void service()
	{
		System.out.println("I do social service.....");
	}
	private void secretService()
	{
		System.out.println("I do illigal business...........");
	}
}
class TeaMaster 
{
	public String name="i am Good man";
	private String secretName="i am not pay income";
	public void service()
	{
		System.out.println("I do good tea.....");
	}
	private void secretService()
	{
		System.out.println("I do loot people...........");
	}
}

