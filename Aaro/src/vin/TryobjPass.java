package vin;

public class TryobjPass 
{

	public static void main(String[] args)
	{
		MyBank icc=new MyBank();
		Money MyMoney=new Money();
		icc.acceptMoney(MyMoney);
		
		icc.transferMoney(10000, new Account());
		

	}

}
	class MyBank
	{
		public void acceptMoney(Money gsa)
		{
			
		}
		public void transferMoney(int amt,Account acct)
		{
			acct.debit(50);
			acct.credit(100);
		}
	}
	class Money
	{
		
	}
	class Account
	{
		public void debit(int debt)
		{
			System.out.println("debited:"+debt);
		}
		public void credit(int crid)
		{
			System.out.println("credited"+crid);
		}
	}