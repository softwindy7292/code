class Circle2{
	double area;
	int radius; //인스턴스 변수(클래스 전체에 선언된 변수)
	
	void setRadius(int r) {
		radius = r;
	}
	
	double getCircleArea() {
		area = radius * radius * Math.PI;
		return area;
	}
	
	void addCircle(Circle2 circle1,Circle2 circle2) {
		System.out.println(circle1.getCircleArea() + circle2.getCircleArea());
	}
	
	double mulCircle(Circle2 circle, double i) {
		return circle.getCircleArea() * i;
	}
	
	double absCircle(Circle2 circle1, Circle2 circle2) {
		double abs = circle1.getCircleArea() - circle2.getCircleArea();
		
		if(abs < 0) {
			abs *= -1;
		}
		
		return abs;
	}
}

public class CircleTest {

	public static void main(String[] args) {
		Circle2 circle1 = new Circle2(); ///변수 선언(참조형)
		circle1.setRadius(10);
		
		System.out.println(circle1.getCircleArea());
		
		Circle2 circle2 = new Circle2(); ///변수 선언(참조형)
		circle2.setRadius(10);
		
		System.out.println(circle2.getCircleArea());
		
		circle1.addCircle(circle1,circle2);
		
		System.out.println(circle1.mulCircle(circle1,2));
		System.out.println(circle2.mulCircle(circle2,3));
		
		System.out.println("두 원의 넓이의 차: " + circle1.absCircle(circle1, circle2));
	}

}
