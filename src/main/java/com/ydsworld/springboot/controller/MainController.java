package com.ydsworld.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ydsworld.springboot.model.Employee;
import com.ydsworld.springboot.service.EmployeeRepository;

@RestController
public class MainController {

	@Autowired
	EmployeeRepository service;
	
	@RequestMapping(value="/")
	public @ResponseBody String welcome(){
		return "Welcome";
		
	}
	
	@RequestMapping("/employees")
	public @ResponseBody List<Employee> listOfEmployees(){
		List<Employee> list =  (List<Employee>) service.findAll();
		System.out.println("list size :" + list.size());
			return (List<Employee>) service.findAll();
	}
}
