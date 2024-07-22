class Circle3{
	double radius;
	
	void setRadius(double r) {
		radius = r;
	}
	
	double getArea() {
		return radius * radius * Math.PI;
	}
}
public class Test_0722 {

	public static void main(String[] args) {
		Circle3 circle = new Circle3();
		circle.setRadius(10);
		
		System.out.println(circle.getArea());
	}

}
