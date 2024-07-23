import java.util.Scanner;

class Circle{
	private double rad;
	
	public Circle(double r){
		rad = r;
	}
	
	public double getArea() {
		return rad * rad * Math.PI;
	}
}

public class LoopCircle {
	public static void main(String[] args) {
		String answer;
		double radius;
		Scanner sc = new Scanner(System.in); //입력기능을 가진 클래스
		Circle circle;
	   
		while(true) {
			System.out.print("원의 반지름을 입력하시오: ");
			radius = sc.nextDouble();
    	   
			circle = new Circle(radius);
			System.out.println("원의 넓이는 " + circle.getArea());
			System.out.println("계속하시겠습니까? y,n");
			answer = sc.next();
			if(answer.equals("Y")||answer.equals("y")) {
				continue;
			}else {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
