package com.PropertiesInjection;

import java.util.Properties;

public class Student 
{
	private Properties stud;

	public Properties getStud() {
		return stud;
	}

	public void setStud(Properties stud) {
		this.stud = stud;
	}

	@Override
	public String toString() {
		return "Student [stud=" + stud + "]";
	}

	
	
}
