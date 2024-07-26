package day_2024_07_26;

public class ArrayString {

	public static void main(String[] args) {
		String[] sr = new String[10];
		sr[0] = "a";
		sr[1] = "a";
		sr[2] = "a";
		sr[3] = "a";
		sr[4] = "a";
		sr[5] = "a";
		sr[6] = "a";
		sr[7] = "a";
		sr[8] = "a";
		sr[9] = "a";
		
		int count = 0;
		
		for(int i = 0;i < sr.length;i++) {
			count += sr[i].length();
		}
		
		System.out.println("종 문자 개수: " + count);
	}

}
