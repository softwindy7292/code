
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
	public static void printStars(int star) {
		for(int i = 0;i < star;i++) {
			for(int j = 0;j <= i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	public static void printStar1(int star) {
		for(int i = 0;i < star;i++) {
			for(int j = 0;j <= i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	public static void printStar2(int star) {
		for(int i = 1;i <= star;i++) {
			for(int j = 1;j <= star+1-i;j++) {	
				System.out.print("*");				
			}
			System.out.print("\n");
		}
	}
	public static void printStar3(int star) {
		for(int i = 1;i <= star;i++) {
			for(int j = 1;j <= star;j++) {
				if(i + j <= star) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}			
			}
			System.out.print("\n");
		}
	}
	public static void sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
//		printHello();
//		sayHello2();
//		sum(1,2);
		printStar3(4);
	}

}
