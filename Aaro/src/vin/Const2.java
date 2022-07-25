package vin;

public class Const2 
{

	public static void main(String[] args) 
	{
		System.out.println(School.count);
		School.createSchool();
		int a=School.count;
       System.out.println(School.count);
       School.createSchool();
       System.out.println(School.count);
       School.createSchool();
       System.out.println(School.count);
       School.createSchool();
       System.out.println(School.count);
       School.createSchool();
       System.out.println(School.count);
       School.createSchool();
       System.out.println(School.count);
       School.createSchool();
       System.out.println(School.count);
       System.out.println(School.schoolw);
	}

}
class School
{
	private School()
	{
		System.out.println("Somthing");
	}
	static int count=0;
	static School schoolw=new School();
	//schoolw.met();
	public static School createSchool() 
	{
		if(count<5)
		{ 
			System.out.println("hi");
			count++;
			return new School();
		}
		else 
		{
			count++;
			return schoolw;
		}}
		 void met()
		{
		System.out.println("htrftyf");	
		
	}
}