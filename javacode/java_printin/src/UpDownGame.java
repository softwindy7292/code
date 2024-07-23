import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		int answer;
		Scanner sc = new Scanner(System.in);
		int randInt = (int) (Math.random()*50+1);
		System.out.println("테스트용 랜덤숫자: " + randInt);
		
		for(int i = 4;i >= 0;i--) {
			System.out.println("숫자를 입력해주세요.");
			answer = sc.nextInt();
			
			if(answer == randInt) {
				System.out.println("정답입니다.");
				break;
			}
			
			if(i == 0) {
				System.out.println("실패하였습니다. 정답은 " + randInt + "입니다.");
				break;
			}
			
			if(answer < randInt) {
				System.out.println("업!! 기회가 " + i + "번 남았습니다.");
			}else {
				System.out.println("다운!! 기회가" + i + "번 남았습니다.");
			}
		}
	}

}