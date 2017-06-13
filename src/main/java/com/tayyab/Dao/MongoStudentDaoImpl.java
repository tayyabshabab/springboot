package com.tayyab.Dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.tayyab.Entity.Student;

/**
 * Created by tayyabshabab on 6/13/17.
 */

@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImpl implements StudentDao {

    Connection mongoConnection;

    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>() {
            {
                add(new Student(1, "Tayyab", "Computer Science"));
                add(new Student(2, "Jack", "Finance"));
                add(new Student(3, "Annika", "Maths"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudentToDb(Student student) {

    }
}
