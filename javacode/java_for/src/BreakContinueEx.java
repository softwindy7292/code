
public class BreakContinueEx {

	public static void main(String[] args) {
		
		for(int i = 1;i <= 1000;i++) {
			if(i % 7 == 0 && i % 11 == 0) {
				System.out.println("7과 11의 첫번째 공배수: " + i);
				break;
			}
		}
		
		////////////////////////////////////////
		
		int num = 0;
		int count = 0;
		
		while((num++) < 100) {
			if(num % 3 != 0 || (num % 4) != 0) {
				continue;
			}
			count++;
			System.out.println(num);
		}
		System.out.println("count: " + count);
	}

}
