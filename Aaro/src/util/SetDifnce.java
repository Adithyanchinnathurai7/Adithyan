package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class SetDifnce
{

	public static void main(String[] args)
	{
		List<Student>list=new ArrayList<Student>();
		list.add(new Student("Kavi"));
		list.add(new Student("Mano"));
		list.add(new Student("Raju"));
		list.add(new Student("Xero"));
		list.add(new  Student("Aadi"));
		list.add(new  Student("Aadi"));
		
		System.out.println("Normal list");
		System.out.println("****************************");
		
		System.out.println(list+"\n");//Normal list
		
		System.out.println("Using collections sort method");
		System.out.println("********************************");
		
		Collections.sort(list);//Only Odering Assending using sort method
		
		System.out.println(list+"\n");
		System.out.println("Hashset using");
		System.out.println("***********************");
		
		HashSet<Student> hs=new HashSet<Student>(list);
		
		System.out.println(hs+"\n");
		
		System.out.println("Treeset using");
		System.out.println("***********************");
		
		TreeSet<Student> ts=new TreeSet<Student>(new MyCom());
		ts.addAll(hs);
		System.out.println(ts);
		
		
	}
}

class MyCom implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.compareTo(o1);
	}
	
}
	class Student implements Comparable<Student>
	{
		String name;
		public Student(String name) 
		{
			this.name=name;
		}@Override
		public String toString() 
		{
			
			return this.name;
		}
		@Override
		public int compareTo(Student o) {
			
			return this.name.compareTo(o.name);
		}
		
		
	}
