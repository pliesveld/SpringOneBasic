package com.autowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredAnnotation {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowiredAnnotation/spring.xml");
		
		Employee employee = context.getBean("employee",Employee.class);
		
		System.out.println(employee.getEmpid()+"\t"+employee.getEmpname());
		
		System.out.println("-----------------");
		
		Pancard pancard = employee.getPancard();
		
		System.out.println(pancard.getPanno()+"\t"+pancard.getPanHolderName());
		
		
	}

}
