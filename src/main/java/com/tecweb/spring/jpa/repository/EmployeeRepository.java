package com.tecweb.spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecweb.spring.jpa.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
