package com.tecweb.spring.jpa.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tecweb.spring.jpa.model.Country;
import com.tecweb.spring.jpa.model.Region;
import com.tecweb.spring.jpa.repository.RegionRepository;

@SpringBootTest
class RegionServiceTestIT {
	@Autowired
	RegionService regionService;

	@Autowired
	RegionRepository regionRepository;

	@Test
	//@Transactional enable when fetch type is LAZY
	@Disabled
	void test_findByRegionId() {
		final Integer ID_AMERICAS = 2;
		Optional<Region> optRegion = regionService.findById(ID_AMERICAS);
		assertTrue(optRegion.isPresent());
		assertTrue(optRegion.get().getCountries().size() > 0);
		System.out.println(optRegion.get().getRegionName());
		optRegion.get().getCountries().forEach(r -> System.out.println(r.getCountryName()));
	}

	@Test
	@Disabled
	public void test_SaveRegion() {
		Region region = new Region();
		region.setRegionName("North America");
		Region newRegion = regionService.save(region);
		assertNotNull(newRegion);
		assertThat(newRegion.getRegionId() > 0);
	}

	@Test
	@Disabled
	public void test_DeleteRegion() {
		final Integer REGION_ID = 8;
		regionService.deleteById(REGION_ID);
	}
	
	@Test
	public void test_ChangheRegion() {
		Region region = new Region();
		region.setRegionId(9);
		region.setRegionName("North America");
		
		Country usa = new Country();
		usa.setCountryId("US");
		usa.setCountryName("United States of America");
		usa.setRegion(region);
		region.addCountry(usa);
		
		Country canada = new Country();
		canada.setCountryId("CA");
		canada.setCountryName("Canada");
		canada.setRegion(region);
		region.addCountry(canada);
		
		region = regionRepository.save(region);		
		assertNotNull(region);
		assertEquals(2, region.getCountries().size());		
	}
}