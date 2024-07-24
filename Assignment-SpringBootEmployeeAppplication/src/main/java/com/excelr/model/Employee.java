package com.excelr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Emp_table1")
public class Employee {

	@Id
	private int empNo;
	private String empName;
	private String department;
	private double salary;
	Employee() {
		super();
	}
	Employee(int empNo, String empName, String department, double salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.department = department;
		this.salary = salary;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", department=" + department + ", salary=" + salary
				+ "]";
	}
	
}
