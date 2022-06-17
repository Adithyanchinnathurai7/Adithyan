package vin;

public class NewInnercls 
{

	public static void main(String[] args) 
	{
		//Pepsi dol=new Pepsi();
		//kalimark.ew=new kalimark();
		//dol.SellCola();
		kalimark  dd=new kalimark();
		//dd.make();
		dd.SellCola();
	}

}
	class Pepsi
	{
		public void SellCola()
		{
			//kalimark.CampaCola dd=new kalimark().new CampaCola();
		//	dd.make();
			System.out.println("Pepsi");
		}
	
	}
	class kalimark
	{
		public void SellCola()
		{
			CampaCola dd=new CampaCola();
			dd.make();
			System.out.println("Bavonto");
		}
		class CampaCola
		{
			public void make()
			{
				System.out.println("CampaCola factory");
			}
		}
	}
