package day_2024_08_07;

import java.util.LinkedList;

class Circle{
	private int radius;
	
	public Circle(int r){
		radius = r;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
}

public class LinkedListMain3 {

	public static void main(String[] args) {
		LinkedList<Circle> list = new LinkedList<>();
		list.add(new Circle(10));
		list.add(new Circle(20));
		list.add(new Circle(30));
		
		double sum = 0;
		
		for(Circle circle : list) {
			sum += circle.getArea();
			System.out.print(circle.getArea() + "\t");
		}
		
		System.out.println();
		System.out.println("모든 원의 넓이 합: " + sum);
	}

}
