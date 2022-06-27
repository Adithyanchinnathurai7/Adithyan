package iopack;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Urlcon 
{

	public static void main(String[] args)
	{
		URLConnection urlcon=null;
		try	 
		{
			URL url=new URL("http://www.google.com/index.html");
			urlcon=url.openConnection();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		try (BufferedReader f1=new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
				FileWriter f2=new FileWriter("newfile.html");)
		{
			char[] b=new char[128];
			int bytesread=0;
			while((bytesread=f1.read(b))!=-1) 
			{
				//String s=new String(b,0,bytesread);
				f2.write(b, 0, bytesread);
			}
			
		}
			catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
