package day_2024_07_25;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		int aeiou = 0, wxyz = 0, empty = 0;
		char in;
		
		System.out.println("영어 문장을 입력하세요.");
		input = sc.nextLine();
		
		for(int i = 0;i < input.length();i++) {
			in = input.charAt(i);
			
			switch(in){
			case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U':
				aeiou++;
				break;
			case ' ':
				empty++;
				break;
			default:
				wxyz++;
			}
		}
		
		System.out.println("종 글자 수는 " + input.length() + "개 입니다.");
		System.out.println("모음은 " + aeiou + "개 입니다.");
		System.out.println("자음은 " + wxyz + "개 입니다.");
		System.out.println("공백은 " + empty + "개 입니다.");
	}

}