
class A{
	int num; //인스턴스 변수(클래스 전체에 선언된 변수)
	int kor, math, eng;
}

public class ClassTest {

	public static void main(String[] args) {
		//참조형의 크기는 4byte이다.(컴퓨터의 최대크기가 32bit일 때 자바가 개발되었기 때문에)
		A a; //변수 선언(참조형)
		a = new A(); //객체(인스턴스) 생성
		
		System.out.println(a.num);
		a.num = 3;
		System.out.println(a.num);
		
		System.out.println(a);
		
		a.kor = 80;
		a.math = 80;
		a.eng = 80;
		
		System.out.println(a.kor);
		System.out.println(a.math);
		System.out.println(a.eng);
	}

}
