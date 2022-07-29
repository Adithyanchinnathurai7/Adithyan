package adiproject;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetOdering {

	public static void main(String[] args) {
		Set<Object> ts=new TreeSet<Object>();
		ts.add(new A("gost"));
		ts.add(new A("hellboy"));
		ts.add(new A("batman"));
		System.out.println(ts);
	}
}
class MyComparator implements Comparator<A>{
	@Override
	public int compare(A o1, A o2) {
		
		return o1.compareTo(o2);
	}
}
class A implements Comparable<A>{
	public A(String name) {
		this.name=name;
	}
	String name;
	@Override
	public int compareTo(A s) {
		System.out.println(s);
				return name.compareTo(s.name);
				
				
	}
	
}









