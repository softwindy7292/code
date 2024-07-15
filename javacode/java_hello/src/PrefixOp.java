
public class PrefixOp {

	public static void main(String[] args) {
		int num1 = 7;
		System.out.println(++num1);
		System.out.println(++num1);
		System.out.println(num1);
		
		int num2 = 5;
		System.out.print(num2++);
		System.out.print(num2++);
		System.out.println(num2);

		System.out.print(num2--);
		System.out.print(num2--);
		System.out.println(num2);
	}

}
