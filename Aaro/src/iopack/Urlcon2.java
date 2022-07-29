package iopack;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Urlcon2
{

	public static void main(String[] args) throws Exception 
	{
		URLConnection urlcon=null;
		//urlcon.getInputStream();
		try
		{
			URL url=new URL("https://www.google.com/index.html");
			urlcon=url.openConnection();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		try(
				BufferedInputStream bfr=new BufferedInputStream(urlcon.getInputStream());
				FileOutputStream fos=new FileOutputStream("newfilebyte.html");
				)
		{
			byte[] b=new byte[128];
			int bytesread=0;
			while((bytesread=bfr.read(b))!=-1)
			{
				//String s=new String(b,0,bytesread);
				
				fos.write(b,0,bytesread);
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
