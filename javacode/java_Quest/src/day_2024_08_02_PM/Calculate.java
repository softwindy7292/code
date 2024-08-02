package day_2024_08_02_PM;

import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {
	private double num1, num2;
	private String symbol, answer;

	public void process() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			
			try {
				System.out.print("수1: ");
				num1 = sc.nextDouble();
				System.out.print("수2: ");
				num2 = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해 주세요!!!");
				continue;
			}
			
			System.out.print("연산자: ");
			symbol = sc.next();
			
			switch (symbol) {
			case "+":
				System.out.println("계산결과: " + add());
				break;
			case "-":
				System.out.println("계산결과: " + sub());
				break;
			case "*":
				System.out.println("계산결과: " + mul());
				break;
			case "/":
				System.out.println("계산결과: " + div());
				break;
			default:
				System.out.println("잘못된 연산자 입니다.(+, -, *, /) 만 가능");
				continue;
			}
			
			System.out.println("계속 하시겠습니까? 계속: Y, 종료: 아무버튼");
			answer = sc.next();
			if(answer.equals("Y")||answer.equals("y"))
				continue;
			else
				System.out.println("프로그램을 종료합니다.");
				break;
		}
	}

	public double add() {
		return num1 + num2;
	}

	public double sub() {
		return num1 - num2;
	}

	public double mul() {
		return num1 * num2;
	}

	public double div() {
		if(num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return 0;
		}
		return num1 / num2;
	}
}

public class Calculate {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.process();
	}

}
