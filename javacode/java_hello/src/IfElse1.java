
public class IfElse1 {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 7;
		
		if(n1 < n2) {
			System.out.println("n1 < n2 is true");
		}
		
		if(n1 == n2) {
			System.out.println("n1 == n2 is true");
		}
		else {
			System.out.println("n1 == n2 is false");
		}
		
		int num = 6;
		
		if(num % 2 == 0) {
			System.out.println(num + "은 짝수입니다.");
		}
		else {
			System.out.println(num + "은 홀수입니다.");
		}
		
		if((1 <= num) && (num <= 100)) {
			System.out.println(num + "은 100이하의 양수입니다.");
		}
		else {
			System.out.println(num + "은 100이하의 양수가 아닙니다.");
		}
		
		if((num % 2 == 0) && (num % 3 == 0)) {
			System.out.println(num + "은 2와 3의 배수입니다.");
		}
		else {
			System.out.println(num + "은 2와 3의 배수가 아닙니다.");
		}
	}

}
