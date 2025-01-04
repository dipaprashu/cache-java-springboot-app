package com.main.it.repository;

import org.springframework.data.repository.CrudRepository;

import com.main.it.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
