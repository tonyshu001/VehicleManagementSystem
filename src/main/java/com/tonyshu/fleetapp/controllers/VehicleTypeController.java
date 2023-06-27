package com.tonyshu.fleetapp.controllers;

import java.util.Optional;

import com.tonyshu.fleetapp.models.VehicleType;
import com.tonyshu.fleetapp.services.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class VehicleTypeController {

	@GetMapping("/vehicle_type")
	public String goVehicleType(){
		return "vehicletype";
	}


}
