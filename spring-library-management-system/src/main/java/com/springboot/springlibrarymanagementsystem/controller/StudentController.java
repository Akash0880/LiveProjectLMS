package com.springboot.springlibrarymanagementsystem.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.springlibrarymanagementsystem.dao.StudentRepo;
import com.springbootspringlibrarymanagementsystem.entity.Student;


@Controller
public class StudentController {
	@Autowired
	StudentRepo er;
		
	@RequestMapping("/addstud")
	@ResponseBody
	public String addEmp(Student e)
	{
		er.save(e);
		return "Student added";
	}
	
	@RequestMapping("/viewstud")
	@ResponseBody
	public String viewBook(int id )
	{
		List<Student> list = er.findAll();
		for(Student i:list)
		{
			if(i.getId()==id)
			{
				return i.toString();
			}
		}
		
		return "No Student Found";
	}
	
	@RequestMapping("/viewallstud")
	@ResponseBody
	public String viewAllItem()
	{
		List<Student> list = er.findAll();
		return list.toString();
	}
	
	@RequestMapping("/updatestud")
	@ResponseBody
	public String updateItem(Student b1)
	{
		List<Student> list = er.findAll();
		for(Student b:list)
		{
			if(b.getId()==b1.getId())
			{
				er.delete(b);
				break;
			}
		}
		er.save(b1);
		return "Student Updated";
	}
	
	@RequestMapping("/deletestud")
	@ResponseBody
	public String deleteItem(int id)
	{
		List<Student> list = er.findAll();
		for(Student b:list)
		{
			if(b.getId()==id)
			{
				er.delete(b);
				return "Student Deleted";
			}
		}
		return "Not available";
	}
}