
public class PrintAge {
	public static void hiEveryone(int age, double height) {
		System.out.println("제 나이는 " + age + "살 입니다.");
		System.out.println("저의 키는 " + height + "cm 입니다.");
	}
	
	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}
	
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public static void main(String[] args) {
		double height =  175.9;
		hiEveryone(12, 12.5);
		hiEveryone(13, height);
		byEveryone();
		System.out.println(sum(1,2));
	}

}
