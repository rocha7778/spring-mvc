package com.packt.webstore.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.packt.webstore.domain.Countries;
import com.packt.webstore.service.imp.CountryServiceImpl;

@Controller
@RequestMapping(value = "/countries")
public class CountriesController {
	
	@Autowired
	private CountryServiceImpl countryService;
	
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAddNewProductForm(Model model) {
		Countries country = new Countries();
		model.addAttribute("newCountry", country);
		return "addCountries";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("newCountry")  @Valid Countries country, BindingResult result,
			HttpServletRequest request) {
		
		if(result.hasErrors()){
			return "addCountries";
		}

		countryService.create(country);
		return "redirect:/hola";
	}


	
}
