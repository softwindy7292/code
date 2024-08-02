package day_2024_08_02;

import java.util.ArrayList;

public class Wrapper {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		
		for(Integer num : arrList) {
			System.out.println(num);
		}
		
		int num = 10;
		Integer iObj = 10;
		Integer iObj2 = new Integer(10);
		Integer iObj3 = Integer.valueOf(10);
		
		int num1 = iObj;
		System.out.println(num1);
		
		System.out.println(num);
		System.out.println(iObj);
		System.out.println(iObj2);
		System.out.println(iObj3);
	}

}
