package day_2024_08_08_PM;

import java.util.HashMap;
import java.util.Scanner;

public class MapCountry {

	public static void main(String[] args) {
		HashMap<String, Integer> country = new HashMap<>();
		String name;
		int people;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("나라 이름, 인구 >> ");
			name = sc.next();
			
			if(name.equals("그만"))
				break;
			
			people = sc.nextInt();			
			country.put(name, people);			
		}
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("인구검색 >> ");
			name = sc.nextLine();
			
			if(name.equals("그만"))
				break;
			
			if(country.containsKey(name))
				System.out.println(name + "의 인구는 " + country.get(name));
			else
				System.out.println(name + "나라는 없습니다.");
		}
		System.out.println("시스템 종료");
	}

}
