package com.excelr.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

	
}

