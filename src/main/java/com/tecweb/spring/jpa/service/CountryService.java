package com.tecweb.spring.jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tecweb.spring.jpa.model.Country;
import com.tecweb.spring.jpa.repository.CountryRepository;

@Service
public class CountryService {
	private final CountryRepository countryRepository;
	
	public CountryService(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}
	
	public List<Country> findAll() {
		List<Country> countries = new ArrayList<>();
		countryRepository.findAll().forEach(countries::add);
		return countries;
	}
}
