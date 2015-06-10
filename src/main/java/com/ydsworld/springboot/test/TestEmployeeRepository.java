package com.ydsworld.springboot.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ydsworld.springboot.model.Employee;
import com.ydsworld.springboot.service.EmployeeRepository;

public class TestEmployeeRepository {

	@Autowired
	EmployeeRepository service;
	
	@Test
	public void test() {
		//Employee arun = service.findByEname("Arun");  
        //Assert.assertNotNull(arun);  
       // LOG.info(alice);
		List<Employee> members = (List<Employee>) service.findAll();
        Assert.assertEquals(3, members.size());
    //    Member newMember = members.get(0);
        
	}

}
