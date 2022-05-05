package com.springboot.springlibrarymanagementsystem.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootspringlibrarymanagementsystem.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
