package com.neusoft.entity;

public class Emp {	
	private Integer empId;
	private String ename;
	private String egender;
	private Dept dept;
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public String getEgender() {
		return egender;
	}
	public void setEgender(String egender) {
		this.egender = egender;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	
}
