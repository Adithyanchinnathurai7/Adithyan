package vin;

public class ConsDemo 
{
	public ConsDemo() 
	{
		System.out.println("cons with default called...");
	}
	public ConsDemo(String i) 
	{
		System.out.println("cons with i value called...:"+i);
	}
	public ConsDemo(Employee emp)
	{
		System.out.println("employee cons called...."+emp);
	}
	
	public static void main(String[] args)
	{
		new ConsDemo();
		new ConsDemo("rtweter");
		new ConsDemo(new Employee());
	}



}	

class Employee

{
	//String k="rrrrrr";

}


