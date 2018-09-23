package com.ObjectInjection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjeectInjection {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ObjectInjection2/ObjectInjection2.xml");
		Triangle triangle  = (Triangle) context.getBean("triangle");
		
		Point point1 = (Point) context.getBean("point1");
		Point point2 = (Point) context.getBean("point2");
		Point point3 = (Point) context.getBean("point3");
		
		triangle.setPointA(point1);
		triangle.setPointB(point2);
		triangle.setPointC(point3);
		
		triangle.draw();
	}

}
