package edu.ict.bean;

public class Grade {
	private String name;
	private int kor, math, eng;

	public Grade() {
	}

	public Grade(String name, int kor, int math, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getSum() {
		return kor + math + eng;
	}
	
	public double getAvg() {
		return (kor + math + eng) / 3;
	}
	
	public char getGrade() {
		if(getAvg() >= 90) {
			return '수';
		}else if(getAvg() >= 80) {
			return '우';
		}else if(getAvg() >= 70) {
			return '미';
		}else if(getAvg() >= 60) {
			return '양';
		}else {
			return '가';
		}
	}
}
