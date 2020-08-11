package com.springboot.web.springbootfirstwebapplication.employeeProject.dto;

import java.math.BigDecimal;

public class EmployeeDTO {

	private long empid;

	private BigDecimal empage;

	private String empname;

	private BigDecimal mobilenumber;

	
	public EmployeeDTO() {
		super();
	}

	
	public EmployeeDTO(long empid, BigDecimal empage, String empname, BigDecimal mobilenumber) {
		super();
		this.empid = empid;
		this.empage = empage;
		this.empname = empname;
		this.mobilenumber = mobilenumber;
	}


	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
		
	}

	public BigDecimal getEmpage() {
		return empage;
	}

	public void setEmpage(BigDecimal empage) {
		this.empage = empage;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public BigDecimal getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(BigDecimal mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	
}
