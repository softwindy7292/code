
public class ThreeMax {

	public static void main(String[] args) {
		int num1 = 1124, num2 = 14, num3 = 0;
		int max;
		
		max = (num1 > num2 && num1 > num3) ? num1:0;
		max = (num2 > num1 && num2 > num3) ? num2:max;
		max = (num3 > num1 && num3 > num2) ? num3:max;
		
		System.out.println(max);
	}
}
