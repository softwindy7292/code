package edu.ict.Shape;

public class Grade {
	private double kor, math, eng;
	private String name;

	public Grade(String name, double kor, double math, double eng) {
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	public String getName() {
		return name;
	}
	
	public double getKor() {
		return kor;
	}
	
	public double getMath() {
		return math;
	}
	
	public double getEng() {
		return eng;
	}
	
	public double getSum() {
		return kor + math + eng;
	}
	
	public double getAvg() {
		return (kor + math + eng) / 3;
	}
	
	public char getGrade() {
		double avg = getAvg();
		
		if(avg >= 90) {
			return '수';
		}else if(avg >= 80) {
			return '우';
		}else if(avg >= 70) {
			return '미';
		}else if(avg >= 60) {
			return '양';
		}else {
			return '가';
		}
		
		
				
	}
}