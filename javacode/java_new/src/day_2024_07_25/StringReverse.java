package day_2024_07_25;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder rever = new StringBuilder();
		String input;
		char in;
		
		System.out.println("문장을 입력하세요.");
		input = sc.nextLine();
		
		for(int i = (input.length()-1);i >= 0;i--) {
			in = input.charAt(i);
			rever.append(in);
		}
		
		System.out.println(rever);
	}

}