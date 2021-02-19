package com.tecweb.spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecweb.spring.jpa.model.Dependent;

@Repository
public interface DependentRepository extends JpaRepository<Dependent, Integer> {

}
