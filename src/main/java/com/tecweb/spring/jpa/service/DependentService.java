package com.tecweb.spring.jpa.service;

import org.springframework.stereotype.Service;

import com.tecweb.spring.jpa.repository.DependentRepository;

@Service
public class DependentService {
	private final DependentRepository dependentRepository;
	
	public DependentService(DependentRepository dependentRepository) {
		this.dependentRepository = dependentRepository;
	}
}
