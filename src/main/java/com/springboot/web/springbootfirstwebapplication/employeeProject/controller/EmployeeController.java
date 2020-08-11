package com.springboot.web.springbootfirstwebapplication.employeeProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.web.springbootfirstwebapplication.employeeProject.dto.EmployeeDTO;
import com.springboot.web.springbootfirstwebapplication.employeeProject.service.EmployeeSerivce;
//import com.springboot.web.springbootfirstwebapplication.studentProject.service.StudentService;

public class EmployeeController {

	@Autowired
	EmployeeSerivce empService;
	
	@GetMapping("/getAllEmployee")
	public ResponseEntity<List<EmployeeDTO>> getAllEmployee()
	{
		List<EmployeeDTO> empDTOList = empService.getAllEmployee();
		return new ResponseEntity<List<EmployeeDTO>>(empDTOList, HttpStatus.OK);
	}
	
	@GetMapping("/getEmployeeById")
	public ResponseEntity<EmployeeDTO> getEmployeeById(@RequestParam long id)
	{
		return null;
	}
	
	@PostMapping("/addEmployee")
	public ResponseEntity<String> addEmployee(@RequestBody EmployeeDTO employeeDto)
	{
		empService.addEmployee(employeeDto);
		return new ResponseEntity<String>("Employee details is added ", HttpStatus.OK);
	}
}
