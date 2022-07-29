package exe1;

public class Wrapper {

	public static void main(String[] args) {
		int i=10;
		Integer ii=90;
		// Integer, Float, Boolean,Character,
		Integer result=new Integer(ii);
		 result=Integer.valueOf(i);
		 result=Integer.parseInt("10");
		
		i= result;//auto unboxing
		i=Integer.valueOf(ii);//manual unboxing
		
		 result=i;//auto boxing
		
		String arg=args[3];
		String str=args[2];
		
		System.out.println(arg+str);
		System.out.println(Integer.parseInt(arg)+Integer.parseInt(str));
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		System.out.println(Integer.compare(60, 60));
		
		System.out.println(Integer.max(20, 40));
	}
	
	
}

