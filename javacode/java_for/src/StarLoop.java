
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
		int star = 6;
		
		for(int i = 0;i < star;i++) {
			for(int j = 0;j < 2*star-1;j++) {
				if(star-1-i <= j && j <= star-1+i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		
		System.out.println("-----------------------");
		int star2 = 2*star-1;
		
		for(int i = 0;i < star2;i++) {
			for(int j = 0;j < star2;j++) {
				if(i <= star2/2) {
					if(star2/2-i <= j && j <= star2/2+i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}else {
					if(star2/2-(star2-1-i) <= j && j <= star2/2+(star2-1-i)) {
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
