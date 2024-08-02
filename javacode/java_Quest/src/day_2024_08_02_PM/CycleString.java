package day_2024_08_02_PM;

import java.util.Scanner;

public class CycleString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하시오");
		String cycle = sc.nextLine();
		
		for(int i = 0;i < cycle.length();i++) {
			int at = i;
			for(int j = 0;j < cycle.length();j++) {				
				if(at % cycle.length() == 0)
					at = 0;
				System.out.print(cycle.charAt(at++));
			}
			System.out.println();
		}
		System.out.println(cycle);
	}

}
