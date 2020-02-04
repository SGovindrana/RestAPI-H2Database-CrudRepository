package com.govind.employee1.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

@SpringBootTest

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class EmployeeControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	
		
	

	@Test
	public void EmployeeTestById() throws Exception {
		ResultActions resultActions = mvc.perform(get("/employees/1"));
		resultActions.andExpect(status().isOk());
		resultActions.andExpect(jsonPath("$.id").exists());
		resultActions.andExpect(jsonPath("$.name").value("Amitabh"));
	}

}
