package mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller//replace Action servlet..
@RequestMapping("/bs")//class access url.....given browser....
public class BasicController 
{
	@RequestMapping(method=RequestMethod.GET,value="/hello")//method access url using Requestmapping
	private void sayHello() {
		System.out.println("say hello method...");

	}
	@RequestMapping(method=RequestMethod.GET,value="/hello2")
	private void sayHello2(@RequestParam("name")String uname,@RequestParam("pass")String upass) {
		System.out.println("say hello method.."+uname+" "+upass);

	}
	@RequestMapping(method = RequestMethod.GET, value = "/hello3/{myp}")//
	public void sayHello3(@PathVariable("myp") String mypath) {
		System.out.println("say hello method...."+mypath);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/hello4/{myp}/{myw}")
	public void sayHello3(@PathVariable("myp") String mypath,@PathVariable("myw") String mywife) {
		System.out.println("say hello method...."+mypath+":"+mywife);
	}
	
	
	
}
