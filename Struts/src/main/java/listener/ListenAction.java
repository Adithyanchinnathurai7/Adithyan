package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import dbpack.DBConn;
@WebListener
public class ListenAction implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent se)  {
    	
         System.out.println("sessioncreated........");
    }
    public void sessionDestroyed(HttpSessionEvent se)  {
    	DBConn db=new DBConn();
    	
    	HttpSession hs=se.getSession();
    	
    	Object obj=hs.getAttribute("uname");
    	
    	if(obj!=null) {
    		
    		String name=obj.toString();
    	
    	db.updateFlag(name, 0);
    	
    	}
        System.out.println("session deleted");
    }
	
}