
public class CircleArea {

	public static void main(String[] args) {
		final double PI = 3.14;
		double r = 10;
		double Circle = r * r * PI;
		
		System.out.print("반지름: " + r);
		System.out.println("  넓이: " + Circle);
		System.out.println("넓이가 100 미만입니까?\n" + (100 > Circle));
	}
}
