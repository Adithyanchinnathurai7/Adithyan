package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentService {
	@Autowired
	private StudentDAO sdao;

	public StudentDAO getSdao() {
		return sdao;
	}

	public void setSdao(StudentDAO sdao) {
		this.sdao = sdao;
	}
	public void saveStudents(Students students) {
		getSdao().save(students);
		
	}
	public List<Students> getStudents(String name){
		 return getSdao().findByScity(name);
	 }
	 public List<Students> getage(int age){
		 return getSdao().findBySageGreaterThan(age);
	 }
	 public List<Students> getcity(String name){
		return getSdao().findByScitySorted(name);
		
	 }
}