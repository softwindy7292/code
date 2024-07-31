package day_2024_07_31_AM;

class Shape{
	public double getArea() {
		return 0;
	}
}

class Circle extends Shape{
	double radius;
	
	public Circle(double r) {
		radius = r;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
}

class Rectangle extends Shape{
	double width, height;
	
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	public double getArea() {
		return width * height;
	}
}

class Triangle extends Shape{
	double width, height;
	
	public Triangle(double w, double h) {
		width = w;
		height = h;
	}
	
	public double getArea() {
		return width * height / 2;
	}
}

public class ExtendsShape {

	public static void main(String[] args) {
        Shape[] arrShape = {new Circle(5),new Rectangle(5,5),new Triangle(10, 5)};
        double area = 0;
        for (Shape shape : arrShape) {
        	System.out.println(shape.getArea());
        	area = area + shape.getArea();
        }
        System.out.println(area);
	}

}
