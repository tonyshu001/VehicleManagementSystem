package com.tonyshu.fleetapp.services;

import java.util.List;
import java.util.Optional;

import com.tonyshu.fleetapp.models.Supplier;
import com.tonyshu.fleetapp.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SupplierService {
	@Autowired
	private SupplierRepository supplierRepository;
	
	//Get All Suppliers
	public List<Supplier> findAll(){
		return supplierRepository.findAll();
	}	
	
	//Get Supplier By Id
	public Optional<Supplier> findById(int id) {
		return supplierRepository.findById(id);
	}	
	
	//Delete Supplier
	public void delete(int id) {
		supplierRepository.deleteById(id);
	}
	
	//Update Supplier
	public void save(Supplier supplier) {
		supplierRepository.save(supplier);
	}

}
