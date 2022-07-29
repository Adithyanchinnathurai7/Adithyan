package adiproject;

import java.util.HashMap;
import java.util.Set;

public class TreeMapptc1
{

	public static void main(String[] args)
	{
		HashMap<String, String> hp=new HashMap<String, String>();
		hp.put("101","Arun");
		hp.put("102","Balu");
		hp.put("103","Cherry");
		hp.put("104","Davan");
		hp.put("105","Elango");
		hp.put("106","Frado");
		hp.put("107","Gemini");
		hp.put("108","Saro");
		hp.put("109","Yash");
		
		
		
		
		
		System.out.println(hp);
		
		System.out.println(hp.get("105"));
		
		System.out.println(hp);
		
		String key5=new String("105");
		
		hp.put(key5, "Essar");
		
		System.out.println(hp);
		
		String key8=new String("108");
		hp.put( key8,"Saaago");
		
		System.out.println(hp);
		
		
		
		
		
	}

}
