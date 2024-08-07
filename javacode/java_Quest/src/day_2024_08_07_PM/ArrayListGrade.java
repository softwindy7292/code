package day_2024_08_07_PM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListGrade {

	public static void main(String[] args) {
		List<String> grade = new ArrayList<>();
		final int GRADENUM = 6;
		double sum = 0;

		System.out.print("학점 6개를 띄어쓰기 해서 순서대로 입력 >> ");
		Scanner sc = new Scanner(System.in);
		
		while(grade.size() < GRADENUM) {		
			grade.add(sc.next());
		}
		
		for (int i = 0;i < GRADENUM; i++) {
			if (grade.get(i).equals("A"))
				sum += 4.0;
			else if (grade.get(i).equals("B"))
				sum += 3.0;
			else if (grade.get(i).equals("C"))
				sum += 2.0;
			else if (grade.get(i).equals("D"))
				sum += 1.0;
			else if (grade.get(i).equals("F"))
				sum += 0;
			else {
				System.out.println(i + "번째 배열 " + grade.get(i) + "는 잘못 된 값 입니다.");
				System.out.println("A, B, C, D, F 중 하나를 입력해주세요!");
				grade.set(i, sc.next());
				i--;
			}
		}
		System.out.println(grade);
		System.out.println(sum / 6);
	}

}
