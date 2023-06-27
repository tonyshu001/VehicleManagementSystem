package com.tonyshu.fleetapp.controllers;

import java.util.Optional;

import com.tonyshu.fleetapp.models.Client;
import com.tonyshu.fleetapp.services.ClientService;
import com.tonyshu.fleetapp.services.CountryService;
import com.tonyshu.fleetapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class ClientController {
	
	@Autowired private StateService stateService;
	@Autowired private CountryService countryService;
	@Autowired private ClientService clientService;
	
	@GetMapping("client")
	public String goClient(){
		return "client";
	}

}
