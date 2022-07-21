package test;

import java.net.ServerSocket;
import java.net.Socket;

public class SocketDemo 
{

	public static void main(String[] args) 
	{
		
			new Server();
	}

}
class Server
{
	ServerSocket server;
	Socket client;
	public Server() 
	{
		try
		{
			server=new ServerSocket(2000);
			System.out.println("Server ready to accepted");
			client=server.accept();
			
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
			client=new Socket("localhost",2000);
			
			
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