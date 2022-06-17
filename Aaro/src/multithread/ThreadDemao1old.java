package multithread;

public class ThreadDemao1old 
{

	public static void main(String[] args) 
	{
		System.out.println("Water...1");
		Thread r=new Thread(new MyRunnable());
		r.run();
		System.out.println("Saidise....3");
	}
		public static void met() 
		{
			try {
				Thread.sleep(500);
				}
			catch(Exception e)
				{
				
				}
			System.out.println("Meals....2");
		}
	

}
class MyRunnable implements Runnable
{
	@Override
	public void run() 
	{
		ThreadDemao1old.met();
	}
	
}