package com.qualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee 
{
	private String empid;
	private String empname;
	
	@Autowired
	@Qualifier("pancard2")
	private Pancard pancard;
	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Pancard getPancard() {
		return pancard;
	}
	//@Autowired
	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}
	
	
	
	
}
