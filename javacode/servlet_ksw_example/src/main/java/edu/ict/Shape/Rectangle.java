package edu.ict.Shape;

public class Rectangle {
	private double width, height;

	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}

	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return width * height;
	}
}