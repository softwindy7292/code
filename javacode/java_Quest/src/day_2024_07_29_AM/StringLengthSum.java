package day_2024_07_29_AM;

public class StringLengthSum {

	public static void main(String[] args) {
		int sum = 0;
		String[] sr = new String[4];

		sr[0] = "Java";
		sr[1] = "System";
		sr[2] = "Compiler";
		sr[3] = "Park";

		for (int i = 0; i < sr.length; i++)
			sum += sr[i].length();

		System.out.println(sum);
	}

}
