import java.util.Scanner;

class Circle{
	private int radius;
	
	public Circle(int r){
		radius = r;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
}

public class Test_0724 {

	public static void main(String[] args) {
		int radius;
		String answer;
		Circle circle;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("원의 반지름을 입력하시오: ");
			radius = sc.nextInt();
			circle = new Circle(radius);
			
			System.out.println("원의 넓이는 " + circle.getArea());
			
			System.out.println("계속 하시겠습니까? y,n");
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
