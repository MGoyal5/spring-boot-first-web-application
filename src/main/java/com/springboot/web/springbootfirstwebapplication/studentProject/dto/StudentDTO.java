package com.springboot.web.springbootfirstwebapplication.studentProject.dto;

import java.math.BigDecimal;

public class StudentDTO {

	private long id;

	private BigDecimal age;

	private String name;

	public StudentDTO()
	{
		
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAge() {
		return age;
	}

	public void setAge(BigDecimal age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
