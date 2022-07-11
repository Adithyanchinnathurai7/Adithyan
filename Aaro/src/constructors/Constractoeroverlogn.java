package constructors;

public class Constractoeroverlogn 
{

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		School hari=new School(1.2f);
		
		School ela=hari;
		
		
		
		ela.c=5.4f;
		hari.c=5.0f;
		System.out.println(hari.c);
		
		System.out.println(ela.c);
		

	}

}
class School
{
	float c=21.5f;
	public School(int i) {
		System.out.println("1 Standard Books are Provided.............."+i);
	}
	public School(long b) {
		System.out.println("2 Standard Books are Provided.............."+b);
	}
	public School(float c) {
		this.c=c;
		System.out.println("3 Standard Books are Provided.............."+this.c);
	}
	
}

