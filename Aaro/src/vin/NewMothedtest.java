package vin;

public class NewMothedtest 
{

	public static void main(String[] args) 
	{
		College ref=new College();
		ref.Mech(10,20,"Study");
		ref.Soft(new int []{1,3,6,7,8});
		
	}
}
		class College
		{
			void Mech(int x,int y,String z)
			{
				System.out.println(x+":"+y+":"+z);
			}
			void Soft(int a[]) 
			{
				for(int x:a)
				{
					System.out.println(x);
				}
			}
			}

	

