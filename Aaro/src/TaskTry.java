import java.time.LocalDateTime;
import java.util.Scanner;

public class TaskTry 
{

	public static void main(String[] args) 
	{

		double speed,distance,time;
	        
		Scanner sc=new Scanner(System.in);
	 
		System.out.println("enter speed in kmph ");
	 
		speed=sc.nextDouble();	
	 
		System.out.println("enter time in hours ");
		
		time=sc.nextDouble();	
	 
		distance=speed*time;
		
		System.out.println("Distance in kilometers= "+distance+"km");
	 
		System.out.println("Distance in meters= "+distance*1000+"m");
	 
	 
	 
//		Truck kaithi= new Truck();
//		kaithi.met();
//
//	}
//
//}
//class Truck
//{
//	
//
//	public void met()
//	{
//		//LocalDateTime ldt= new LocalDateTime(); 
//		
//		Scanner in = new Scanner(System.in);
//        System.out.print("Please Enter speed: ");
//        int speed = in.nextInt();
//        System.out.print("Please Enter distance: ");
//        float distance = in.nextInt();
//        
//        float time = (float)distance / speed;
//       // System.out.println(time);
//        if(tmie==0)
//        {
//        	
//        }
//        
//        
        
	}
	
}
