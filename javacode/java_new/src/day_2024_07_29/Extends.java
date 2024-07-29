package day_2024_07_29;

class AAA {
	int aaa;

	public AAA() {
		System.out.println("AAA생성자");
	}
	
	public AAA(int a) {
		aaa = a;
	}

	public void aaaFunction() {
		System.out.println("AAA클래스의 aaa함수호출");
	}
}

class BBB extends AAA {
	int bbb;
	
	public BBB(int a, int b) {
		super(a);
		this.aaa = a;
		super.aaa = a;
		bbb = b;
		System.out.println("BBB생성자");
	}
}

public class Extends {

	public static void main(String[] args) {
		AAA aaa = new AAA();
		BBB bbb = new BBB(1, 2);

		System.out.println(aaa.aaa);
		aaa.aaaFunction();

		System.out.println(bbb.aaa);
		System.out.println(bbb.bbb);
	}

}
