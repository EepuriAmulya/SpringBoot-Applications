package com.excelr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.model.Employee;
import com.excelr.service.EmpServiceImp;

@RestController
public class EmployeeController {
    
	@Autowired private EmpServiceImp service;
	
		@PostMapping("/register")
	public String registerdetails(@RequestBody Employee emp) {
				
				Employee savedata=service.saveEmps(emp);
				String message=null;
				if(savedata!=null) {
					message="Data Saved Succesfully...";
				}
				else {
					message="Data Not Saved....";
				}		
				return message;				
			}	
			
	@GetMapping("/getAll")
	public List<Employee> saveAll(Employee emp,ModelMap model) {		
		List<Employee> saveall=service.getAllEmps();
		return saveall;
		
	}	
	@DeleteMapping("/delete/{empNo}")
	public void deleteEmp(@PathVariable int empNo) {
		service.deleteEmp(empNo);		
	}	
	@PutMapping("update/{empNo}")
	public Employee updaterecord(@RequestBody Employee emp,@PathVariable int empNo) {
		Employee update=service.updateEmp(emp, empNo);
		return update;
}}
