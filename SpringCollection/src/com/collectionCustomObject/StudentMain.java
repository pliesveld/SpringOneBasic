package com.collectionCustomObject;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class StudentMain 
{
	private Student studarray[] = new Student[2];
	private List<Student> studlist;
	private Set<Student> studset ;
	public Student[] getStudarray() {
		return studarray;
	}
	public void setStudarray(Student[] studarray) {
		this.studarray = studarray;
	}
	public List<Student> getStudlist() {
		return studlist;
	}
	public void setStudlist(List<Student> studlist) {
		this.studlist = studlist;
	}
	public Set<Student> getStudset() {
		return studset;
	}
	public void setStudset(Set<Student> studset) {
		this.studset = studset;
	}
	@Override
	public String toString() {
		return "StudentMain [studarray=" + Arrays.toString(studarray) + ", studlist=" + studlist + ", studset="
				+ studset + "]";
	}
	
	
	
}
