package day_2024_07_26_Q;

import java.util.Scanner;

public class ArrayAtoZ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] AtoZ = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		for(int i = 0;i < 26;i++) {
			System.out.print(AtoZ[i] + " ");
		}
	}

}
