package com.tecweb.spring.jpa.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tecweb.spring.jpa.model.Department;
import com.tecweb.spring.jpa.repository.DepartmentRepository;

@SpringBootTest
class DepartmentServiceTestIT {
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Autowired
	DepartmentService departmentService;
	
	@Test
	void test_findAllDepartmens() {
		List<Department> departments = null;
		departments = departmentService.findAll();
		assertNotNull(departments);
		assertFalse(departments.isEmpty());
		departments.forEach(d -> System.out.println(d.getDeparmentName()));
	}

}
