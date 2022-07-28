package iopack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FilereadDemo
{

	public static void main(String[] args) throws FileNotFoundException
	{
		
		try (FileInputStream file= new FileInputStream("filedemo.txt");)
		{
		
			
			
			//System.out.println(file.available());
		
			System.out.println(file.read());
//			System.out.println(file.read());
//			System.out.println(file.read());
//			System.out.println(file.read());
//			System.out.println(file.read());
//			System.out.println(file.read());
//			System.out.println(file.read());
//			System.out.println(file.read());
//			System.out.println(file.read());
//			System.out.println(file.read());
			
			
//			System.out.println((char)file.read());
//			System.out.println((char)file.read());
//			System.out.println((char)file.read());
//			System.out.println((char)file.read());
//			System.out.println((char)file.read());
//			
//			int available=file.available();
//			byte b[]=new byte[4];
//		
//			file.read(b);
//			System.out.println(available);
//			System.out.println(file.available());
//			
//			String s=new String(b,0,available);
//			System.out.println(s);
//			
//
//			byte b[]=new byte[4];
//			int noofbytesread=0;
//			while((noofbytesread=file.read(b))!=-1)
//			{
//				System.out.println(noofbytesread);
//				String s=new String(b,0,noofbytesread);
//				System.out.println(s);
//		
//			}
		}
			
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		
		
	}	
	

}


