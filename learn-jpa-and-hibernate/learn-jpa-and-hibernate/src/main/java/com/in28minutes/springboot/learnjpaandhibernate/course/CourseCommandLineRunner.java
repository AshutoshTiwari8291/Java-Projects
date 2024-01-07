package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJPARepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJPARepository repository;

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
//		repository.insert(new Course(1, "Learn AWS New JPA", "In 28 min"));
//		repository.insert(new Course(2, "Learn Azure New JPA", "In 28 min"));
//		repository.insert(new Course(3, "Learn Devops New JPA", "In 28 min"));
//		repository.insert(new Course(4, "Learn SQL New JPA", "In 28 min"));
//		repository.deleteById(1);

		repository.save(new Course(1, "Learn AWS New JPA", "In 28 min"));
		repository.save(new Course(2, "Learn Azure New JPA", "In 28 min"));
		repository.save(new Course(3, "Learn Devops New JPA", "In 28 min"));
		repository.save(new Course(4, "Learn SQL New JPA", "In 28 min"));
		repository.deleteById(1l);

		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("In 28 min"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("In 28 min"));
		System.out.println(repository.findByName("Learn SQL New JPA"));

	}

}
