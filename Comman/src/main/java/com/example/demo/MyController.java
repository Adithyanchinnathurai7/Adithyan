package com.example.demo;

import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/shopping")
public class MyController {
	
	@Autowired
	private ServiceTest servicetest;

	public ServiceTest getServicetest() {
		return servicetest;
	}

	public void setServicetest(ServiceTest servicetest) {
		this.servicetest = servicetest;
	}
	
	
	@RequestMapping(method = RequestMethod.GET,value="/reg")
	public ModelAndView loadReg(Dtouser dtouser) {
		
		ModelAndView mv= new ModelAndView();
		
		mv.addObject("obj", dtouser);
		mv.setViewName("register");		
		return mv;
		
	}
	
	
	@RequestMapping(method = RequestMethod.POST,value="/reg")
	public ModelAndView process(@ModelAttribute("obj") Dtouser dtouser,HttpServletRequest request) {
		
		ModelAndView mv= new ModelAndView();
		
		if(dtouser.getPassword().equals(request.getParameter("password2"))) {
		
		mv.addObject("obj", dtouser);
		dtouser.setFlag(0);
		dtouser.setUserid(getServicetest().checkUid());
		getServicetest().saveDto(dtouser);
		mv.setViewName("login");		
		return mv;
		}else {
			
			mv.setViewName("register");		
			return mv;
		}
		
	}
	
	@RequestMapping(method = RequestMethod.GET,value="/log")
	public String loadlog(Dtouser dtouser) {
		
		return "login";
		
	}
	
	
	@RequestMapping(method = RequestMethod.POST,value="/log")
	public ModelAndView processlog(HttpServletRequest request,Dtouser dtouser1) {
		
		
		ModelAndView mv= new ModelAndView();
		
	String name=request.getParameter("username");
	String pass=request.getParameter("password");
	
	List<Dtouser> lis=getServicetest().checkUser(name, pass);
	Iterator<Dtouser> tr=lis.iterator();
	
	while(tr.hasNext()) {
		request.setAttribute("name", name);
		request.setAttribute("pass", pass);
		Dtouser dto2=tr.next();
		if(dto2.getFlag()==0) {
			
		getServicetest().setFlag(name, pass, 1);
			
		mv.setViewName("welcome");
		
		return mv;
		}else {
			
		mv.setViewName("logout");
		return mv;
		}
	}
		
		mv.addObject("obj",dtouser1);
		
		mv.setViewName("register");
		
		return mv;
		
	}
	
	@RequestMapping(method = RequestMethod.GET,value="/logout")
	public String logout(HttpServletRequest request) {
		
		getServicetest().setFlag(request.getParameter("name"),request.getParameter("pass"),0);
		
		return "login";
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/shops")
	public String shop(HttpServletRequest request) {
		
		Enumeration<String> emnu=request.getParameterNames();
		
		HttpSession h=request.getSession();
		
		while(emnu.hasMoreElements()) {
			
			String a=emnu.nextElement().toString();
			String b=request.getParameter(a);
			h.setAttribute(a, b);
			
			
		}
		return request.getParameter("shop");
		
	
		
	}
	
	@RequestMapping("/img")
	public void getimg(HttpServletRequest request,HttpServletResponse response) {
	
		String a=request.getParameter("shop");
		String b=request.getParameter("value");
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","Root");
			String sql="select * from "+a+" where name=?";
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, b);
			
			ResultSet re=st.executeQuery();
			while(re.next()) {
			
				byte[] by=re.getBytes(3);
				OutputStream op=response.getOutputStream();
				op.write(by);
				op.flush();
				op.close();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
	
	
	
	
	
	

}
