package iopack;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderDemo 
{

	public static void main(String[] args) 
	{
		File file= new File("filedemo.txt");
		
		System.out.println( file.getAbsoluteFile());
		System.out.println(file.canExecute());
		System.out.println(file.exists());
		
		FileReader fl=null;
		FileWriter fel=null;
		try
		{
			fl=new FileReader(file);
			fel=new FileWriter("newfile.txt");
			
			char [] b=new char[4];
			int byteread=0;
			while((byteread=fl.read(b))!=-1)
			{
				
				fel.write(b, 0, byteread);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fel.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
