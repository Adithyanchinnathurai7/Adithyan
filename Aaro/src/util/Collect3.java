package util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Collect3 
{

	public static void main(String[] args) 
	{
		List<String> list=new LinkedList<>();
		
		list.add("vikram");
		list.add("Rolex");
		list.add("Anbu");
		
		System.out.println("Original size..:"+list.size());
		list.add("Adaikalam");
		System.out.println("modified...add..:"+list.size());
		list.remove(0);
		System.out.println("modified..remove..:"+list.size());
		
		System.out.println(list.get(1));
		
		System.out.println(list);
		
		for(String s:list) 
		{
			System.out.println(s);
		}
		System.out.println("...............................");
		
		for(int i=0;i<list.size();i++) 
		{
			System.out.println(list.get(i));
		}
		System.out.println("****************************");
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) 
		{
			System.out.println(iter.next());
		}
		
		System.out.println("============================");
		ListIterator<String> lit=list.listIterator();
		while(lit.hasNext()) 
		{
			System.out.println(lit.next());
		}
		System.out.println("_________________________________");
		while(lit.hasPrevious()) 
		{
			System.out.println(lit.previous());
		}
	}
}

	