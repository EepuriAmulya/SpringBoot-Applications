
package com.excelr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.model.Student;
import com.excelr.repo.StudentRepo;

	@Service
	public class StudentServiceImp implements StudentService {

		@Autowired private StudentRepo repo;
		@Override
		public Student saveStudent(Student student) {

			double tot=0.0,per=0.0;
			String gr=null,res=null;
			tot=student.getHtml()+student.getSpring()+student.getSpringboot();
			per=tot/3;
			if(per>=70)
			{
				gr="A grade";
			}
			else if(per>=60)
			{
				gr="B grade";
			}
			else if(per>=50)
			{
				gr="C grade";
			}
			if(student.getHtml()>=35 && student.getSpring()>=35 && student.getSpringboot()>=35)
			{
				res="Pass";
			}
			else

			{
				res="Fail";
			}
			student.setTotal(tot);
			student.setPercentage(per);
			student.setGrade(gr);
			student.setResult(res);
			return repo.save(student);
		}
		@Override
		public List<Student> getAllStudent() {
			List<Student> listOfAllStudents=(List<Student>) repo.findAll();
			return listOfAllStudents;
		}
		
		@Override
		public Student getOneStudent(int sid) {
			Student getOneStudent=repo.findById(sid).get();
			return getOneStudent;
		}
		@Override
		public Student updateStudent(Student student) {
			double tot=0.0,per=0.0;
			String gr=null,res=null;
			tot=student.getHtml()+student.getSpring()+student.getSpringboot();
			per=tot/3;
			if(per>=70)
			{
				gr="A grade";
			}
			else if(per>=60)
			{
				gr="B grade";
			}
			else if(per>=50)
			{
				gr="C grade";
			}
			if(student.getHtml()>=35 && student.getSpring()>=35 && student.getSpringboot()>=35)
			{
				res="Pass";
			}
			else

			{
				res="Fail";
			}
			student.setTotal(tot);
			student.setPercentage(per);
			student.setGrade(gr);
			student.setResult(res);
			return repo.save(student);
		}

		@Override
		public void deleteStudent(int sid) {
			repo.deleteById(sid);
		}

}

