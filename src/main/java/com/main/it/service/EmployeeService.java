package com.main.it.service;

import java.util.Optional;

import com.main.it.model.Employee;

public interface EmployeeService {

	public Optional<Employee> getEmployeeById(Long id);

	public Employee updateEmployee(Employee employee);

	public void saveEmployee(Employee employee);

}
