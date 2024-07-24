package com.excelr.service;

import java.util.List;

import com.excelr.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public Student updateStudent(Student student);
	public Student getOneStudent(int sid);
	public void deleteStudent(int sid);
	public List<Student> getAllStudent();
	    
	
}


