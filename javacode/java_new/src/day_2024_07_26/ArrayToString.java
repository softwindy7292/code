package day_2024_07_26;

import java.util.Arrays;

public class ArrayToString {

	public static void main(String[] args) {
		int[] intArr = new int[3];
		intArr[0] = 0;
		intArr[1] = 1;
		intArr[2] = 2;
		
		int[] intArr2 = {0,1,2};
		
		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(intArr2));
	}

}
