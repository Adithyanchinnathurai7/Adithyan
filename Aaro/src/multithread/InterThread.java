package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InterThread 
{

	public static void main(String[] args) 
	{
		ExecutorService sr = Executors.newFixedThreadPool(2);
		Gun ipl = new Gun();
		sr.execute(() -> 
		{
			for (int i=0;i<5;i++) 
			{
				ipl.load();
			}
		});
		sr.execute(() -> 
		{
			for (int i=0;i<5;i++) 
			{
				ipl.shoot();
			}
		});
		

	}
}

class Gun {
	boolean flag;

	synchronized public void load()
	{
		if (flag) 
		{
			try
			{
				//wait();
			} catch (Exception e)
			{

			}
		}
			System.out.println("fill the builet....");
			flag = true;
		//	notify();
		
	}

	synchronized public void shoot()
	{
		if (!flag)
		{
			
			try
			{
				wait();
			} catch (Exception e)
			{

			}
		}
			System.out.println("shooter shoot...");
			flag = false;
			notify();
	}	
		
}		
			
