package day_2024_07_29;

public class ArrayTwo {

	public static void main(String[] args) {
		int[][] arr = new int[4][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10 + 1);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
