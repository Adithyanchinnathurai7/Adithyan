package multithread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClassLock 
{

	public static void main(String[] args) 
	{
		Theatre max=new Theatre();
		Theatre imax=new Theatre();
		
		ExecutorService sr=Executors.newFixedThreadPool(2);
		sr.execute(
				()->
				{
					synchronized (Theatre.class)
					{
						Thread.currentThread().setName("Vijay");
						max.toilet.useToilet();
					}
				}
				);
		
		sr.execute(
				()->
				{
					synchronized (Theatre.class)
					{
						Thread.currentThread().setName("Rajini");
						imax.toilet.useToilet();
						
					}
				}
				);
	}

}
class Toilet
{
	public void useToilet()
	{
		Thread r=Thread.currentThread();
		String name=r.getName();
		System.out.println(name+" Vijay using the toilet");
		try 
		{
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			
		}
		System.out.println(name+" come out of toilet");
	}
}
class Theatre
{
	Toilet toilet=new Toilet();
}
