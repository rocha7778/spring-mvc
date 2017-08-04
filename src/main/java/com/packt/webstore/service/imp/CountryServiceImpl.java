package com.packt.webstore.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Countries;
import com.packt.webstore.domain.repository.CountriesRepository;
import com.packt.webstore.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService{
	
	@Autowired
	private CountriesRepository countriesRepository;

	@Override
	public void create(Countries country) {
		// TODO Auto-generated method stub
		countriesRepository.create(country);
		
	}

}
