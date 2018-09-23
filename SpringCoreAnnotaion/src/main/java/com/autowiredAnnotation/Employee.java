package com.autowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee 
{
	private String empid;
	private String empname;
	
	@Autowired   //(required=false) if that bean is not available the prog throw an exception this required is use to overcome that exception  
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
