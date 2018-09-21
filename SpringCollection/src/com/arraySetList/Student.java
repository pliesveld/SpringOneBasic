package com.arraySetList;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Student 
{
	private String name[] = new String[3];
	private List<String> studnamelist;
	private Set<Integer> studidset;
	public String[] getName() {
		return name;
	}
	public void setName(String[] name) {
		this.name = name;
	}
	public List<String> getStudnamelist() {
		return studnamelist;
	}
	public void setStudnamelist(List<String> studnamelist) {
		this.studnamelist = studnamelist;
	}
	public Set<Integer> getStudidset() {
		return studidset;
	}
	public void setStudidset(Set<Integer> studidset) {
		this.studidset = studidset;
	}
	@Override
	public String toString() {
		return "Student [name=" + Arrays.toString(name) + ", studnamelist=" + studnamelist + ", studidset=" + studidset
				+ "]";
	}
}
