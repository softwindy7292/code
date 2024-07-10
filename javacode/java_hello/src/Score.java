
public class Score {

	public static void main(String[] args) {
		int kor = 80;
		int math = 90;
		int eng = 70;
		int total = kor + math + eng;
		int avr = total/3;
		
		System.out.println("국어: " + kor);
		System.out.println("수학: " + math);
		System.out.println("영어: " + eng);
		System.out.println("총점: " + total);
		System.out.println("평균: " + avr);
	}
}
