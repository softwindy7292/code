package day_2024_07_26;

import java.util.Scanner;

class Rectangle{
	private double width, height;
	
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	public double getArea() {
		return width * height;
	}
}

public class ArrayRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle[] arrRect = new Rectangle[3];
//		arrRect[0] = new Rectangle(10, 10);
//		arrRect[1] = new Rectangle(17, 89);
//		arrRect[2] = new Rectangle(90, 100);
		double areaSum = 0;
		
		for(int i = 0;i < arrRect.length;i++) {
			System.out.print("가로: ");
			int width = sc.nextInt();
			System.out.print("세로: ");
			int height = sc.nextInt();
			arrRect[i] = new Rectangle(width, height);
			System.out.println((i+1) + "번 사각형의 넓이: " + arrRect[i].getArea());
			areaSum += arrRect[i].getArea();
		}
		
		System.out.println("모든 사각형의 넓이의 합: " + areaSum);
	}

}
