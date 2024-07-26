package day_2024_07_26_Q;

public class ArrayMaxNum {

	public static void main(String[] args) {
		int[] num = new int[5];
		int max = 0;
		
		for(int i = 0;i < num.length;i++) {
			num[i] = (int)(Math.random()*10);
			max = (num[i] > max)?num[i]:max;
		}
		System.out.println(max);
	}

}