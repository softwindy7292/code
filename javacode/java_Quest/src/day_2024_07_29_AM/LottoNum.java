package day_2024_07_29_AM;

import java.util.Arrays;

public class LottoNum {

	public static void main(String[] args) {
		int[] lottoNum = new int[6];

		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				while (lottoNum[i] == lottoNum[j]) {
					lottoNum[i] = (int) (Math.random() * 45 + 1);
				}
			}
		}

		System.out.println(Arrays.toString(lottoNum));
	}

}
