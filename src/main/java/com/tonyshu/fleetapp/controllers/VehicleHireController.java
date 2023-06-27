package com.tonyshu.fleetapp.controllers;

import java.util.Optional;

import com.tonyshu.fleetapp.models.VehicleHire;
import com.tonyshu.fleetapp.services.ClientService;
import com.tonyshu.fleetapp.services.LocationService;
import com.tonyshu.fleetapp.services.VehicleHireService;
import com.tonyshu.fleetapp.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class VehicleHireController {

	@GetMapping("/vehicle_hire")
	public String goVehicleHire(){
		return "vehiclehire";
	}


}
