package multithread;


	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;
	
	public class ThreadClassLockNonStatic {


	

		public static void main(String[] args) {
			Theatree victory = new Theatree ();
			ExecutorService es=Executors.newFixedThreadPool(2);//two person one by one
						
			es.execute(
					()->{
					synchronized(Theatree.class) {
						Thread.currentThread().setName("rajini");//giving job first person
						victory.toilet.useToilet();
					}
					}
			);
			
			es.execute(
					()->{
					synchronized(Theatree.class) {
						Thread.currentThread().setName("kamal");
						victory.toilet.useToilet();
						}
				}
			);
			es.shutdown();
		}
	}
	class Toilettt{
		public void useToilet() {
			Thread t=Thread.currentThread();
			String name=t.getName();
			System.out.println(name+" is using the toilet...");
			try {Thread.sleep(5000);}catch(Exception e) {}
			System.out.println(name+" came out of toilet...");
		}
	}
	class Theatree{
		static Toilettt toilet=new Toilettt();}
	