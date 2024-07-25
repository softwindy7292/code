package day_2024_07_25;

public class StringCompareTo {

	public static void main(String[] args) {
		String st1 = "Aexicographically";
		String st2 = "aexicographically";
		int cmp;

		if (st1.equals(st2))
			System.out.println("두 문자열은 같습니다.");
		else
			System.out.println("두 문자열은 다릅니다.");

		cmp = st1.compareTo(st2); //유니코드 기준으로 사전검색(객체가 작으면 음수 비교값이 작으면 양수)
		if (cmp == 0)
			System.out.println("두 문자열은 일치합니다.");
		else if (cmp < 0)
			System.out.println("사전의 앞에 위치하는 문자: " + st1);
		else
			System.out.println("사전의 앞에 위치하는 문자: " + st2);

		if (st1.compareToIgnoreCase(st2) == 0) //대소문자 구분을 없애고 비교
			System.out.println("두 문자열은 같습니다.");
		else
			System.out.println("두 문자열은 다릅니다.");

	}

}
