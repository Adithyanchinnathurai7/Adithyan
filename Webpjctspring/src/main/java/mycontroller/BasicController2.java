package mycontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

@RequestMapping("/bs2")

public class BasicController2 {

	@RequestMapping(method = RequestMethod.GET, value = "/helloo")

	public void sayHelloe(HttpServletRequest request) {

		System.out.println("say hello method..." + request);

		HttpSession session = request.getSession();

		System.out.println("session..:" + session.getId());

		session.setAttribute("mykey", "this is mykey  value");

		String str = session.getAttribute("mykey").toString();

		System.out.println("value..." + str);

	}

	@RequestMapping(method = RequestMethod.GET, value = "/helloo2")

	public void sayHelloee(HttpSession session) {

		System.out.println("session2..:" + session.getId());

		String str = session.getAttribute("mykey").toString();

		System.out.println("value2..." + str);

	}
	
	
}
