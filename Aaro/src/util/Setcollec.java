package util;
import java.util.*;
import java.util.function.Consumer;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Set;
//import java.util.function.Consumer;

public class Setcollec 
{

	public static void main(String[] args) 
	{
		Set<String>st=new HashSet<String>();
		st.add("aaro");
		st.add("bodhidmr");
		st.add("dongli");
		st.add("daamu");
//		
		//System.out.println(st);
	}
}
//		
//		st.remove("bodhidmr");
//		
//		System.out.println(st.size());
//		System.out.println(st);
//		
//		System.out.println(st.isEmpty());
//		
//		System.out.println(st.isEmpty());
//		st.add("dom");
//		System.out.println(st);
//		
//		System.out.println(st.contains("dongli"));
//		
		//st.forEach(System.out::println);
		//st.forEach( new MyConsum());
		//st.forEach((s)->{System.out.println(s);});
		//st.forEach(System.out::println);
		//st.forEach(Setcollec::print);
		
//		Iterator<String> it=st.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//	}
//	
//	static void print(String s) {
//		System.out.println(s);
//	}
//		

//}
class MyConsum implements Consumer<String>
{
	@Override
	public void accept(String t) 
	{
		System.out.println(t);
		
	}
}
//}