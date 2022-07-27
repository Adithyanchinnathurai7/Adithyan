package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Mydao;
@Service
public class Myservice 
{
	@Autowired
	private Mydao myd;

	public Mydao getMyd() {
		return myd;
	}

	public void setMyd(Mydao myd) {
		this.myd = myd;
	}
	
	public void service() 
	{
		System.out.println("service calle..");
		myd.dao();
	}
}
