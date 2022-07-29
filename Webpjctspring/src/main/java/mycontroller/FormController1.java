package mycontroller;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({"form1"})
public class FormController1 {
	@Autowired
	MessageSource messageSource; 
	
	@RequestMapping(method=RequestMethod.GET,value="/register")
	public ModelAndView loadForm() {
		ModelAndView mandv= new ModelAndView();
		mandv.addObject("userobj",new User());
		mandv.setViewName("userform");
		return mandv;

	}
	@RequestMapping(method=RequestMethod.POST,value="/register")
	public ModelAndView processForm(@Valid@ModelAttribute("userobj") User user,BindingResult result) {
		ModelAndView mandv=new ModelAndView();
		
		if(result.hasErrors())
		{
			mandv.setViewName("userform");
			//FieldError customError=new FieldError("userobj", "uname", MessageSource.getMessage("mymessage",null,new Local("ta")));
			//result.addError(customError);	
			 return mandv;
		}
		else {
		System.out.println("Username...."+user.getUname());
		user.setUname(user.getUname()+"Anoud technologie..");
		
		mandv.addObject("myuser", user);
		mandv.setViewName("welcome");
		return mandv;
		}
	}

}
