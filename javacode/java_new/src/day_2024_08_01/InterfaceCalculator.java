package day_2024_08_01;

interface ICalculator{
   int add(int num1,int num2);
   int sub(int num1,int num2);
   int mul(int num1,int num2);
   int div(int num1,int num2);   
}

class MyCalculator implements ICalculator{
	
	public int add(int num1,int num2) {
		return num1 + num2;
	}
	
	public int sub(int num1,int num2) {
		return num1 - num2;
	}
	
	public int mul(int num1,int num2) {
		return num1 * num2;
	}
	
	public int div(int num1,int num2) {
		if(num2 == 0) {
			System.out.println("0으로 나누기는 불가능한 연산입니다.");
			return 0;
		}		
		return num1 / num2;
	}
}

public class InterfaceCalculator {

	public static void main(String[] args) {
		ICalculator calculator = new MyCalculator();
		System.out.println(calculator.add(2, 1));
		System.out.println(calculator.sub(2, 1));
		System.out.println(calculator.mul(2, 1));
		System.out.println(calculator.div(2, 1));
	}

}
