package iopack;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderDemo1 
{

	public static void main(String[] args) 
	{
		
		File file1=new File("filedemo.txt");
		
		System.out.println(file1.getAbsoluteFile());
		
		System.out.println(file1.canExecute());
		
		System.out.println(file1.exists());
		
		//try with resources here
		
		try
		{
			FileReader f1=new FileReader(file1);
			FileWriter f2=new FileWriter("newfile.txt");
			
			char[] b= new char[4];
			int byteread=0;
			while((byteread=f1.read(b))!=-1)
			{
				//String s=new String(b,0,byteread);
				f2.write(b, 0, byteread);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();

		}
	}

}
