package org.example.service;

import org.example.entity.Student;

import java.util.List;

public interface StudentService {
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
