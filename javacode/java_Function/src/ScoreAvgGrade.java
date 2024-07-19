
public class ScoreAvgGrade {	
	public static double getAvg(double kor, double math, double eng) {
		double avg = (kor + math + eng) / 3;
		
		return avg;
	}
	
	public static char getGrade(double avg) {
		char grade;
		
		if(avg >= 90) {
			grade = '수';
		}else if(avg >= 80) {
			grade = '우';
		}else if(avg >= 70) {
			grade = '미';
		}else if(avg >= 60) {
			grade = '양';
		}else {
			grade = '가';
		}
		
		return grade;
	}
	
	public static void main(String[] args) {
		double avg = getAvg(70,80,90);
		char grade = getGrade(avg);
		
		System.out.println("평균: " + avg);
		System.out.println("성적: " + grade);
	}

}
