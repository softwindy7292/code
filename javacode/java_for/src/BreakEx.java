
public class BreakEx {

	public static void main(String[] args) {
		
		for(int i = 1;i <= 1000;i++) {
			if(i % 7 == 0 && i % 11 == 0) {
				System.out.print("7과 11의 첫번째 공배수: " + i);
				break;
			}
		}
	}

}
