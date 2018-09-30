package com.luv2code.hibernate.demo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();
			
			List<Student> students = session.createQuery("from Student").getResultList();
			
			for (int i = 0; i < students.size(); i++) {
				System.out.println(students.get(i));
			}
			
			students = session.createQuery("from Student where lastName LIKE '%fuck%'").getResultList();
			
			for (int i = 0; i < students.size(); i++) {
				System.out.println(students.get(i));
			}
			
			session.getTransaction().commit();
		
 		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}

}
