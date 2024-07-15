
public class IfElse2 {

	public static void main(String[] args) {
		double kor = 96.5;
		double math = 80.4;
		double eng = 71.7;
		double total = kor + math + eng;
		double avg = total/3;
		
		System.out.println("국어: " + kor);
		System.out.println("수학: " + math);
		System.out.println("영어: " + eng);
		System.out.println("평균: " + avg);
		if(avg >= 90) {
			System.out.println("성적: 수");
		}else if(avg >= 80) {
			System.out.println("성적: 우");
		}else if(avg >= 70) {
			System.out.println("성적: 미");
		}else if(avg >= 60) {
			System.out.println("성적: 양");
		}else {
			System.out.println("성적: 가");
		}
	}

}
