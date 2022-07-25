package util;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHasmap 
{

	public static void main(String[] args) 
	{
		Map<String,String> map=new WeakHashMap<String, String>();
		
		String key1=new String("d1");
		String key2=new String("d2");
		
		map.put(key1, "Super");
		map.put(key2, "Good");
		
		System.out.println(map);
		key1=null;
		System.out.println(map);
		System.gc();
		
		System.out.println(map);
	}
}	