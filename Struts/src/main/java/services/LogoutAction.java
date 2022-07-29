package services;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbpack.DBConn;


public class LogoutAction extends Action{
	
	public LogoutAction() {
		
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		String uname=request.getSession().getAttribute("uname").toString();
		
		DBConn con=new DBConn();
		
		boolean don=con.updateFlag(uname, 0);
		
		if(don) {
			
			return "logout.Success";
			
		}else {
		
		return "logout.Fail";
		
		}
		
	}

}


