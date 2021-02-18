package com.tecweb.spring.jpa.service;

import org.springframework.stereotype.Service;

import com.tecweb.spring.jpa.repository.LocationRepository;

@Service
public class LocationService {
	private final LocationRepository locationRepository;

	public LocationService(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}
}
