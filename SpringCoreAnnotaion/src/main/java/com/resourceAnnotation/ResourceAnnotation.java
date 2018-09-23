package com.resourceAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceAnnotation {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/resourceAnnotation/spring.xml");
		
		Employee employee = context.getBean("employee",Employee.class);
		
		System.out.println(employee.getEmpid()+"\t "+employee.getEmpname());
		
		System.out.println("-----------------");
		
		Pancard pancard = employee.getPancard();
		
		System.out.println(pancard.getPanno()+"\t"+pancard.getPanHolderName());
		
		
	}

}
