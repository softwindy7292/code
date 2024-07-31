package day_2024_07_31_PM;

interface Shape{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.println("--- 다시 그립니다.");
		draw();
	}
}

class Circle implements Shape{
	private double radius;
	
	public Circle(double r) {
		radius = r;
	}
	
	public void draw() {
		System.out.println("O");
	}
	
	public double getArea() { 
		return radius * radius * Math.PI;
	}
}

public class InterfaceShape {

	public static void main(String[] args) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}

}
