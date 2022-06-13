package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo2test 
{

	public static void main(String[] args) 
	{
		ExecutorService sr=Executors.newCachedThreadPool();
		

	}
	public void met1()
	{
		System.out.println("1st person work start");
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			
		}
		System.out.println(" 1st person work end");
	}
	public void met2()
	{
		System.out.println("2nd person work start");
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			
		}
		System.out.println(" 2nd person work end");

	}
}

