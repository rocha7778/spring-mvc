package com.packt.webstore.domain.repository.impl;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.packt.webstore.domain.Countries;
import com.packt.webstore.domain.repository.CountriesRepository;

public class CountriesRepositoryImpl implements CountriesRepository {

	private JdbcTemplate jdbcTemplate;

	public CountriesRepositoryImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public CountriesRepositoryImpl() {

	}

	@Override
	public void create(Countries country) {
		
		 Object[] params = new Object[] { country.getCountryId(), country.getCountryName(), country.getRegionId() };
		 int[] types = new int[] { Types.VARCHAR, Types.VARCHAR, Types.NUMERIC };


		String sql = "insert into COUNTRIES (COUNTRY_ID,COUNTRY_NAME,REGION_ID)"
				+ " values(?,?,?)";
		
		
		jdbcTemplate.update(sql,params, types);


	}

}
