package com.MapInjection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentMain 
{
	private Map<Integer, String> studIdAndNameMap;
	private Map<Integer, Student> studentInfo;
	
	public Map<Integer, String> getStudIdAndNameMap() {
		return studIdAndNameMap;
	}
	public void setStudIdAndNameMap(Map<Integer, String> studIdAndNameMap) {
		this.studIdAndNameMap = studIdAndNameMap;
	}
	public Map<Integer, Student> getStudentInfo() {
		return studentInfo;
	}
	public void setStudentInfo(Map<Integer, Student> studentInfo) {
		this.studentInfo = studentInfo;
	}
	
	@Override
	public String toString() {
		return "StudentMain [studIdAndNameMap=" + studIdAndNameMap + ", studentInfo=" + studentInfo + "]";
	}
}
