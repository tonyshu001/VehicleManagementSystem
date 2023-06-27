package com.tonyshu.fleetapp.controllers;

import java.util.Optional;

import com.tonyshu.fleetapp.models.VehicleMaintenance;
import com.tonyshu.fleetapp.services.SupplierService;
import com.tonyshu.fleetapp.services.VehicleMaintenanceService;
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
public class VehicleMaintenanceController {


	@GetMapping("/vehicle_maintenance")
	public String goVehicleMaintenance(){
		return "vehiclemaintenance";
	}

}
