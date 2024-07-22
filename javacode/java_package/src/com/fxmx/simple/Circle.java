package com.fxmx.simple;

public class Circle {
	double rad;
	final double PI;
	
	public Circle(double r){
		rad = r;
		PI = 3.14;
	}
	
	public double getPara() {
		return rad * rad * PI;
	}
}
