package com.arraySetList;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArraySetList
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/arraySetList/ArraySetList.xml");
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
		String names [] = student.getName();
		for (String name : names) 
		{
			System.out.println("Names : "+name);
		}
		
		List<String> list = student.getStudnamelist();
		
		 Iterator<String> itr = list.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println("Student name List : "+itr.next());
		 }
		 
		 Set<Integer> set = student.getStudidset();
		 
		 for (Integer integer : set)
		 {
			 System.out.println("Student Id : "+integer);
		 }
	}
}
