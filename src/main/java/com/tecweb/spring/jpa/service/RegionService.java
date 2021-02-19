package com.tecweb.spring.jpa.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tecweb.spring.jpa.model.Region;
import com.tecweb.spring.jpa.repository.RegionRepository;

@Service
public class RegionService {
	private final RegionRepository regionRepository;

	public RegionService(RegionRepository regionRepository) {
		this.regionRepository = regionRepository;
	}

	public Optional<Region> findById(Integer regionId) {
		return regionRepository.findById(regionId);
	}
	
	public Region save(Region region) {
		return regionRepository.save(region);
	}
	
	public void deleteById(Integer regionId) {
		regionRepository.deleteById(regionId);
	}
}
