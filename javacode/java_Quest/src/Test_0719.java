
public class Test_0719 {
	public static double getCircleArea(double r) {
		return r * r * Math.PI;
	}
	
	public static double getAvg(double kor, double eng, double math) {
		return (kor+eng+math)/3;
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
		System.out.println(getCircleArea(10));
		
		double kor = 80, eng = 90, math = 70;
		double avg = getAvg(kor, eng, math);
		char grade = getGrade(avg);
		
		System.out.println("평균: " + avg);
		System.out.println("성적: " + grade);
	}

}
