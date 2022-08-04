package com.example.demo;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ServiceTest {
	
	@Autowired
	private DaoRepository daoRepository;
	
	
	
	public DaoRepository getDaoRepository() {
		return daoRepository;
	}



	public void setDaoRepository(DaoRepository daoRepository) {
		this.daoRepository = daoRepository;
	}



	public void saveDto(Dtouser dtouser) {
		getDaoRepository().save(dtouser);
		
	}
	
	
	public int checkUid(Dtouser dtouser)
	{
		
		List<Dtouser> a = getDaoRepository().checkUid();
		Iterator<Dtouser> itr=a.iterator();
		int b=0;
		while(itr.hasNext())
		{
			Dtouser sto=itr.next();
			b=sto.getFlag();
		}
		
		return b;
		
	}
	
	
	public List<Dtouser> checkUser(String usname,String passwd)
	{
		return getDaoRepository().checkUser(usname, passwd);
		
	}
	
	public void setFlag(String usname,String passwd,int a)	
	{
		
		List<Dtouser> dto=getDaoRepository().checkUser(usname, passwd);
		Iterator<Dtouser> itr=dto.iterator();
		while(itr.hasNext()) {
			Dtouser dtouser=itr.next();
			dtouser.setFlag(a);
			getDaoRepository().save(dtouser);
			
		}
		
		
	}
	
}













