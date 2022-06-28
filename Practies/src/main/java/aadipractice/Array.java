package aadipractice;

public class Array 
{

	public static void main(String[] args)
	{
		
		//Single dinmentional Array 
//		int a[]= {10,39,4,56};//array syntax
//		System.out.println(a[0]);//read the array value a[0]=10,a[1]=39,.....a[3]=56
//		System.out.println(a[1]);//ex get 39
//		System.out.println(a[2]);//ex get 4
//		System.out.println(a[3]);//ex get 59
		
		//Multi dinmentional Array
		
		int b[][]= {
				{1,2,4,5,6},
				{6,7,8,4,5},
				{8,9,6,4,6}
					};
		System.out.println(b[0][0]);
		
		System.out.println("No of row "+b.length);
		System.out.println("No of coumn "+b[0].length);
		
		int columns=5;
	}

}
