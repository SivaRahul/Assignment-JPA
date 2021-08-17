package com.ecommerce.rahul.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.rahul.model.Employee;
import com.ecommerce.rahul.repository.EmployeeRepository;

@Service
public class EmployeeService {
	  @Autowired
	  private EmployeeRepository repository;
	
	  public Employee getEmployeeById(int id) {
	    return repository.findById(id).get();
	  }
	
	  public List<Employee> getAllEmployees(){
	    return repository.findAll();
	  }
	
	  public void deleteEmployeeById(int id){
	    repository.deleteById(id);
	  }
	
	  public Employee addEmployee(Employee emp) {
	    return repository.save(emp);
	  }
	  
	  public List<Employee> getEmployeeByFirstName(String firstName) {
		    return repository.findByFirstName(firstName);
		  }
	
	  public List<Employee> getEmployeeByLastName(String lastName) {
	    return repository.findByLastName(lastName);
	  }
	  
	  public List<Employee> getEmployeeByAgeGreaterThanEqual(int age) {
		    return repository.findByAgeGreaterThanEqual(age);
	  }
	  public List<Employee> getEmployeeBySalaryGreaterThanEqual(int salary) {
		    return repository.findBySalaryGreaterThanEqual(salary);
	  }
	  

}
