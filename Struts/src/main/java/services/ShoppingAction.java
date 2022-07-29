package services;

import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class ShoppingAction extends Action {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		Enumeration en=request.getParameterNames();
		HttpSession session=request.getSession();
		String nextshop=request.getParameter("shop");
		while(en.hasMoreElements()) {
			String name=en.nextElement().toString();
			String value=request.getParameter(name);
			session.setAttribute(name, value);
		}
		
		return nextshop;
	}
}