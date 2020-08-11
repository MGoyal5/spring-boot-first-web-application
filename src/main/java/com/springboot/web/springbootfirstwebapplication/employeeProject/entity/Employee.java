package com.springboot.web.springbootfirstwebapplication.employeeProject.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long empid;

	private BigDecimal empage;

	private String empname;

	private BigDecimal mobilenumber;

	public Employee() {
	}

	public long getEmpid() {
		return this.empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public BigDecimal getEmpage() {
		return this.empage;
	}

	public void setEmpage(BigDecimal empage) {
		this.empage = empage;
	}

	public String getEmpname() {
		return this.empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public BigDecimal getMobilenumber() {
		return this.mobilenumber;
	}

	public void setMobilenumber(BigDecimal mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

}