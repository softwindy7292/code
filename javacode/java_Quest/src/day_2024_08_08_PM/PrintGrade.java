package day_2024_08_08_PM;

import java.util.Scanner;

public class PrintGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };

		while (true) {
			System.out.print("과목이름 >> ");
			String answer = sc.nextLine();

			if (answer.equals("그만"))
				break;
			
			if (answer.equals(course[0]))
				System.out.println(course[0] + "의 점수는 " + score[0]);
			else if (answer.equals(course[1]))
				System.out.println(course[1] + "의 점수는 " + score[1]);
			else if (answer.equals(course[2]))
				System.out.println(course[2] + "의 점수는 " + score[2]);
			else if (answer.equals(course[3]))
				System.out.println(course[3] + "의 점수는 " + score[3]);
			else if (answer.equals(course[4]))
				System.out.println(course[4] + "의 점수는 " + score[4]);
			else {
				System.out.println("없는 과목입니다.");
			}

		}
		System.out.println("성적확인을 끝냅니다.");
	}

}
