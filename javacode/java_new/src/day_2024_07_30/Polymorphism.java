package day_2024_07_30;

class Dance{
	public void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class PersonDance extends Dance{
	@Override
	public void dance() {
		System.out.println("사람이 춤을 춥니다.");
	}
}

class RobotDance extends Dance{
	@Override
	public void dance() {
		System.out.println("로봇이 춤을 춥니다.");
	}
}

class AIDance extends Dance{
	@Override
	public void dance() {
		System.out.println("AI가 춤을 춥니다.");
	}
}

class Shape{
	
	public double getArea() {
		return 0;
	}
}

class Circle extends Shape{
	protected double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	@Override
	public double getArea() {
		return r * r *Math.PI;
	}
}

class Rectangle extends Shape{
	protected double width, height;
	
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	@Override
	public double getArea() {
		return width * height;
	}
}

class Triangle extends Shape{
	protected double width, height;
	
	public Triangle(double w, double h) {
		width = w;
		height = h;
	}
	
	@Override
	public double getArea() {
		return width * height / 2;
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		Dance dance = new PersonDance();
		dance.dance();
		
		dance = new RobotDance();
		dance.dance();
		
		dance = new AIDance();
		dance.dance();
		
		Dance[] arrdance = { new PersonDance(), new RobotDance(), new AIDance() };
		
		for (Dance dan : arrdance) {
			dan.dance();
		}
		
		double area = 0;
		Shape[] arrShape = new Shape[6];
		
		arrShape[0] = new Circle(10);
		arrShape[1] = new Circle(20);
		arrShape[2] = new Rectangle(10, 10);
		arrShape[3] = new Rectangle(20, 20);
		arrShape[4] = new Triangle(10, 10);
		arrShape[5] = new Triangle(20, 20);
		
		for (Shape shape : arrShape) {
			area += shape.getArea();
		}
		System.out.println(area);
	}

}
