package com.springboot.springlibrarymanagementsystem.dao;




import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootspringlibrarymanagementsystem.entity.Book;

public interface BookRepo extends JpaRepository<Book,Integer>{

	

}