package day_2024_07_25;

class Overloading{
	
	public void function() {
		System.out.println("함수");
	}
	
	public void function(int num) {
		System.out.println(num);
	}
	
	public void function(double num) {
		System.out.println(num);
	}
	
	public void function(int num1, int num2) {
		System.out.println(num1);
		System.out.println(num2);
	}
}

class Person{
	private int regiNum;
	private int passNum;
	
	public Person(int rnum, int pnum) {
		regiNum = rnum;
		passNum = pnum;
	}
	
	public Person(int rnum) {
		this(rnum, 0);
	}
	
	public void showPersonalInfo() {
		System.out.println("주민등록번호: " + regiNum);
		
		if(passNum == 0)
			System.out.println("여권을 가지고 있지 않습니다.\n");
		else
			System.out.println("여권번호: " + passNum + "\n");
	}
}

public class OverloadingEx {

	public static void main(String[] args) {
		Overloading ex = new Overloading();
		ex.function();
		ex.function(10);
		
		Person kim = new Person(740665, 458125);
		Person lee = new Person(562025);
		
		kim.showPersonalInfo();
		lee.showPersonalInfo();
	}

}
