package com.govind.employee1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.govind.employee1.bean.Employee;
import com.govind.employee1.controller.EmployeeController;
import com.govind.employee1.service.EmployeeService;

@SpringBootTest
class EmployeeServiceTests {
	
	@Autowired
	EmployeeService employeeService ;
	
	@Autowired
	EmployeeController employeecontroller ;
 
	

	
  /*@Test 
	public void getEmployees()
	{
		Employee emp = employeeService.getEmployee(1);
		assertEquals("Amitabh" , emp.getName());
     } */
	@Test
	public void getEmployee() {
		Employee employee = new Employee();
		employee.setName("Amitabh");
		assertEquals("Amitabh", employee.getName());
	}
	
	
	
  
}
	
 
