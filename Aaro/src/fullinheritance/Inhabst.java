package fullinheritance;

public class Inhabst 
{

	public static void main(String[] args)
	{
		Samplug indianPlug=new Samplug();
		AmericanPlug americanplug=new lenovaPlug();
		
		Samsocket indiansocket=new Samsocket();
		indianAdapter adapter=new indianAdapter(americanplug);
		indiansocket.roundpinHole(adapter);
	}

}
	abstract class IndianPlug
	{
		public abstract void roundpin();
		
	}
	abstract class IndianSocket
	{
		public abstract void roundpinHole(IndianPlug ip);
		
	}
	abstract class AmericanPlug
	{
		public abstract void slabpin();
		
	}
	abstract class AmericanSocket
	{
		public abstract void slabpinHole(AmericanPlug ap);
		
	}
	class Samplug extends IndianPlug
	{
		public void roundpin()
		{
			System.out.println("sakthi plug working");
		}
	}
	class Samsocket extends IndianSocket
	{
		public void roundpinHole(IndianPlug ip)
		{
			ip.roundpin();
		}
	}
	class indianAdapter extends IndianPlug
	{	
		AmericanPlug ap;
		
		public  indianAdapter(AmericanPlug ap) 
		{
			this.ap=ap;
		}
		public void roundpin()
		{
			ap.slabpin();
		}
	}
	class lenovaPlug extends AmericanPlug
	{
		
		public  void slabpin()
		{
			System.out.println("American slap pin plug working");
		}
	}
		
		