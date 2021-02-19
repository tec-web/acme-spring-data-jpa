package com.tecweb.spring.jpa.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRIES")
public class Country {
	@Id
	@Column(name = "country_id", unique = true)
	private String countryId;

	@Column(name = "country_name")
	private String countryName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "region_id")
	private Region region;

	public Country() {
		super();
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
}
