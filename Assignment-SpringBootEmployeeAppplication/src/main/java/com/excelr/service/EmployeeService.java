package com.excelr.service;

import java.util.List;

import com.excelr.model.Employee;

public interface EmployeeService {
   
	public Employee saveEmps(Employee emp);
	public List<Employee> getAllEmps();
	public void deleteEmp(int empNo);
	public Employee updateEmp(Employee emp,int empNo);
		
}
