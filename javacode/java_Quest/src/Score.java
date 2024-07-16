
public class Score {

	public static void main(String[] args) {
		double kor = 88.5;
		double math = 75.7;
		double eng = 85.4;
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
		
		double max = kor;
		
		max = (math > kor && math > eng) ? math:max;
		max = (eng > kor && eng > math) ? eng:max;
		
		System.out.println("최댓값: " + max);
	}

}
