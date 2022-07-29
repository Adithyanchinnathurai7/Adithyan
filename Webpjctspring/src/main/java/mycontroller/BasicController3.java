package mycontroller;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bs3")
@SessionAttributes({"myobj"})//session goes to jsp file then get session obj
public class BasicController3 
{
	@RequestMapping(method=RequestMethod.GET,value="/hello1")
	public String seyHello() {
		return "home";//view
	}
	

	
	@RequestMapping(method=RequestMethod.GET,value="/hello2")
	public ModelAndView  msThod() 
	{
		ModelAndView mdav=new ModelAndView();//model and view obj...creation...
		mdav.addObject("myobj", "this is a obj value");//model
		mdav.setViewName("home");						//view
		return mdav;

	}
	@RequestMapping(method=RequestMethod.GET,value="/hello3")
	public String mod(Model model) {
		model.addAttribute("myobj","this from hello1......");//model
		return "home";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/hello4")
	public String modd(HttpServletRequest request,Model model)
	{
		 request.setAttribute("myobj","this is request added value");//request
		 model.addAttribute("myobj","this is session value added in hello1");//model...
		return "home";
	}
}

