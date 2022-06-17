package vin;

public class MethOvr1
{

	public static void main(String[] args) 
	{
		MethOvr1 obj=new MethOvr1();
		
		obj.met();
	}
	public void met(int i,int j) {
		System.out.println("int param met method called..");
	}
	
	 int met() {
		System.out.println("no param met method called...");
		return 1;
	}
	 void met(float f) {
		 System.out.println("float param method called...");
	 }
}




