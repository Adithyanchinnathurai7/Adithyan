package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapdemo
{

	public static void main(String[] args)
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		
		hm.put("j10", "Faf");
		hm.put("j20", "abd");
		hm.put("j40", "dumini");
		hm.put("j30", "amla");
		hm.put("j50", "millar");
		
		System.out.println(hm);
//		
//		TreeMap<String,String> tm=new TreeMap<String, String>();
//
//		tm.put("j10", "Faf");
//		tm.put("j20", "abd");
//		tm.put("j40", "dumini");
//		tm.put("j30", "amla");
//		tm.put("j50", "millar");
//		
//		System.out.println(tm);
//		
//		System.out.println(tm.get("j20"));//get value
//		
		Set<Map.Entry<String,String>>s=hm.entrySet();
		
		Iterator<Map.Entry<String,String>> itr=s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String,String> mp=itr.next();
			System.out.println(mp.getKey()+":"+mp.getValue());
			
			//System.out.println(itr.next());
		}
		
		
	}

}
