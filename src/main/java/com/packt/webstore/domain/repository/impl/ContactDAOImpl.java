package com.packt.webstore.domain.repository.impl;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.packt.webstore.domain.repository.ContactDAO;
import com.packt.webstore.dto.Contact;
import com.packt.webstore.dto.Countries;

public class ContactDAOImpl  implements ContactDAO{
	
	 private JdbcTemplate jdbcTemplate;
	 
	 public ContactDAOImpl(DataSource dataSource) {
		    jdbcTemplate = new JdbcTemplate(dataSource);
		}
	 
	 public ContactDAOImpl() {
		   
		}
	 
	 

	@Override
	public void saveOrUpdate(Contact contact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int contactId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contact get(int contactId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<Countries> list() {
		 String sql = "SELECT COUNTRY_ID,COUNTRY_NAME, REGION_ID FROM COUNTRIES";
		    List<Countries> listContact = jdbcTemplate.query(sql, new RowMapper<Countries>() {
		 
		        @Override
		        public Countries mapRow(ResultSet rs, int rowNum) throws SQLException {
		        	Countries aContact = new Countries();
		 
		            aContact.setCountryId(rs.getString("COUNTRY_ID"));
		            aContact.setCountryName(rs.getString("COUNTRY_NAME"));
		            aContact.setRegionId(new BigDecimal(rs.getString("REGION_ID")));
		          
		            return aContact;
		        }
		 
		    });
		 
		    return listContact;
	}
	

	

}
