package day_2024_07_26_PM;

public class ArrayThree {

	public static void main(String[] args) {
		int[] arrRandom = new int[100];
		
		for(int i = 0;i < arrRandom.length;i++) {
			arrRandom[i] = (int) (Math.random()*100+1);
			if(arrRandom[i] % 3 == 0)
				System.out.print(arrRandom[i] + " ");
		}
	}

}
