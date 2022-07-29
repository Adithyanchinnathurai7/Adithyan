package mycontroller;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@XmlRootElement
class Employee {
	private int empid;
	private String empname;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}
}
@Repository
class EmployeeRepo {
	public Employee retrive(int eid) {
		Employee emp = new Employee();
		emp.setEmpid(eid);
		emp.setEmpname("ajith");
		return emp;
	}

	public List<Employee> getAll() {
		Employee emp = new Employee();
		emp.setEmpid(101);
		emp.setEmpname("ajith");

		Employee emp1 = new Employee();
		emp1.setEmpid(102);
		emp1.setEmpname("aadi");

		List<Employee> list = new ArrayList<>();
		list.add(emp);
		list.add(emp1);

		return list;
	}

	public void store(Employee emp) {
		System.out.println("employee stored....");

	}

	public Employee search(String name) {
		Employee emp = new Employee();
		emp.setEmpid(101);
		emp.setEmpname("ajith");
		return emp;

	}

	public Employee delete(int id) {
		System.out.println("deleted....");
		return new Employee();
	}
}

@RestController
public class MyRestController 
{
	@Autowired
	EmployeeRepo repository;
	
	@GetMapping("/rest/employee/get/{id}")
	public Employee getEmployeeByID(@PathVariable("id")int id) {
		return repository.retrive(id);

	}
	@GetMapping("rest/employee/getAll")
	
	public List<Employee> getAllEmployees() {
		return repository.getAll();

	}
	@PostMapping("/rest/employee/create")
	public Employee createEmployee(@RequestBody Employee emp) {
	repository.store(emp);
	return emp;
		
	}
	
	@GetMapping("/rest/employee/search/{name}")
	public Employee getEmployeeByName(@PathVariable("name") String name) {
		return repository.search(name);
	}

	@DeleteMapping("/rest/employee/delete/{id}")
	public Employee deleteEmployeeByID(@PathVariable("id") int id) {
		return repository.delete(id);
	}
}


























