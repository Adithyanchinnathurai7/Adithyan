package util;

import java.util.StringTokenizer;

public class StringTockenex {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("super good good");
		while (st.hasMoreTokens()) 
		{
			//String s=st.nextToken(); 
			System.out.println(st.nextToken());
			//System.out.println(st.countTokens());
			
		}
	}

}
	