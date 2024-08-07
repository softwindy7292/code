package day_2024_08_06_PM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMax {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int max = 0;
		int i = 0;

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("양의 정수 입력(음수 입력 시 종료) >> ");
			list.add(sc.nextInt());
			max = (max > list.get(i)) ? max : list.get(i);
			
			if (list.get(i++) < 0)
				break;
		}
		
		System.out.println("최대값: " + max);
	}

}
