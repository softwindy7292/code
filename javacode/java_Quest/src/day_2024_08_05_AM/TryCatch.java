package day_2024_08_05_AM;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		double[] grade = new double[8];
		double sum = 0;
		
		System.out.println("8학기 학점을 순서대로 입력하세요.");
		
		for(int i = 0;i < 8;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print((i + 1) + "학기 학점 >> ");
			
			try {
				grade[i] = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				i--;
				continue;
			}
			sum += grade[i];
		}

		System.out.println("8학기 평균 학점: " + (sum / 8));
	}

}
