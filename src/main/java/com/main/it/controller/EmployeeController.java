package com.main.it.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.it.model.Employee;
import com.main.it.service.EmployeeService;

@RestController
@RequestMapping("/v1")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable("id") Long id){
		return employeeService.getEmployeeById(id);
	}
	
	@PostMapping("/employee")
	public void saveEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
	}
	
	@PutMapping("/employee")
	public Employee saveOrUpdateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

}
