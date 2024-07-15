
public class IfElse3 {

	public static void main(String[] args) {
		int num1 = 1, num2 = 1314, num3 = 896986;
		
		if((num1 > num2) && (num1 > num3)) {
			System.out.println("최댓값: " + num1);
		}else if((num2 > num1) && (num2 > num3)) {
			System.out.println("최댓값: " + num2);
		}else {
			System.out.println("최댓값: " + num3);
		}
		
		if((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
			System.out.println("중간값: " + num1);
		}else if((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
			System.out.println("중간값: " + num2);
		}else {
			System.out.println("중간값: " + num3);
		}
		
		int a = true ? 1290441:124415;
		int b = false ? 1290441:124415;
		
		System.out.println(a);
		System.out.println(b);
	}

}
