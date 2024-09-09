package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javalec.ex.student.Student;

public class MainAnotation {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Student student = ctx.getBean("student1", Student.class);
		Student student2 = ctx.getBean("student2", Student.class);
		
		System.out.println(student.getAge() + ":" + student.getName());
		System.out.println(student2.getAge() + ":" + student2.getName());
		
		ctx.close();
	}
	
}
