package com.pNamespace;


public class Student 
{
	private String Name;
	private int age;
	private Course courses;
	public Course getCourses() {
		return courses;
	}
	public void setCourses(Course courses) {
		this.courses = courses;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", age=" + age + ", courses=" + courses + "]";
	}
	

	
}
