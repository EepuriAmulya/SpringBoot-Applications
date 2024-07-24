package com.excelr.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.model.ProductOrder;
import com.excelr.repo.ProductOrderRepo;

@RestController
public class ProductOrderController {
	
	@Autowired private ProductOrderRepo repo;
	
	@PostMapping("/save")
	public ProductOrder savaData(@RequestBody ProductOrder product ) {
		ProductOrder save=repo.save(product);
		return save;
	}
	@GetMapping("/getone/{id}")
	public Optional<ProductOrder> getOne(@PathVariable Integer  id) {
		Optional<ProductOrder> pc=repo.findById(id);
		return pc;
	}
		@DeleteMapping("delete/{empNo}")
		public void deleteOne(@PathVariable int empNo) {
			 repo.deleteById(empNo);
		}
		
		@PutMapping("update/{empNo}")
		public ProductOrder updaterecord(@RequestBody ProductOrder emp,@PathVariable int empNo) {
			ProductOrder update=repo.save(emp);
			return update;
		}
		
		
	}


