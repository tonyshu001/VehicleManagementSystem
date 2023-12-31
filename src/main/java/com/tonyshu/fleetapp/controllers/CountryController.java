package com.tonyshu.fleetapp.controllers;

import java.util.List;
import java.util.Optional;

import com.tonyshu.fleetapp.models.Country;
import com.tonyshu.fleetapp.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class CountryController {
	
	@Autowired
	private CountryService countryService;

	@GetMapping("/countries")
	public String goCountries(Model model){
		List<Country> countryList = countryService.findAll();
		model.addAttribute("countries", countryList);
		return "country";
	}

	//add a new country then return to the country.html page
	@PostMapping("/countries/addNew")
	public String addNew(Country country){
		countryService.save(country);
		return "redirect:/countries";
	}




}
