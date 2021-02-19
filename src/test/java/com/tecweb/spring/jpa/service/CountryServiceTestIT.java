package com.tecweb.spring.jpa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tecweb.spring.jpa.model.Country;
import com.tecweb.spring.jpa.model.Region;
import com.tecweb.spring.jpa.repository.CountryRepository;

@SpringBootTest
class CountryServiceTestIT {
	@Autowired
	CountryService countryService;

	@Autowired
	CountryRepository countryRepository;

	@Test
	//@Disabled
	void test_findAll() {
		List<Country> countries = null;
		countries = countryService.findAll();
		assertNotNull(countries);
		assertFalse(countries.isEmpty());
		countries.forEach(c -> {
			System.out.print(c.getCountryName() + " - ");
			System.out.println(c.getRegion().getRegionName());
		});
	}

	@Test
	@Disabled
	void test_SaveNewCountry() {
		Country country = new Country();
		country.setCountryId("RU");
		country.setCountryName("Rusia");
		Region region = new Region();
		region.setRegionId(1);
		region.setRegionName("Europe");
		country.setRegion(region);
		Country newCountry = countryService.save(country);
		assertNotNull(newCountry);
		assertNotNull(newCountry.getRegion());
		assertEquals("Europe", newCountry.getRegion().getRegionName());
	}
	
	@Test
	@Disabled
	void test_SaveNewCountryAndRegion() {
		Country country = new Country();
		country.setCountryId("PR");
		country.setCountryName("Puerto Rico");
		Region region = new Region();
		region.setRegionId(5);
		region.setRegionName("Unknown");
		country.setRegion(region);
		Country newCountry = countryService.save(country);
		assertNotNull(newCountry);
		assertNotNull(newCountry.getRegion());
		assertEquals("Unknown", newCountry.getRegion().getRegionName());
	}	
}
