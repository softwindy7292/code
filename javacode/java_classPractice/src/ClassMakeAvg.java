
class Grade{
	int kor, math, eng;
	double avg;
	char grade;
	
	void setKor(int k1) {
		kor = k1;
	}
	
	int getKor() {
		return kor;
	}
	
	void setEng(int e1) {
		eng = e1;
	}
	
	int getEng() {
		return eng;
	}
	
	void setMath(int m1) {
		math = m1;
	}
	
	int getMath() {
		return math;
	}
	
	double getAvg() {
		avg = (kor+eng+math)/3;
		return avg;
	}
	
	char getCharGrade() {
		avg = (kor+eng+math)/3;
		
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
	
	void getGrade() {
		System.out.println("성적: " + grade);
	}
	
	void checkGradeObject(Grade g) {
		g.getGrade();
	}
}

public class ClassMakeAvg {

	public static void main(String[] args) {
		//참조형의 크기는 4byte이다.(컴퓨터의 최대크기가 32bit일 때 자바가 개발되었기 때문에)
		Grade grade; //변수 선언(참조형)
		grade = new Grade(); //객체(인스턴스) 생성
		
		grade.setKor(10);
		grade.setEng(10);
		grade.setMath(10);
		
		System.out.println(grade.getKor());
		System.out.println(grade.getEng());		
		System.out.println(grade.getMath());
		
		System.out.println("평균: " + grade.getAvg());
		System.out.println(grade.getCharGrade() + " 입니다.");
		grade.getGrade();
		
		grade.checkGradeObject(grade);
	}

}
