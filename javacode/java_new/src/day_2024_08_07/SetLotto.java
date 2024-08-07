package day_2024_08_07;

import java.util.HashSet;
import java.util.Set;

public class SetLotto {

	public static void main(String[] args) {
		Set<Integer> Lotto = new HashSet<>();
		
		while(Lotto.size() < 6)
			Lotto.add((int) (Math.random() * 45 + 1));
		
		System.out.println(Lotto);
	}

}
