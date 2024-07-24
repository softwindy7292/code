import java.util.Scanner;

class UpDownGame{
	private int answer;
	private int randInt = (int)(Math.random()*50+1);
	Scanner sc = new Scanner(System.in);	
	
	public void run() {
		System.out.println("테스트용 랜덤숫자: " + randInt);
		
		for(int i = 4;i >= 0;i--) {
			System.out.println("1~50 사이의 숫자를 입력해주세요.");
			answer = sc.nextInt();
			
			if(i == 0) {
				System.out.println("실패하였습니다. 정답은 " + randInt + "입니다.");
				break;
			}
			
			if(answer == randInt) {
				System.out.println("정답입니다.");
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

public class ClassUpDownGame {

	public static void main(String[] args) {
		UpDownGame game = new UpDownGame();
		game.run();
	}

}