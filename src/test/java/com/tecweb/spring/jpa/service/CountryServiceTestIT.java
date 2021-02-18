package com.tecweb.spring.jpa.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tecweb.spring.jpa.model.Country;
import com.tecweb.spring.jpa.repository.CountryRepository;

@SpringBootTest
class CountryServiceTestIT {
	@Autowired
	CountryService countryService;
	
	@Autowired
	CountryRepository countryRepository; 

	@Test
	void test_findAll() {
		List<Country> countries = null;
		countries = countryService.findAll();
		assertNotNull(countries);
		assertFalse(countries.isEmpty());
		countries.forEach(c -> System.out.println(c.getCountryName()));
	}
}
