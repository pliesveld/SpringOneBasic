package com.componentAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pancard 
{
	@Value("17171717")
	private int panno;
	@Value("#{employee.getEmpname()}")
	private String panHolderName;
	
	public int getPanno() {
		return panno;
	}
	public void setPanno(int panno) {
		this.panno = panno;
	}
	public String getPanHolderName() {
		return panHolderName;
	}
	public void setPanHolderName(String panHolderName) {
		this.panHolderName = panHolderName;
	}
	
	
}
