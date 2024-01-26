package org.example.service.impl;

import org.example.dao.StudentDAo;
import org.example.dao.impl.StudentDaoImpl;
import org.example.entity.Student;
import org.example.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    StudentDAo studentDAo = new StudentDaoImpl();

    @Override
    public String saveStudent(Student student) {
        return studentDAo.saveStudent(student);
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentDAo.getStudentById(studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDAo.getAllStudents();
    }

    @Override
    public Student update(Long oldStudent, Student newStudent) {
        return studentDAo.update(oldStudent, newStudent);
    }

    @Override
    public String deleteStudent(Long studentId) {
        return studentDAo.deleteStudent(studentId);
    }
//    @Override
//    public String saveStudent(Student student) {
//        studentDAo.saveStudent(student);
//        return null;
//    }
//
//    @Override
//    public Student getStudentById(Long studentId) {
//        return studentDAo.getStudentById(studentId);
//    }
//
//    @Override
//    public List<Student> getAllStudents() {
//        return studentDAo.getAllStudents();
//    }
//
//    @Override
//    public Student update(Long oldStudent, Student newStudent) {
//        return studentDAo.update(oldStudent,newStudent);
//    }
//
//    @Override
//    public String deleteStudent(Long studentId) {
//        return studentDAo.deleteStudent(studentId);
//    }
}
