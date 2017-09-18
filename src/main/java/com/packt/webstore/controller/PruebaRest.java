package com.packt.webstore.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.packt.webstore.domain.Countries;

public class PruebaRest {
	
	 private static final String URL_API_BOOKS =
			 "http://localhost:8182/rest/coutry/";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Countries[]> response =
	            restTemplate.getForEntity(URL_API_BOOKS, Countries[].class);
		
		System.out.println();
		System.out.println("GET All StatusCode = " + response.getStatusCode());
		System.out.println("GET Headers = " + response.getHeaders());
		
		List<Countries> countries =Arrays.asList(response.getBody());
		
		for (Countries countries2 : countries) {
			System.out.println("Conuntry name: "+countries2.getCountryName());
			
		}
		
		

	}

}
