package day_2024_07_29_AM;

import java.util.Arrays;

public class RandomMax {

	public static void main(String[] args) {
		int randMax = 10;
		int[] random = new int[5];
		int max = 0;
		int min = randMax;

		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * randMax);
			max = (random[i] > max) ? random[i] : max;
			min = (random[i] < min) ? random[i] : min;
		}

		System.out.println(Arrays.toString(random));
		System.out.println(max);
		System.out.println(min);
	}

}
