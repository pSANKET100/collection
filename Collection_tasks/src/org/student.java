package org;

public class student {
	String name;
	int grade;
	
	public student(String name, int grade) {
		this.name=name;
		this.grade=grade;
	}
	
	public String toString() {
		return "Student : " +name+ ", Grade : "+grade;
		
	}
}
