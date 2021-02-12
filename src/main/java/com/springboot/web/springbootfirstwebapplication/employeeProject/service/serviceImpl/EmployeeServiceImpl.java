package com.springboot.web.springbootfirstwebapplication.employeeProject.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.web.springbootfirstwebapplication.common.MapObject;
import com.springboot.web.springbootfirstwebapplication.employeeProject.dto.EmployeeDTO;
import com.springboot.web.springbootfirstwebapplication.employeeProject.entity.Employee;
import com.springboot.web.springbootfirstwebapplication.employeeProject.repository.EmployeeRepository;
import com.springboot.web.springbootfirstwebapplication.employeeProject.service.EmployeeSerivce;

//@Component
public class EmployeeServiceImpl {}
/*implements EmployeeSerivce {

	@Autowired
	EmployeeRepository empRepository;
	
	@Override
	public void addEmployee(EmployeeDTO employeeDto) {
		// TODO Auto-generated method stub
		Employee emp = MapObject.modelMapper.map(employeeDto, Employee.class);
		emp = empRepository.save(emp);
		if(null!=emp)
			System.out.println("employee added successfully");
		else
			System.out.println("employee not added");
	}

	@Override
	public List<EmployeeDTO> getAllEmployee() {
		// TODO Auto-generated method stub
		List<EmployeeDTO> empDTOList = empRepository.getAllEmployee();
		return empDTOList;
	}

	@Override
	public EmployeeDTO getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
*/