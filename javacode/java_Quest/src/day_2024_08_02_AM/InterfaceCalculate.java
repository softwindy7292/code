package day_2024_08_02_AM;

interface ICalculator {
	int add(int num1, int num2);

	int sub(int num1, int num2);

	int mul(int num1, int num2);

	int div(int num1, int num2);
}

class MyCalculator implements ICalculator {
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	@Override
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	@Override
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	@Override
	public int div(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("잘못된 입력입니다.(0으로는 나눌 수 없습니다.)");
			return 0;
		}
		return num1 / num2;
	}
}

public class InterfaceCalculate {

	public static void main(String[] args) {
		ICalculator calculator = new MyCalculator();
		System.out.println(calculator.add(0, 0));
		System.out.println(calculator.sub(1, 1));
	}

}
