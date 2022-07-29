package fullinheritance;

public class interfcType4cls 
{
	//interface 
	//implements object creation types
	//d). interface Compelexy type  method


	public static void main(String[] args) 
	{
		//anonymous
		MyAccount accuont=new MyAccount();
		accuont.balance=1000;
		new FInterFour()
		{
			@Override
			public MyAccount transfer(MyAccount accuont, int amt) 
			{
				accuont.balance=(accuont.balance-amt);
				return accuont;
			}
		}.transfer(accuont,400);
		System.out.println("anonymous "+accuont.balance);
		
		/*MyAccount my=	new FInterFour()
			{
				@Override
				public MyAccount transfer(MyAccount act, int amt) 
				{
					act.balance=(act.balance-amt);
					return act;
				}
			}.transfer(accuont,400);
			System.out.println("anonymous "+my.balance);
			*/
			
			
			//REFERENCE
			FInterFour four=new interfcType4cls()::method4;
			accuont=four.transfer(accuont, 100);
			System.out.println("Method ref...:"+accuont.balance);
			
			//lambda
			
			FInterFour viskyLambda=(MyAccount act,int amt)->
			{
				act.balance=(act.balance-amt);
				return act;
			};
			accuont=viskyLambda.transfer(accuont, 300);
			System.out.println("lambda ....complx value "+accuont.balance);
			
			//Normal
			
			FInterFour norml=new InterfcfourImp();
			accuont=norml.transfer(accuont,100);
			System.out.println("normal complex "+accuont.balance);
	}
	public MyAccount method4(MyAccount act,int amt)
	{
		act.balance=(act.balance-amt);
		return act;
	}
}
	class InterfcfourImp implements FInterFour
	{
		@Override
		public MyAccount transfer(MyAccount act, int amt) {
			act.balance=(act.balance-amt);
			
			return act;
		}
	}


interface FInterFour
{
	public MyAccount transfer(MyAccount accuont,int amt);
}
	
 class MyAccount
 {
	int balance; 
 }