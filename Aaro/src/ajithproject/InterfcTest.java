package ajithproject;

public class InterfcTest 
{

	public static void main(String[] args)
	{
		Bank bk=new Bank();
		bk.money=500;
		new Strong() 
		{
			@Override
			public Bank credit(Bank bk, int o) 
			{
			bk.money=(bk.money+o);
			return bk;
			}
		}.credit(bk, 200);
		System.out.println("anonymous obj value "+bk.money);
	
		
		

	}

}
interface Strong
{
	public Bank credit(Bank bk,int o);
}
class Bank 
{
	int money;
}