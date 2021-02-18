package com.tecweb.spring.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.tecweb.spring.jpa.model.Country;

public interface CountryRepository extends CrudRepository<Country, String> {
}
