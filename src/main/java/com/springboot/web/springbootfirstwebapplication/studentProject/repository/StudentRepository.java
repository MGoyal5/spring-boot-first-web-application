package com.springboot.web.springbootfirstwebapplication.studentProject.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.web.springbootfirstwebapplication.studentProject.entity.Student;



public interface StudentRepository extends CrudRepository<Student, Long> {

}
