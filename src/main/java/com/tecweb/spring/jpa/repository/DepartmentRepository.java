package com.tecweb.spring.jpa.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.tecweb.spring.jpa.model.Department;

public interface DepartmentRepository extends PagingAndSortingRepository<Department, Integer>{

}
