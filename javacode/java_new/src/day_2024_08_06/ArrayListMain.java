package day_2024_08_06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(int i = 0;i < list.size();i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
		
		list.remove(0);
		
		for(String str : list) {
			System.out.print(str + "\t");
		}
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
	}

}
