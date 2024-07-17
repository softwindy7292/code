
public class StarLoop {

	public static void main(String[] args) {
		for(int i = 0;i < 5;i++) {
			for(int j = 0;j < 5;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("-----------------------");
		
		for(int i = 0;i < 5;i++) {
			for(int j = 0;j <= i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("-----------------------");
		
		for(int i = 1;i <= 5;i++) {
			for(int j = 1;j <= 6-i;j++) {	
				System.out.print("*");				
			}
			System.out.print("\n");
		}
		
		System.out.println("-----------------------");
		
		for(int i = 1;i <= 5;i++) {
			for(int j = 1;j <= 5;j++) {
				if(i > j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}			
			}
			System.out.print("\n");
		}
		
		System.out.println("-----------------------");
		
		for(int i = 1;i <= 5;i++) {
			for(int j = 1;j <= 5;j++) {
				if(i + j <= 5) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}			
			}
			System.out.print("\n");
		}
		
		System.out.println("-----------------------");
		
		for(int i = 0;i < 4;i++) {
			for(int j = 1;j <= 7;j++) {
				if(4 - i <= j && j <= 4 + i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		
		System.out.println("-----------------------");
		
		for(int i = 1;i <= 9;i++) {
			for(int j = -4;j <= 4;j++) {
				if(i < 5) {
					if(i-(i-1) <= i+j && i+j <= i+(i-1)) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}else {
					if(i-((10-i)-1) <= i+j && i+j <= i+((10-i)-1)) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}			
			}
			System.out.print("\n");
		}
	}

}
