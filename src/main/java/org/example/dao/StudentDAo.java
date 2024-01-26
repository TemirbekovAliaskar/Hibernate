package org.example.dao;

import org.example.entity.Student;

import java.util.List;

public interface StudentDAo {

//    CRUD

//    Create
    String saveStudent(Student student);
//    Read
    Student getStudentById(Long studentId);
    List<Student> getAllStudents();
//    Update
    Student update(Long oldStudent,Student newStudent);

//    Delete
    String deleteStudent (Long studentId);


}
