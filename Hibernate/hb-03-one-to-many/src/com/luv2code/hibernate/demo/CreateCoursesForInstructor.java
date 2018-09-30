package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.entity.Course;
import com.luv2code.entity.Instructor;

public class CreateCoursesForInstructor {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();
			
			Instructor instructor = session.get(Instructor.class, 1);
			
			System.out.println("instructor");
			
			instructor.addCourse(new Course("Java"));
			instructor.addCourse(new Course("C++"));
			
			session.save(instructor);
			
			session.getTransaction().commit();
			
		} finally {
			session.close();
			factory.close();
		}
	}

}
