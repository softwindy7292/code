package day_2024_07_29;

public class ArrayEnhancedFor {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = 0;

		for (int i : arr) {
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println();
		System.out.println("sum: " + sum);
	}

}
