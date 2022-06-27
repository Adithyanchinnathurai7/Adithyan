package util;

import java.util.Iterator;
import java.util.Stack;

public class Stacktest
{

	public static void main(String[] args) 
	{
		Stack<Integer> st=new Stack<>();
		st.push(100);
	    st.push(200);
	    st.push(300);
	    st.push(400);
	    st.push(500);
	    
	    System.out.println("elements in stack: " + st);
	    // remove element
	    int del = st.pop();
	    System.out.println("element removed  stack " + del);
	    
	    del = st.pop();
	    System.out.println("element removed  stack " + del);
	    
	    //search
	    System.out.println(" element 20 using search method: " + st.search(20));
	    System.out.println(" element 30 using search method: " + st.search(30));
	    
	    System.out.println("element returned using the peek() method: " + st.peek());
	    
	    Iterator<Integer> i = st.iterator();
	    while(i.hasNext())
	      System.out.println(i.next());
	    
	  }
	
	 
	

}
