//이름 짓는 법
//1.낙타(camel case) 표기법 - 각 단어 첫 글자를 대문자로(클래스 이름, 변수)
//2.뱀(snake case) 표기법 - 단어 사이에 _ 넣기(상수 이름)
public class Constants {

	public static void main(String[] args) {
		final int MAX_SIZE = 100;
		final char CONST_CHAR = '상';
		final int CONST_ASSIGNED;
		CONST_ASSIGNED = 12;
		
		System.out.println("상수 1 : " + MAX_SIZE);
		System.out.println("상수 2 : " + CONST_CHAR);
		System.out.println("상수 3 : " + CONST_ASSIGNED);
	}

}
