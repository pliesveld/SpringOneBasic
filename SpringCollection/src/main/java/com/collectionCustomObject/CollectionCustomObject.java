package com.collectionCustomObject;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionCustomObject
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/collectionCustomObject/CollectionCustomObject.xml");
		StudentMain studentmain = context.getBean("studentmain",StudentMain.class);
		System.out.println(studentmain);
		
	}
}
