package day_2024_07_26_PM;

public class ArrayAvg {

	public static void main(String[] args) {
		int[] random = new int[10];
		double sum = 0;
		double avg;
		
		for(int i = 0;i < random.length;i++) {
			random[i] = (int)(Math.random()*10+1);
			System.out.print(random[i] + " ");
			sum += random[i];
		}
		avg = sum / random.length;
		System.out.println("\n평균: " + avg);
	}

}