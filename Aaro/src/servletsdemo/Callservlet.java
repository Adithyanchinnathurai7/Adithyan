package servletsdemo;

import java.net.URL;
import java.net.URLConnection;
public class Callservlet {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:8080/anoud/*.do");
		URLConnection urlcon = url.openConnection();
		urlcon.getInputStream();
		
		
		
	}
}
