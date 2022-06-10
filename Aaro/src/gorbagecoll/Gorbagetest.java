package gorbagecoll;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Gorbagetest
{

	public static void main(String[] args) 
	{
		
	

		Runtime r=Runtime.getRuntime();
		
		System.out.println("Available Memory "+r.maxMemory());
		System.out.println("Available processor "+r.availableProcessors());
		
		System.out.println("Free Memory..:"+r.freeMemory());
		Good food=new Good();
		System.out.println("Free Memory..:"+r.freeMemory());

		//SoftReference soft=new SoftReference(food);
		WeakReference weak=new WeakReference(food);
		food=null;
		
		
		r.gc();
		System.out.println("Free Memory..:"+r.freeMemory());
		
		//food=(Good)soft.get();
		food=(Good)weak.get();
		System.out.println(food);
		
}

}
class Good
{
@Override
protected void finalize() throws Throwable
	{
		System.out.println("finalized for food object called..");
	}
}
