package day_2024_07_26;

import java.util.Scanner;

class Circle{
	private double radius;
	
	public Circle(double r) { radius = r; }
	
	public double getArea() {
		return radius * radius *Math.PI;
	}
}

public class ArrayCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle[] arrCircle = new Circle[3];
//		arrCircle[0] = new Circle(10);
//		arrCircle[1] = new Circle(15);
//		arrCircle[2] = new Circle(7);
		
		double areaSum = 0;
		
		for(int i = 0;i < arrCircle.length;i++) {
			System.out.print("반지름: ");
			int radius = sc.nextInt();
			arrCircle[i] = new Circle(radius);
			System.out.println((i+1) + "번 원의 넓이: " + arrCircle[i].getArea());
			areaSum += arrCircle[i].getArea();
		}
		
		System.out.println("모든 원의 넓이의 합: " + areaSum);
	}

}
