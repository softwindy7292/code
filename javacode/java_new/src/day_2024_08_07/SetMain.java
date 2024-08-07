package day_2024_08_07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Toy");
		set.add("box");
		set.add("Robot");
		set.add("box");
		System.out.println("인스턴스 수: " + set.size());

		for (Iterator<String> itr = set.iterator(); itr.hasNext();)
			System.out.print(itr.next() + "\t");
		System.out.println();

		for (String s : set)
			System.out.print(s + "\t");
		System.out.println();
	}

}