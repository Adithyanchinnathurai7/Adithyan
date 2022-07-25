package freepractice;



public class MethodOverloading 
{


	public static void main(String[] args) 
	{
		Addition sum=new Addition();
		sum.Addd(6,9);
		sum.Addd(6,9,20);
		
	}

}
class Addition
{
	public void Addd(int e,int o)
	{
	
		int m=e+o;
		
		System.out.println(m);
		
	}
	public void Addd(int e,int o,int l) 
	{
		int d=e+o+l;
		System.out.println(d);
	}
}

