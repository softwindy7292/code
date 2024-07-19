
public class PrintHello {
	public static void printHello() {
		System.out.println("Hello World");
	}
	
	public static void sayHello() {
		System.out.println("Say Hello");
	}
	
	public static void sayHello2() {
		for(int i = 0;i < 5;i++) {
			System.out.println("Say Hello");
		}
	}
	
	public static void sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		printHello();
		sayHello2();
		sum(1,2);
	}

}
