package com.springboot.web.springbootfirstwebapplication.studentProject.entity;

import java.io.Serializable;
import java.math.BigDecimal;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.NamedQuery;

/**
 * The persistent class for the STUDENT database table.
 * 
 */

  @Entity
  
  @NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
 
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
//	@SequenceGenerator(name="STUDENT_ID_GENERATOR", sequenceName="SEQID")
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STUDENT_ID_GENERATOR")
	private long id;

	private BigDecimal age;

	private String name;

	public Student() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAge() {
		return this.age;
	}

	public void setAge(BigDecimal age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}