package com.excelr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.model.Employee;

import com.excelr.repo.EmployeeRepo;

@Service
public class EmpServiceImp implements EmployeeService {

	@Autowired private EmployeeRepo repo;
	           
	@Override
	public Employee saveEmps(Employee emp) {
		Employee save = repo.save(emp);
		return save;
	}
	@Override
	public List<Employee> getAllEmps() {
		List<Employee> saveall = repo.findAll();
		return saveall;
	}
	@Override
	public void deleteEmp(int empNo) {
		repo.deleteById(empNo);
	}
	@Override
	public Employee updateEmp(Employee emp, int empNo) {

		Employee oldRecord = repo.findById(empNo).get();
		oldRecord.setEmpNo(emp.getEmpNo());
		oldRecord.setEmpName(emp.getEmpName());
		oldRecord.setDepartment(emp.getDepartment());
		oldRecord.setSalary(emp.getSalary());
		return repo.save(oldRecord);
	}
}
