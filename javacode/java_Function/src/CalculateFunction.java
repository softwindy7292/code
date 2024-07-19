
public class CalculateFunction {	
	public static void sum(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("더하기: " + result);
	}
	
	public static void sub(double num1, double num2) {
		double result = num1 - num2;
		System.out.println("빼기: " + result);
	}
	
	public static void mul(double num1, double num2) {
		double result = num1 * num2;
		System.out.println("곱하기: " + result);
	}
	
	public static void square(double num1) {
		double result = num1 * num1;
		System.out.println("제곱: " + result);
	}
	
	public static void div(double num1, double num2) {
		if(num2 == 0) {
			System.out.println("두번째 정수 값이 0입니다.");
			return;
		}
		double result = num1 / num2;
		System.out.println("나누기: " + result);
	}
	
	public static void getCircleArea(double r) {
		//final double PI = 3.14;
		double area = r * r * Math.PI;
		System.out.println("원의 넓이: " + area);
	}
	
	public static void getRectangleArea(double width, double height) {
		//final double PI = 3.14;
		double area = width * height;
		System.out.println("정사각형의 넓이: " + area);
	}
	
	public static void main(String[] args) {
		sum(1,2);
		sub(1,2);
		mul(1,2);
		square(2);
		div(1,0);
		getCircleArea(10);
		getRectangleArea(12.5, 13.5);
	}

}
