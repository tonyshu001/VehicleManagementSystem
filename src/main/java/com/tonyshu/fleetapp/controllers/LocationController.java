package com.tonyshu.fleetapp.controllers;

import java.util.List;
import java.util.Optional;

import com.tonyshu.fleetapp.models.Location;
import com.tonyshu.fleetapp.services.CountryService;
import com.tonyshu.fleetapp.services.LocationService;
import com.tonyshu.fleetapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class LocationController {

	@GetMapping("/location")
	public String goLocation(){
		return "location";
	}
	
}