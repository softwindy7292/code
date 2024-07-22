class Circle1{
	double radius;
	
	Circle1(){
		
	}
	
	Circle1(double r){
		radius = r;
	}
	
	void getArea(){
		System.out.println(radius * radius * Math.PI);
	}
}

class Rectangle1{
	double width, height;
	
	Rectangle1(){
		
	}
	
	Rectangle1(double w, double h){
		width = w;
		height = h;
	}
	
	void getArea(){
		System.out.println(width * height);
	}
}
public class ClassNewCircle {

	public static void main(String[] args) {
		Circle1 circle = new Circle1(10);		
		circle.getArea();
		
		Rectangle1 rectangle = new Rectangle1(10, 10);		
		rectangle.getArea();
	}

}
