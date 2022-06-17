package multithread;


	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;
	
	public class ThreadClassDemo {

	

		public static void main(String[] args) {
			
			ExecutorService es=Executors.newFixedThreadPool(2);
						
			es.execute(
					()->{
						synchronized(Theatreee.class) {
						Thread.currentThread().setName("rajini");
						Theatreee.toilet.useToilet();
						}
					}
			);
			
			es.execute(
					()->{
						synchronized(Theatreee.class) {
						Thread.currentThread().setName("kamal");
						Theatreee.toilet.useToilet();
						}
					}
			);
			es.shutdown();
		}
	}
	class Toiletttt{
		public void useToilet() {
			Thread t=Thread.currentThread();
			String name=t.getName();
			System.out.println(name+" is using the toilet...");
			try {Thread.sleep(5000);}catch(Exception e) {}
			System.out.println(name+" came out of toilet...");
		}
	}
	class Theatreee{
		static Toiletttt toilet=new Toiletttt();
	}