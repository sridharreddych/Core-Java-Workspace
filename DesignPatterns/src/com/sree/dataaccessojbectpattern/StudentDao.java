package com.sree.dataaccessojbectpattern;

/* Step 2
Create Data Access Object Interface. */

import java.util.List;

public interface StudentDao {
public List<Student> getAllStudents();
public Student getStudent(int rollNo);
public void updateStudent(Student student);
public void deleteStudent(Student student);
}