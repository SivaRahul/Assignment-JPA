package com.ecommerce.rahul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.ecommerce.rahul.model.Employee;
import com.ecommerce.rahul.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	  @Autowired
	  EmployeeService empService;
	
	  @GetMapping("/{id}")
	  public Employee getEmployeeById(@PathVariable int id) {
	    return empService.getEmployeeById(id);
	  }
	
	  @GetMapping
	  public List<Employee> getAllEmployees(){
	    return empService.getAllEmployees();
	  }
	
	  @DeleteMapping("/{id}")
	  @ResponseStatus(HttpStatus.OK)
	  public void deleteEmployeeById(@PathVariable ("id") int id){
	    empService.deleteEmployeeById(id);
	  }
	  @PostMapping
	  @ResponseStatus(HttpStatus.CREATED)
	  public Employee addEmployee(@RequestBody Employee emp) {
	    return empService.addEmployee(emp);
	  }
	  @GetMapping("/lastname/{lastName}")
	  public List<Employee> getEmployeeByLastName(@PathVariable ("lastName") String lastName) {
	    return empService.getEmployeeByLastName(lastName);
	  }
	  @GetMapping("/firstname/{firstName}")
	  public List<Employee> getEmployeeByFirstName(@PathVariable ("firstName") String firstName) {
	    return empService.getEmployeeByFirstName(firstName);
	  }
	  @GetMapping("/age/{age}")
	  public List<Employee> getEmployeeByAgeGreaterThanEqual(@PathVariable ("age") int age) {
		    return empService.getEmployeeByAgeGreaterThanEqual(age);
	  }
	  @GetMapping("/salary/{salary}")
	  public List<Employee> getEmployeeBySalaryGreaterThanEqual(@PathVariable ("salary") int salary) {
		    return empService.getEmployeeBySalaryGreaterThanEqual(salary);
	  }
}