package day_2024_08_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println(7/2);
			System.out.println(7/0);
			System.out.println("실행");
			int i = sc.nextInt();
			System.out.println("입력한 정수: " + i);
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("Input 에러 입니다.");
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Arith 에러 입니다.");
		}
		finally {
			System.out.println("굿바이");
		}
		
		System.out.println("종료입니다.");
	}

}
