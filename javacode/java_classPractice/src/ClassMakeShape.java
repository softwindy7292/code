
class Circle{
	double area;
	int radius; //인스턴스 변수(클래스 전체에 선언된 변수)
	
	void setRadius(int r) {
		radius = r;
	}
	
	double getCircleArea() {
		area = radius * radius * Math.PI;
		return area;
	}
}

class Rectangle{
	double area;
	double width, height; //인스턴스 변수(클래스 전체에 선언된 변수)
	
	void setWidthHeight(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double getRectangleArea() {
		area = width * height;
		return area;
	}
	
	void printRectangleArea(Rectangle a) {
		System.out.println(a.getRectangleArea());
	}
}

public class ClassMakeShape {

	public static void main(String[] args) {
		//참조형의 크기는 4byte이다.(컴퓨터의 최대크기가 32bit일 때 자바가 개발되었기 때문에)
		Circle circle = new Circle(); ///변수 선언(참조형)
		circle.setRadius(10);
		
		System.out.println(circle.getCircleArea());
		
		Rectangle rectangle = new Rectangle(); ///변수 선언(참조형)
		rectangle.setWidthHeight(10,20);
		
		System.out.println(rectangle.getRectangleArea());
		rectangle.printRectangleArea(rectangle);
	}

}
