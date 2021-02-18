package com.tecweb.spring.jpa.service;

import org.springframework.stereotype.Service;

import com.tecweb.spring.jpa.repository.EmployeeRepository;

@Service
public class EmployeeService {
	private final EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
}
