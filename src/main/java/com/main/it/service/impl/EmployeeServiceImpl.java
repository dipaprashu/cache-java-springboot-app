package com.main.it.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.it.model.Employee;
import com.main.it.repository.EmployeeRepository;
import com.main.it.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	@Cacheable(value = "employees", key = "#id", condition="#id!=null")
	public Optional<Employee> getEmployeeById(Long id) {
		Optional<Employee> optEmployee = employeeRepository.findById(id);
		if (optEmployee.isPresent()) {
			return optEmployee;
		}
		return Optional.empty();
	}

	@Override
	@CachePut(cacheNames = "employees", key = "#employee.id" , condition="#employee!=null")
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

}
