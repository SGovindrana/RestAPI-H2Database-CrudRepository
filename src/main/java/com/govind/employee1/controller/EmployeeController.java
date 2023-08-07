package com.govind.employee1.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.govind.employee1.bean.Employee;
import com.govind.employee1.service.EmployeeService;



@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employees")
	public Iterable<Employee> getEmployees() {
		
		return employeeService.getEmployees();   
	}
    @PostMapping("/employees/save")
    public String saveEmployee() {
    	return employeeService.saveEmployee(new Employee(1, "Rohan", 26));
    }
    @PostMapping("/employees/saveList")
    public String saveEmployeeList() {
    	Iterable<Employee> emp = Arrays.asList( 
	         	new Employee(1, "Amitabh", 20), 
	         	new Employee(2, "Ayush", 30),
	        	new Employee(3, "Amitoh", 40),
	        	new Employee(4, "AKhil", 40),
	        	new Employee(5, "Amitnath", 40));
    	return employeeService.saveEmployeeList(emp);
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable("id") int id) {
 
    	return employeeService.getEmployee(id); 
    	}

    @GetMapping("/employees/name/{name}") 
    public List<Employee> getEmployee(@PathVariable("name") String name) {
    	
    	return employeeService.getEmployee(name); 
    	
    	}

// build.gradle // This is gradle build project
//runtimeOnly 'com.h2database:h2' 

	
}
