package org;

import java.util.LinkedList;

public class StudentGradeList {
	private LinkedList students;

	public StudentGradeList() {
		students = new LinkedList();
	}

	public void addStudent(String name, int grade) {
		students.add(new student(name, grade));

	}

	public void displayStudent() {
		if (students.isEmpty()) {
			System.out.println("No student in the list");
			return;
		}
		for(Object obj:students) {
			student s1 = (student)obj;
			System.out.println(s1);
		}
	}
	
	public void removeFailedStudents() {
		for(int i=0; i<students.size(); i++) {
			student s1 = (student) students.get(i);
			if(s1.grade<50) {
				students.remove(i);
				i--;
			}
		}
	}
}
