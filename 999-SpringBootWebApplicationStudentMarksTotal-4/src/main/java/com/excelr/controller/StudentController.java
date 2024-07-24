package com.excelr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.excelr.model.Student;
import com.excelr.service.StudentService;

@Controller
public class StudentController {

	@Autowired private StudentService service;
	@RequestMapping("/")
	public String homePage()
	{
		return "home";
	}
	@RequestMapping("/stuform")
	public String studentRegForm()
	{
		return "stureg";
	}
	@RequestMapping("/submit")
	public String submitStudentMarksDeatails(Student student,ModelMap model)
	{
		service.saveStudent(student);
		return "success";
	}
	@RequestMapping("/viewAllStudents")
	public String displayAllStudent(ModelMap model)
	{
		model.put("students",service.getAllStudent());
		return "viewstudent";
	}
	@RequestMapping("/edit/{sid}")
	public String editForm(@PathVariable int sid,ModelMap model)
	{
		model.put("command", service.getOneStudent(sid));
		return "editfrom";
	}
	@RequestMapping("/updateandsave")
	public String editSaveData(Student student,ModelMap model)
	{
		service.updateStudent(student);
		return "redirect:/viewAllStudents";
	}
	@RequestMapping("/delete/{sid}")
	public String delete(@PathVariable int sid)
	{
		service.deleteStudent(sid);
		return "redirect:/viewAllStudents";
	}
}


