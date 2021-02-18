package com.tecweb.spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecweb.spring.jpa.model.Dependent;

public interface DependentRepository extends JpaRepository<Dependent, Integer> {

}
