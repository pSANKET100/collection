package org;

import java.util.LinkedList;

public class StudentGrade {
	public static void main(String aegs[]) {
		
		 StudentGradeList gradeList = new StudentGradeList();
		 
		 gradeList.addStudent("ajit",30);
		 gradeList.addStudent("anit",85);
		 gradeList.addStudent("kunit",95);
		 gradeList.addStudent("manit",45);
		 gradeList.addStudent("ranit",70);
		 
		 System.out.println("All students");
		 gradeList.displayStudent();
		 
		 gradeList.removeFailedStudents();
		 
		 System.out.println("remaining students after removing failed");
		 gradeList.displayStudent();
		 
	}
}
