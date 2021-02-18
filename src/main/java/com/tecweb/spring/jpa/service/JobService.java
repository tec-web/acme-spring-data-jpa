package com.tecweb.spring.jpa.service;

import org.springframework.stereotype.Service;

import com.tecweb.spring.jpa.repository.JobRepository;

@Service
public class JobService {
	private final JobRepository jobRepository;

	public JobService(JobRepository jobRepository) {
		this.jobRepository = jobRepository;
	}
}
