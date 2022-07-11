package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MethodLock 
{

	public static void main(String[] args) 
	{
		 CounsllingHall bharat=new  CounsllingHall();
		 ExecutorService sr=Executors.newFixedThreadPool(3);
		 sr.execute(
				 ()->
				 {
					 Thread.currentThread().setName("Vikram");
						bharat.showPapers();
						bharat.selectCollege();
						bharat.payFees();
						bharat.exit();
				 }
				 );
		 sr.execute(
				 ()->
				 {
					 Thread.currentThread().setName("Surya");
						bharat.showPapers();
						bharat.selectCollege();
						bharat.payFees();
						bharat.exit();
				 }
				 );
		 sr.execute(
				 ()->
				 {
					 Thread.currentThread().setName("STR");
						bharat.showPapers();
						bharat.selectCollege();
						bharat.payFees();
						bharat.exit();
				 }
				 );
	}

}
class CounsllingHall
{
	synchronized public void showPapers()
	{
		Thread r=Thread.currentThread();
		String name=r.getName();
		System.out.println(name+" Showing Papers");
		try
		{
			Thread.sleep(5000);
		} catch (Exception e)
		{
			
		}
		System.out.println(name+" Completed showing papers");
	}
	synchronized public void selectCollege()
	{
		Thread r=Thread.currentThread();
		String name=r.getName();
		System.out.println(name+" Selecting college");
		try
		{
			Thread.sleep(3000);
		} catch (Exception e)
		{
			
		}
		System.out.println(name+" college Selection end");
	}
	synchronized public void payFees()
	{
		Thread r=Thread.currentThread();
		String name=r.getName();
		System.out.println(name+" Paying");
		try
		{
			Thread.sleep(1000);
		} catch (Exception e)
		{
			
		}
		System.out.println(name+" Payed");
	}
	public void exit()
	{
		Thread r=Thread.currentThread();
		String name=r.getName();
		System.out.println(name+" Exit...");
	}
}

