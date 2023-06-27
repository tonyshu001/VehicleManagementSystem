package com.tonyshu.fleetapp.services;

import java.util.List;
import java.util.Optional;

import com.tonyshu.fleetapp.models.Country;
import com.tonyshu.fleetapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	//Get All countries
	public List<Country> findAll(){
		return countryRepository.findAll();
	}	

	
	//add a new country
	public void save( Country country) {
		countryRepository.save(country);
	}

}
