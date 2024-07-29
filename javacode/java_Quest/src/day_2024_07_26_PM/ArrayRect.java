package day_2024_07_26_PM;

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

public class ArrayRect {
	public static double RectAreaSum(Rectangle[] r) {
		double sum = 0;
		for(int i = 0;i < r.length;i++) {
			sum += r[i].getArea();
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle[] arrRect = new Rectangle[3];
		double areaSum = 0;
		
		for(int i = 0;i < arrRect.length;i++) {
			System.out.print("가로: ");
			int width = sc.nextInt();
			System.out.print("세로: ");
			int height = sc.nextInt();
			arrRect[i] = new Rectangle(width, height);
			areaSum += arrRect[i].getArea();
		}
		
		System.out.println("모든 사각형의 넓이의 합: " + areaSum);
		System.out.println("모든 사각형의 넓이의 합: " + RectAreaSum(arrRect));
	}
}