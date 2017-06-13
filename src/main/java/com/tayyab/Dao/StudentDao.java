package com.tayyab.Dao;

import java.util.Collection;

import com.tayyab.Entity.Student;

/**
 * Created by tayyabshabab on 6/13/17.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}
