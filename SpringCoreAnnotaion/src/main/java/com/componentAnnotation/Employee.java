package com.componentAnnotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	@Value("101")
	private String empid;
	
	@Value("SuperVillain")
	private String empname;
	
	@Resource(name="pancard")
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
