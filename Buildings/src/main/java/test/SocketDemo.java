package test;

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
			server=new ServerSocket(3000);
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
			client=new Socket("localhost",3000);
			
			
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