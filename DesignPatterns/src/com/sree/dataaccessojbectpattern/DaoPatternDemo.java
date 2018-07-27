package com.sree.dataaccessojbectpattern;

/* Step 4
Use the StudentDao to demonstrate Data Access Object pattern usage. */

public class DaoPatternDemo {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();
		// print all students
		for (Student student : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Nam e : " + student.getName() + " ]");
		}
		// update student
		Student student = studentDao.getAllStudents().get(0);
		student.setName("Michael");
		studentDao.updateStudent(student);
		// get the student
		studentDao.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Nam e : " + student.getName() + " ]");
	}
}