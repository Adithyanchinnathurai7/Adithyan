package com.example.demo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends JpaRepository<Students,Integer> {
	
	public List<Students> findByScity(String city);
	public List<Students> findBySageGreaterThan(int age);
	
	
	@Query("from Students where scity=?1 order by sname")
	public List<Students> findByScitySorted(String city);
}
