package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo2 
{
	public ThreadDemo2()
	{
		ExecutorService sr=Executors.newFixedThreadPool(2);
		sr.execute(()->
		{
			System.out.println("childthread called...");
		});
//		sr.execute(()->
//		{
//			System.out.println("child thread called...");
//		});
		sr.shutdown();
	}

	
		public static void main(String[] args) 
		{
			//Current thread detail
			Thread r=Thread.currentThread();
			System.out.println(r);
			r.setPriority(9);
			r.setName("Thread");
			
			
			System.out.println(r);
			new ThreadDemo2();
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
				try
				{
					Thread.sleep(100);
				}
				catch (Exception e)
				{
				
				}
			}

		}

}
