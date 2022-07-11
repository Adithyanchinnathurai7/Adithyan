package util;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;



public class OldPrintmethod {

	public static void main(String[] args) {
		Properties pro=new Properties();
		
		pro.put("d1", "maniranthnam");
		pro.put("d2", "vetrimaaran");
		pro.put("d3", "karthicsubr");
		pro.put("d3", "lokeshkr");
		
		
		System.out.println(pro);
		
		System.out.println(pro.get("d2"));
		
		Set i= pro.entrySet();
		
		Iterator itr=i.iterator();
		
		while(itr.hasNext()) {
			Map.Entry hs=(Map.Entry)itr.next();
			System.out.println(hs.getKey()+":"+hs.getValue());
		}
	}
}