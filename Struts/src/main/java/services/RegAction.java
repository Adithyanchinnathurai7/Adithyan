package services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbpack.DBConn;
import dtopack.UserDTO;

public class RegAction extends Action {	
		
		private UserDTO user;
		
		private DBConn con;
		public UserDTO getUser() {
			return user;
		}
		public void setUser(UserDTO user) {
			this.user = user;
		}
		public DBConn getCon() {
			return con;
		}
		public void setCon(DBConn con) {
			this.con = con;
		}
		@Override
		public String execute(HttpServletRequest request, HttpServletResponse response) {
			
			user=new UserDTO();
			
			con=new DBConn();
			
			user.setUname(request.getParameter("uname"));
			
			user.setUpass(request.getParameter("upass"));
			
			
			boolean a=con.registerUser(user);
			
			if(a) {
					
					return "logout.Success";
					
				}
				
			else {
			
			return "Logout.Fail";
			
			}
		
	}
}
