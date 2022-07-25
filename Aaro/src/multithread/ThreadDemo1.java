package multithread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadDemo1 
{
	//new type of thread creation
	
	public static void main(String[] args) 
	{
		
		System.out.println("Water...1");
		ExecutorService sr=Executors.newFixedThreadPool(2);
		sr.execute(()->{prepare();});
		sr.execute(()->{prepare();});
		sr.shutdown();
		System.out.println("Saidies..3");
		
	}
	public static void prepare()
	{
		
		try{
			Thread.sleep(600);
			}catch (Exception e)
		{
			
		}
			
		
		System.out.println("Meals...2");
	}

}
