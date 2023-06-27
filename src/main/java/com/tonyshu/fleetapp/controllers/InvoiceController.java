package com.tonyshu.fleetapp.controllers;

import java.util.Optional;

import com.tonyshu.fleetapp.models.Invoice;
import com.tonyshu.fleetapp.services.ClientService;
import com.tonyshu.fleetapp.services.InvoiceService;
import com.tonyshu.fleetapp.services.InvoiceStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class InvoiceController {

	@GetMapping("/invoice")
	public String goInvoice(){
		return "invoice";
	}
}
