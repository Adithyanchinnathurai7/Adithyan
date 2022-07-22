package test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import com.mysql.cj.protocol.a.ByteArrayValueEncoder;

public class JackandJill
{

	public static void main(String[] args) throws Exception 
	{
		String str = "jack @amp; jill went up the @amp hill";
		ByteArrayInputStream byar = new ByteArrayInputStream(str.getBytes());
		BufferedReader bf = new BufferedReader(new InputStreamReader(byar));
		int n = 0;
		boolean mark = false;
		while ((n = bf.read()) != -1)
		{
			char c = (char) n;
			switch (c)
			{
				case '@': 
				{
					bf.mark(32);
					mark = true;
					break;
				}
				case ';': 
				{
					System.out.print("&");
					mark=false;
					break;
				}
				case ' ': 
				{
					if(mark)
					{
						bf.reset();
						System.out.print("@");
						mark=false;
					}
					else
					{
						System.out.print(" ");
					}
					break;
				}
				default: 
				{
				if (!mark) 
				{

					System.out.print(c);
				}
				}
			}
		}
	}

}
