package com.tecweb.spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecweb.spring.jpa.model.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
