package day_2024_08_09_AM;

import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		System.out.println(map.get(45));
		System.out.println(map.get(37));
		System.out.println(map.get(23));
	}

}
