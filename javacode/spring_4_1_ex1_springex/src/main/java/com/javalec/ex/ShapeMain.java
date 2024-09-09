package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.javalec.ex.pencil.Pencil;
import com.javalec.ex.shape.Shape;

public class ShapeMain {
	
	public static void main(String[] args) {
		
		String config = "classpath:appCTX4.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		
		Shape rectangle = ctx.getBean("rectangle", Shape.class);
		Shape triangle = ctx.getBean("triangle", Shape.class);
		
		System.out.println("사각형 넓이 : " + rectangle.getArea());
		System.out.println("삼각형 넓이 : " + triangle.getArea());
		
		ctx.close();
		
	}
	
}
