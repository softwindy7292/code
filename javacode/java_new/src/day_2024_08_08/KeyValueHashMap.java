package day_2024_08_08;

import java.util.HashMap;

public class KeyValueHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");

		System.out.println("23번: " + map.get(23));
		System.out.println("37번: " + map.get(37));
		System.out.println("45번: " + map.get(45));
		System.out.println();

		map.remove(37);
		System.out.println("37번: " + map.get(37));
		System.out.println();

		for (Integer n : map.keySet())
			System.out.print(n.toString() + '\t');
		System.out.println();
		
		for (Integer n : map.keySet())
			System.out.print(map.get(n).toString() + '\t');
		System.out.println();
		System.out.println();

		System.out.println(map.containsKey(45));
		System.out.println(map.containsKey(60));
		System.out.println(map.containsValue("홍길동"));
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.replace(23, "me"));
		System.out.println("23번: " + map.get(23));
	}

}
