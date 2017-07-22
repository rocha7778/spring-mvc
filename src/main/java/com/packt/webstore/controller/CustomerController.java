package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.service.CustomerService;

@Controller
@RequestMapping("/info")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	
	@RequestMapping("/customers")
	public ModelAndView list(Model model) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("customers", customerService.getAllCusfomerInfo());
		mv.setViewName("customerInfo");
		return mv;
	}
	
	@RequestMapping(value = "/customer/add", method = RequestMethod.GET)
	public String getAddNewCustomerForm(Model model) {
	   Customer newCustomer = new Customer();
	   model.addAttribute("newCustomer", newCustomer);
	   return "addCustomer";
	}
	
	
	@RequestMapping(value = "/customer/add", method = RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("newCustomer") Customer newCustomer) {
		customerService.addCustomer(newCustomer);
	   return "redirect:/info/customers";
	}

}
