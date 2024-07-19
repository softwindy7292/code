class Star{
	
	void starDiamond(int max_Star) {
		for(int i = 0;i < max_Star;i++) {
			for(int j = 0;j < max_Star;j++) {
				if(i <= max_Star/2) {
					if(max_Star/2-i <= j && j <= max_Star/2+i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}else {
					if(max_Star/2-(max_Star-1-i) <= j && j <= max_Star/2+(max_Star-1-i)) {
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
public class PrintStar {

	public static void main(String[] args) {
		Star star = new Star();
		
		star.starDiamond(5);
	}

}
