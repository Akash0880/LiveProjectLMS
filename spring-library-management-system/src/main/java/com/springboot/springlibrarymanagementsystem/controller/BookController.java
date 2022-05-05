package com.springboot.springlibrarymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.springlibrarymanagementsystem.dao.BookRepo;
import com.springboot.springlibrarymanagementsystem.dao.StudentRepo;
import com.springbootspringlibrarymanagementsystem.entity.Book;
import com.springbootspringlibrarymanagementsystem.entity.Student;


@Controller
public class BookController {
	@Autowired
	BookRepo br;
	
	@RequestMapping("home")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("addbook")
	@ResponseBody
	public String addBook(Book b)
	{
		br.save(b);
		return "book added";
	}

	@RequestMapping("/viewbook")
	@ResponseBody
	public String viewBook(int id )
	{
		List<Book> list = br.findAll();
		for(Book i:list)
		{
			if(i.getId()==id)
			{
				return i.toString();
			}
		}
		
		return "No Student Found";
	}
	
	@RequestMapping("/viewallbook")
	@ResponseBody
	public String viewAllItem()
	{
		List<Book> list = br.findAll();
		return list.toString();
	}
	
	@RequestMapping("/updatebook")
	@ResponseBody
	public String updateItem(Book b1)
	{
		List<Book> list = br.findAll();
		for(Book b:list)
		{
			if(b.getId()==b1.getId())
			{
				br.delete(b);
				break;
			}
		}
		br.save(b1);
		return "Book Updated";
	}
	
	@RequestMapping("/deletebook")
	@ResponseBody
	public String deleteItem(int id)
	{
		List<Book> list = br.findAll();
		for(Book b:list)
		{
			if(b.getId()==id)
			{
				br.delete(b);
				return "Book Deleted";
			}
		}
		return "Not available";
	}	
	

}

