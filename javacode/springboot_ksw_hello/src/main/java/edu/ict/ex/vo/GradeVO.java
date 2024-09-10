package edu.ict.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GradeVO {
	private int kor;
	private int eng;
	private int math;
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public double getAvg() {
		return getTotal() / 3.0;
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
