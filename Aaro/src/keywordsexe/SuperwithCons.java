package keywordsexe;

public class SuperwithCons 
{

	public static void main(String[] args)
	{
		ConsBot cn=new ConsBot("aadi",100);
		
	
	}

}
abstract class ConsTop
{
	public ConsTop(int j,String h)
	{
		System.out.println("top cons object created.."+j+" "+h);
	}
}
abstract class ConsMet extends ConsTop
{
	public ConsMet(int yy)
	{
		super(8,"rrr");
		System.out.println("met cons object created.."+yy);
	}
}
 class ConsBot extends ConsMet
 {
	 public ConsBot(String x,int o)
		{
		 
		 super(100);
			System.out.println("bot cons object created.."+x+","+o);
		}
 }

