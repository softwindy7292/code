package day_2024_07_29_PM;

import java.util.Scanner;

public class ArrayRandom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayNum = sc.nextInt();
		int[] random = new int[arrayNum];

		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 100 + 1);
			for(int j = 0; j < i; j++) {
				while(random[i] == random[j]) {
					random[i] = (int) (Math.random() * 100 + 1);
				}
			}
			System.out.print(random[i] + " ");
		}
	}

}
