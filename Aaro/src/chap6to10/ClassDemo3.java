package chap6to10;

public class ClassDemo3
{

	public static void main(String[] args)
	{
		
		Bank bk= new Bank();
		bk.depositCash();
		
		System.out.println(bk.six());

		Complx2 com=new Complx2();		
		bk.four(com);
		//bk.five(com);	
		System.out.println(bk.three(com).j);
				
	}

}


class Complx
{
	
}
class Complx2
{
	int j=10;
}



class Bank
{
	Complx six() 
	 {
		 return new Complx();
	 }
	
	
		boolean depositCash()
	{
		return true;
	}
	int one()
	{
		return 9;
	}
	String two()
	{
		return "s";
	}
	
	void four(Complx2 c)
	{
		c.j=15;
	}
	//void five(Complx2 c)
	//{
		//c.j=20;
	//}
	 Complx2 three(Complx2 c)
	{
		 
		return  c ;
	}
	 
	 
	 
	 
	
	 
}



