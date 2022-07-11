package vin;

public class SimpleClasss 
{

	public static void main(String[] args)
	{
		Mango friuts=new Mango();
		Apple friut=new Apple();
		friuts.sweet();
		friuts.tangy();
		friuts.hot();
		friut.sweet();
		friut.hot();
	}
}
		
		class Mango implements Orange
	
		{
			void sweet()
			{
				int i=5,j=3;//assingt value
				int g=i+j;//g is inizial and logic it is knowlaged
				System.out.println(g);
				
				
			}
			void hot()
			{
				int i=5,j=3;//assingt value
				int e=i+j;//g is inizial and logic it is knowlaged
				System.out.println(e);
			}
			public void tangy() 
			{
				System.out.println("Orange is Super");
			}
		}
		
		interface Orange
		{
			void tangy();
			
				
			
		}

		class Apple
		{
			void sweet()
			{
				int i=3,j=3;//assingt value
				int g=i+j;//g is inizial and logic it is knowlaged
				System.out.println(g);
				
			}
			void hot()
			{
				int i=8,j=3;//assingt value
				int w=i+j;//g is inizial and logic it is knowlaged
				System.out.println(w);
			}
		}



