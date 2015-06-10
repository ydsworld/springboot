package com.ydsworld.springboot.service;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ydsworld.springboot.model.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	public Employee findByEname(String empName);
//	public List<Customer> findByLastName(String lastName)
}

