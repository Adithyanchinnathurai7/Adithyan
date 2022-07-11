package multithread;


	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;
	public class ThreadObjectDemo {
	
		public static void main(String[] args) {
			ExecutorService es=Executors.newFixedThreadPool(2);
			Theatre iMax=new Theatre();
			Theatre iMax2=new Theatre();
			
			es.execute(
					()->{
					
						synchronized(iMax) {
						Thread.currentThread().setName("rajini");
						
						iMax.toilet.useToilet();
						}
					}
			);
			
			es.execute(
					()->{
						
						synchronized(iMax2) {
						Thread.currentThread().setName("kamal");
						
						iMax2.toilet.useToilet();
						}
					}
			);
			es.shutdown();
		}
	}
	class Toilet{
		public void useToilet() {
			Thread t=Thread.currentThread();
			String name=t.getName();
			System.out.println(name+" is using the toilet...");
			try {Thread.sleep(5000);}catch(Exception e) {}
			System.out.println(name+" came out of toilet...");
		}
	}
	class Theatre{
		 Toilet toilet=new Toilet();
	}