package day_2024_08_08_PM;

public class GuGuDanMain {

	public static void main(String[] args) {
		for(int i = 1;i < 10;i++) {
			System.out.println(i + "단");
			for(int j = 1;j < 10;j++) {
				System.out.print(i + "*" + j + "=" + (i*j) + " ");
			}
			System.out.println();
		}
	}

}
