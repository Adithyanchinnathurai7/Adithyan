package iotestbook;

import java.io.File;

public class Io1st 
{
	
	public static void main(String[] args) 
	{
		
		File F1=new File("iofile.txt");
		
		p("file name"+F1.getName());
		p("path:"+F1.getPath());
		p(F1.exists()?"exists":"dost not exist");
		p(F1.canWrite()?"is writable":"is not writable");
		p(F1.isDirectory()?"is a dir":"is not a directory");
		
		
	}
	static void p(String s)
	{
		System.out.println(s);
	}
}
