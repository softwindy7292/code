package com.javalec.ex.student;

public class Grade {
	private int kor;
	private int eng;
	private int math;
	
	public Grade() {}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTotal() {
		return kor + eng + math;
	}

	public double getAvg() {
		return getTotal() / 3.0;
	}
	
}
