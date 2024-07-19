
public class StarPrint {
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

	public static void main(String[] args) {
		printStar3(4);
	}

}
