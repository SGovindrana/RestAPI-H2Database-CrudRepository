package com.govind.employee1.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.govind.employee1.bean.Employee;
import com.govind.employee1.dao.EmployeeDao;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
    
	public Iterable<Employee> getEmployees(){
		
		return employeeDao.findAll();
	    }
	
	public String saveEmployee(Employee emp) {
		employeeDao.save(emp);
		return "Data Saved Successfully";
	}
	
	public String saveEmployeeList(Iterable<Employee> emp) {
		employeeDao.saveAll(emp);
		return "Data Saved Successfully";
	}
	public Employee getEmployee(int id) {
	
		List<Employee> emp = (List<Employee>) employeeDao.findAll();
		
		return emp.stream().filter(t -> t.getId() == id).findFirst().get(); 
	 }
	 
	public List<Employee> getEmployee(String name){
	
		List<Employee> emp = (List<Employee>) employeeDao.findAll();
		List<Employee> FilteredList = emp.stream().filter(e->e.getName().contains(name)).collect(Collectors.toList());
		return FilteredList ; 
	}
	
}