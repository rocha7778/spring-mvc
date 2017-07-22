package com.packt.webstore.domain.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepositoryImpl implements CustomerRepository {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public List<Customer> getAllCusfomerInfo() {
		Map<String, Object> params = new HashMap<String, Object>();
		List<Customer> result = jdbcTemplate.query("SELECT * FROM customer", params, new CustomerMapper());

		return result;
	}

	private static final class CustomerMapper implements RowMapper<Customer> {
		public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			Customer customer = new Customer();
			customer.setId(rs.getBigDecimal("ID"));
			customer.setName(rs.getString("NAME"));
			customer.setAddres(rs.getString("ADDRES"));
			customer.setNoOfOrdersMade(rs.getBigDecimal("NO_ORDER_MADE"));
			return customer;
		}
	}

	@Override
	public void addCustomer(Customer newCustomer) {

		String SQL = "INSERT INTO CUSTOMER (ID, "
	               + "NAME,"
	               + "ADDRES"
	               +  ")"
	               + "VALUES (:id, :name, :addres)";  
	         
	         Map<String, Object> params = new HashMap<>();
	         params.put("id", newCustomer.getId());  
	         params.put("name", newCustomer.getName());  
	         params.put("addres", newCustomer.getAddres());  
	        
	         jdbcTemplate.update(SQL, params);     

	}




}
