
public class Test_0718 {
	public static void printStar(int star) {
		for(int i = 0;i < star;i++) {
			for(int j = 0;j < 5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		for(int i = 1;i < 10;i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i + "단");
			for(int j = 1;j < 10;j++) {
				System.out.print(i + "*" + j + "=" + i*j + " ");
			}
			System.out.println();
		}
		
		for(int i = 0;i < 5;i++) {
			for(int j = 0;j <= i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0;i < 5;i++) {
			for(int j = 0;j < 5;j++) {
				if(i + j < 4) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for(int i = 0;i < 5;i++) {
			for(int j = 0;j < 5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		printStar(5);
	}

}
