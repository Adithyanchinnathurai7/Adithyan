package com.example.demo;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/mycr")
public class Mycontroller {
	
	@Autowired	
	private StudentService service;
	
	
	public StudentService getService() {
		return service;
	}


	public void setService(StudentService service) {
		this.service = service;
	}

	@RequestMapping(method=RequestMethod.GET,value="/create")
	public void create() {
		System.out.println("saving student object..");
		Students students=new Students();
		students.setSid(101);
		students.setSname("Aadithyan");
		students.setSage(20);
		students.setScity("chennai");
		service.saveStudents(students);
		System.out.println(" student object  saved....");
	}
	@RequestMapping(method = RequestMethod.GET,value="/city")
	public void displayStudent(@RequestParam("city")  String city) {
		List<Students> list=service.getStudents(city);
		System.out.println("Student list........."+list);
		Iterator<Students> iter=list.iterator();
		while(iter.hasNext()) {
			Students str=(Students)iter.next();
			System.out.println("Student...."+iter);
			System.out.println(str.getSname()+"..."+str.getScity());
		}
	}
		
		
		@RequestMapping(method = RequestMethod.GET,value="/age")
		public void displayage(@RequestParam("age")  int age) {
			List<Students> list=service.getage(age);
			System.out.println("Student list........."+list);
			Iterator<Students> iter=list.iterator();
			while(iter.hasNext()) {
				Students str=(Students)iter.next();
				System.out.println("Student...."+iter);
				System.out.println(str.getSid()+"..."+str.getSage());
			}
		
	}
		@RequestMapping(method = RequestMethod.GET,value="/do")
	public ModelAndView met2(@RequestParam("city") String city,HttpServletRequest request) {
			
			ModelAndView mv=new ModelAndView();
			request.getParameter(city);
			List<Students> l=service.getcity(city);
			
			Iterator<Students> itr=l.iterator();
			
			System.out.println(l);
			
			String s="";
			
			while(itr.hasNext()) {
				
				String ss=itr.next().getScity();
				
				if(ss!=null) {
					
					s=s+","+ss;
					
				}
				
				System.out.println(ss);
				
			}
			
			System.out.println(s);
			
			request.setAttribute("gnames", s);
			
			mv.setViewName("njsp");
			
			return mv;
			
		}
}