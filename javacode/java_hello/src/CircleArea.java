
public class CircleArea {

	public static void main(String[] args) {
		final double PI = 3.14;
		double r = 10;
		double area = r * r * PI;
		boolean b = area < 100;
		
		System.out.println("반지름: " + r + " 넓이: " + area);
		System.out.println("넓이가 100미만입니까?");
		System.out.println(b);
	}
}
