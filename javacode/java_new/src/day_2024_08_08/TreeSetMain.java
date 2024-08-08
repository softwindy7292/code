package day_2024_08_08;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(3);
		tree.add(2);
		tree.add(4);
		tree.add(1);
		System.out.println("인스턴스 수: " + tree.size());
		
		for(Integer n : tree)
			System.out.print(n.toString() + "\t");
		
		System.out.println();
		
		for(Iterator<Integer> itr = tree.iterator();itr.hasNext();)
			System.out.print(itr.next().toString() + "\t");
	}

}
