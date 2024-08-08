package day_2024_08_08_AM;

import java.util.HashSet;
import java.util.Set;

public class SetLottoMain {

	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<>();

		while (lotto.size() < 6)
			lotto.add((int) (Math.random() * 45 + 1));

		System.out.println(lotto);
	}

}
