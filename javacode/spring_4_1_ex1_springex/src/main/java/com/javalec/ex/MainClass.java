package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.javalec.ex.student.Student;

public class MainClass {
	
	public static void main(String[] args) {
		
		String configLocation = "classpath:applicationCTX.xml";
		
		//스프링 => Ioc 컨테이너
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		Student student = ctx.getBean("student", Student.class);
		Student student2 = ctx.getBean("student2", Student.class);
		Student student3 = ctx.getBean("student3", Student.class);
		//student.setAge(10);
		//student.setName("홍길동");
		
		student.getGrade().setKor(100);
		
		System.out.println(student.getAge() + ":" + student.getName() + ":" + student.getGrade().getKor());
		System.out.println(student2.getAge() + ":" + student2.getName());
		System.out.println("국어 : " + student2.getGrade().getKor());
		System.out.println("영어 : " + student2.getGrade().getEng());
		System.out.println("수학 : " + student2.getGrade().getMath());
		System.out.println("총점 : " + student2.getGrade().getTotal());
		System.out.println("평균 : " + student2.getGrade().getAvg());
		System.out.println(student3.getAge() + ":" + student3.getName());
		System.out.println(student3.getHobbys());
		//MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
		//myInfo.getInfo();
		ctx.close();
		
	}
	
}
