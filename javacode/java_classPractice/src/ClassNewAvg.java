class GradeNew{
	int math, science, english;
	double avg;
	GradeNew(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	double average() {
		avg = (math + science + english)/3; 
		return avg;
	}
}

public class ClassNewAvg {

	public static void main(String[] args) {
		int math = 90;
		int science = 80;
		int english = 70;
		GradeNew me = new GradeNew(math, science, english);
		
		System.out.println("평균: " + me.average());
	}

}