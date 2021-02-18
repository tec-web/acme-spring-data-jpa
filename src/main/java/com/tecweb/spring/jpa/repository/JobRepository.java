package com.tecweb.spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecweb.spring.jpa.model.Job;

public interface JobRepository extends JpaRepository<Job, Integer> {

}
