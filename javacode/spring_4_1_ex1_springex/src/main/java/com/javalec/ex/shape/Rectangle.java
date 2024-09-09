package com.javalec.ex.shape;

public class Rectangle implements Shape {
	private double width;
	private double height;
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
}
