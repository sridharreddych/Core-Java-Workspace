package com.sree.transferobjectpattern;

/* Step 3
Use the StudentBO to demonstrate Transfer Object Design Pattern. */

public class TransferObjectPatternDemo {
	public static void main(String[] args) {
		StudentBO studentBusinessObject = new StudentBO();
		// print all students
		for (StudentVO student : studentBusinessObject.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Nam e : " + student.getName() + " ]");
		}
		// update student
		StudentVO student = studentBusinessObject.getAllStudents().get(0);
		student.setName("Michael");
		studentBusinessObject.updateStudent(student);
		// get the student
		studentBusinessObject.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Nam e : " + student.getName() + " ]");
	}
}