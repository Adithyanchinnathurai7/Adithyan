package vin;

public class SimpleCalculation 
{
	public static void main(String[] args)
	{
		SimpleCalculation qu=new SimpleCalculation();
		qu.add1(3,5);
		qu.add3(5, 7);
		qu.add4(10);
		System.out.println(qu.add2(5, 8));
		
		
		//System.out.println(c);
	}

	void add1(int i,int j)
		{
			int sum=i+j;
			System.out.println(i+"and"+j+ ":" +sum);
		}
		int add2(int i,int j)
		{
		
			//int c=i+j;
			//System.out.println(c);
			return i+j;
		
		}
		void add3(int i,int j)
		{
			display(i+j);
		}
		 void display(int d) 
		 {
			System.out.println("the result is.."+d);
		 }
		
		 void add4(int...i)
		 {
			 int result=0;
			 for(int s:i)
				 result=result+s;
			 {
				System.out.printf("result..%d\n",result); 
			 }
		 }
		
		 }


