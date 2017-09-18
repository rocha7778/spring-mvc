package com.packt.webstore.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.packt.webstore.domain.Countries;
import com.packt.webstore.domain.repository.ContactDAO;

@Controller
public class HomeController {
	
	@Autowired
    private ContactDAO contactDAO;
	
	@RequestMapping("/")
	public String welcome(Model model) {

		model.addAttribute("greeting", "Welcome to web Store!");
		model.addAttribute("tagline", "The one and only amazing web store");
		model.addAttribute("valor","");
		return "welcome";
	}

	@RequestMapping("/welcome/greeting")
	public String greeting() {
		return "welcome";
	}
	
	
	@RequestMapping(value="/hola")
	public ModelAndView listContact(ModelAndView model) throws IOException{
	    List<Countries> listContact = contactDAO.list();
	    model.addObject("listContact", listContact);
	    model.setViewName("homeHola");
	 
	    return model;
	}
	
	@RequestMapping(value="/miJson")
	public  @ResponseBody Countries miJson(@RequestBody Countries c) throws IOException{
	   System.out.println(c.getCountryName());
	   
	   Countries countries = new Countries();
	   countries.setCountryId("id_rocha");
	   countries.setCountryName("name_rocha");
	   countries.setRegionId(new BigDecimal(1));
	 
	    return countries;
	}

}
