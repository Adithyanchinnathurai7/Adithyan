package test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketDemo 
{

	public static void main(String[] args) 
	{
		
			new Server();
	}
//Socket and ServerSocket classes are used for connection-oriented socket programming , 
//DatagramSocket and DatagramPacket classes are used for connection-less socket programming.
}
class Server
{
	ServerSocket server;
	Socket client;
	public Server() 
	{
		try
		{
			server=new ServerSocket(4000);
			while(true) {
			System.out.println("Server ready to accepted");
			client=server.accept();			
			System.out.println(client);
			
			
			PrintStream out=new PrintStream(client.getOutputStream(),true);		
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("please enter a msg to client..:");
			String msgtoclnt=in.readLine();	
			
				
			out.println(msgtoclnt);
			
			BufferedReader bis=new BufferedReader(new InputStreamReader(client.getInputStream()));
			String msgfrmclnt=bis.readLine();
			System.out.println("msg frm Client  :"+msgfrmclnt);
			
			
		
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Server();
	}
}
class Client
{

	
	Socket client;
	public Client() 
	{
		try
		{
			
			client=new Socket("localhost",4000);
			while(true) {
			BufferedReader bis=new BufferedReader(new InputStreamReader(client.getInputStream()));
			String msgfrmsvr=bis.readLine();
			System.out.println("msg frm server  :"+msgfrmsvr);
			
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("please enter a msg to Server..:");
			String msgtosrvr=in.readLine();
			
			PrintStream out=new PrintStream(client.getOutputStream(),true);
			out.print(msgtosrvr);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Client();
	}
}