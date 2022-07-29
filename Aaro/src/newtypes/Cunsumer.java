package newtypes;

import java.lang.reflect.Method;

public class Cunsumer 
{
	public static void main(String[] args)throws Exception
	{
		Food food=new Food();
		
//		NonVeg veg=food.getClass().getAnnotation(NonVeg.class);// anotation #NonVeg idendify food class in mention
//		if(veg==null)
//		{
//			System.out.println("non veg food");
//		}
//		else 
//		{
//			System.out.println("veg food...");
//		}
		
		Method m=food.getClass().getMethod("pitza");
		Veg veg=m.getAnnotation(Veg.class);
		if(veg==null)
		{
			System.out.println("Non veg....");
		}
		else
		{
			System.out.println("Veg food ready....");
		}
		
	}
}
