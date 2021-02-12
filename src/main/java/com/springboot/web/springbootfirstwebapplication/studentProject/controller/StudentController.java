package com.springboot.web.springbootfirstwebapplication.studentProject.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.springbootfirstwebapplication.studentProject.dto.StudentDTO;
import com.springboot.web.springbootfirstwebapplication.studentProject.service.StudentService;

@RestController
public class StudentController {
	/*
	 * 
	 * @Autowired private StudentService studentService; public static
	 * List<StudentDTO> students = new LinkedList<StudentDTO>();
	 * 
	 * @PostMapping("/setStudent") public ResponseEntity<String>
	 * addStudent(@RequestBody StudentDTO studentdto) {
	 * studentService.addStudent(students, studentdto); return new
	 * ResponseEntity<String>(studentdto.getName() + " is added successfull",
	 * HttpStatus.OK); }
	 * 
	 * 
	 * 
	 * @GetMapping("/getStudentById") public ResponseEntity<Student>
	 * getStudentById(@RequestParam int id) { Student st =
	 * studentService.getStudentById(students,id); if(!(null==st)) return new
	 * ResponseEntity<Student>(st, HttpStatus.OK);
	 * 
	 * else return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	 * 
	 * }
	 * 
	 * 
	 */}
