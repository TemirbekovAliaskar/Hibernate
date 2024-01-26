package org.example;

import org.example.entity.Student;
import org.example.service.StudentService;
import org.example.service.impl.StudentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StudentService studentService = new StudentServiceImpl();
//        System.out.println(studentService.saveStudent(new Student("Jigit", "Turumbekov", "j@gmail.com", 21)));
//        System.out.println(studentService.saveStudent(new Student("Urmat", "Toichikov", "u@gmail.com", 11)));

//        studentService.update(1L,new Student("Nur","Medetov","n@gmail.com",33));
//        System.out.println(studentService.deleteStudent(1L));
//        System.out.println(studentService.getStudentById(1L));
//        System.out.println(studentService.getAllStudents());

//        System.out.println(studentService.saveStudent(new Student("Ali", "ASAS", "a@gmail.com", 33)));
//        System.out.println(studentService.getStudentById(2L));
//        System.out.println(studentService.getAllStudents());
//        studentService.update(3L,new Student("Adyl","AQQ","a@gmail.com",66));
        System.out.println(studentService.deleteStudent(3L));
    }
}
