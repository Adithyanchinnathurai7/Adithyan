package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoRepository extends JpaRepository<Dtouser, Integer> {
	
	
	@Query("from Dtouser order by userid Asc")
	public List<Dtouser> checkUid();
		
	@Query("from Dtouser where username=?1 and password=?2")
	public List<Dtouser> checkUser(String usname,String passwd);
	
	
	

}
