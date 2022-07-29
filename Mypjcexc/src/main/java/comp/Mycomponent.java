package comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import service.Myservice;
@Component("mycompo")
public class Mycomponent 
{
	@Autowired
	private Myservice mys;

	public Myservice getMys() {
		return mys;
	}

	public void setMys(Myservice mys) {
		this.mys = mys;
	}
	
	public void compt() {
		System.out.println("component called...");
		mys.service();
		
	}
}
