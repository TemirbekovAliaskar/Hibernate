package org.example.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.config.HibernateConfig;
import org.example.dao.StudentDAo;
import org.example.entity.Student;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentDaoImpl implements StudentDAo {
    EntityManagerFactory entityManagerFactory = HibernateConfig.getEntityManager();
    @Override
    public String saveStudent(Student student) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();
        return student.getFirstName() + "Added !";
    }

    @Override
    public Student getStudentById(Long studentId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Student student = entityManager.find(Student.class,studentId);
        entityManager.getTransaction().commit();
        entityManager.close();
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Student> students = entityManager.createQuery("select s from Student s ", Student.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return students;
    }

    @Override
    public Student update(Long oldStudent, Student newStudent) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Student student = getStudentById(oldStudent);
        student.setFirstName(newStudent.getFirstName());
        student.setLastName(newStudent.getLastName());
        student.setEmail(newStudent.getEmail());
        student.setAge(newStudent.getAge());
        entityManager.merge(student);
        entityManager.getTransaction().commit();
        entityManager.close();
        return student;
    }

    @Override
    public String deleteStudent(Long studentId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Student student = entityManager.find(Student.class,studentId);
        entityManager.remove(student);
        entityManager.getTransaction().commit();
        entityManager.close();

        return student.getFirstName() + "Deleted !";
    }


//    @Override
//    public String saveStudent(Student student) {
//        Session session = HibernateConfig.getsession().openSession();
//        session.beginTransaction();
//        session.persist(student);
//        session.getTransaction().commit();
//        session.close();
//        return student.getFirstName()+ "saved !";
//    }
//
//    @Override
//    public Student getStudentById(Long studentId) {
//        Session session = HibernateConfig.getsession().openSession();
//        session.beginTransaction();
//        Student student = session.get(Student.class, studentId);
//        session.getTransaction().commit();
//        session.close();
//        return student;
//    }
//
//    @Override
//    public List<Student> getAllStudents() {
//        Session session = HibernateConfig.getsession().openSession();
//        session.beginTransaction();
//        List<Student> resultList = session.createQuery("select s from Student s",Student.class).getResultList();
//        session.getTransaction().commit();
//        session.close();
//        return resultList;
//    }
//
//    @Override
//    public Student update(Long oldStudent, Student newStudent) {
//        Session session = HibernateConfig.getsession().openSession();
//        session.beginTransaction();
//        Student student = getStudentById(oldStudent);
//        student.setFirstName(newStudent.getFirstName());
//        student.setLastName(newStudent.getLastName());
//        student.setEmail(newStudent.getEmail());
//        student.setAge(newStudent.getAge());
//
//        session.merge(student); //кошуу слияние
//        session.getTransaction().commit();
//        session.close();
//        return null;
//    }
//
//    @Override
//    public String deleteStudent(Long studentId) {
//        Session session = HibernateConfig.getsession().openSession();
//        session.beginTransaction();
//        Student student = session.get(Student.class, studentId);
//        session.remove(student);
//        session.getTransaction().commit();
//        session.close();
//        return student.getFirstName() + "successful deleted!";
//    }
}
