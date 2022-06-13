package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ObjectLock {

	
		
		
			public static void main(String[] args) 
			{
				Theat max=new Theat();
				Theat imax=new Theat();
				
				ExecutorService sr=Executors.newFixedThreadPool(2);
				sr.execute(
						()->
						{
							synchronized (max)
							{
								Thread.currentThread().setName("Vijay");
								max.toilet.useToilet();
							}
						}
						);
				
				sr.execute(
						()->
						{
							synchronized (imax)
							{
								Thread.currentThread().setName("Rajini");
								imax.toilet.useToilet();
								
							}
						}
						);
			}

		}
		class Toil
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
		class theat
		{
			Toil toilet=new Toil();
		}
