package vin;

public class Customer 
{

	public static void main(String[] args) 
	{
		Puma dd=new Puma();

	}

}
class Puma implements ShoeFoctary
{
	
	public void make()
	{
		System.out.println("Shoe making");
	}
	public void export()
	{
		System.out.println("Exporting shoe");
	}
}
 class SuperShoe implements ShoeShop
{
	public void shoeseller()
	{
		System.out.println();
	}
	class Selsman
	{
		void Giveshoe()
		{
			System.out.println("GIVE");
		}
		void Takemoney()
		{
			System.out.println("TAKE");
		}
	class Shoe
	{
		void shopnow()
		{
			System.out.println("SHOP  NOW");
		}
	}
	}
}
interface ShoeFoctary
{
	public void make();
	public void export();
}
interface ShoeShop
{
	public void shoeseller();
}	
