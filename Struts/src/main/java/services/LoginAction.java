package services;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbpack.DBConn;
import dtopack.UserDTO;

public class LoginAction extends Action {
	
	private UserDTO userDTO;
	private DBConn dbconn;
	
	
	public UserDTO getUserDTO() {
		return userDTO;
	}
	public DBConn getDbconn() {
		return dbconn;
	}

	public void setDbconn(DBConn dbconn) {
		this.dbconn = dbconn;
	}

		

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) 
	{
		dbconn = new DBConn();
		userDTO = new UserDTO();
		
		userDTO.setUname(request.getParameter("uname"));
		userDTO.setUpass(request.getParameter("upass"));
		
		boolean user = dbconn.checkUser(userDTO.getUname(), userDTO.getUpass());
		if (user) 
		{
			boolean valid = dbconn.checkFlag(userDTO.getUname());
			if (valid) 
			{
				dbconn.updateFlag(userDTO.getUname(), 1);
				request.getSession().setAttribute("uname", userDTO.getUname());
				return "login.welcome";
			} 
			else 
				
			{
				return "login.alreadylogedin";
			}
		}
		else 
		{
			return "login.invaliduser";
		}
	}
}
