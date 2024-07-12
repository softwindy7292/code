
public class LogicalOp {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		result = (1 < num1) && (num1 < 100);
		System.out.println("1 초과 100미만인가? " + result);
		
		result = ((num2 % 2) == 0) || ((num2 % 3) == 0);
		System.out.println("2 또는 3의 배수인가? " + result);
		
		result = !(num1 != 0);
		System.out.println("0 인가? " + result);
		
		int a = 10, b = 20, c = 30;
		a = b = c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
