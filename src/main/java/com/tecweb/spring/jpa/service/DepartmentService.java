package com.tecweb.spring.jpa.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.tecweb.spring.jpa.model.Department;
import com.tecweb.spring.jpa.repository.DepartmentRepository;

@Service
public class DepartmentService {
	private final DepartmentRepository departmentRepository;
	
	public DepartmentService(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}
	
	public List<Department> findAll(){
		return StreamSupport
				.stream(departmentRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
	}
}
