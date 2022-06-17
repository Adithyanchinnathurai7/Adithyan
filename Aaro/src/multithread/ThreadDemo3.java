package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo3 
{

	public static void main(String[] args) 
	{
		ExecutorService sr=Executors.newFixedThreadPool(2);
		sr.execute(
				()->
				{
					synchronized (Theatr.class) 
					{
						Thread.currentThread().setName("Vijay");
						Theatr.toilet.useToilet();
					}
				});
		sr.execute(
				()->
				{
					synchronized (Theatr.class) 
					{
					Thread.currentThread().setName("Rajini");
					Theatr.toilet.useToilet();
					}
				});
		sr.shutdown();

	}

}
class Toilett
{
	public void useToilet()
	{
		Thread r=Thread.currentThread();
		String name=r.getName();
		System.out.println(name+" using the toilet");
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			
		}
		System.out.println(name+" come out of toilet");

	}
}
class Theatr
{
	static Toilett toilet=new  Toilett();
}