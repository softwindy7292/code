package day_2024_07_29_PM;

import java.util.Scanner;

class RockScissorPaper{
	public static final String arrRSP[] = {"가위", "바위", "보"};
	private String answer;
	private int randInt, myInt;
	Scanner sc = new Scanner(System.in);
	
	public void run() {
		while(true) {
			randInt = (int)(Math.random()*3);
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			System.out.print("가위 바위 보!>> ");
			answer = sc.next();
			
			if(answer.equals(arrRSP[0])) {
				myInt = 0;
			}else if(answer.equals(arrRSP[1])) {
				myInt = 1;
			}else if(answer.equals(arrRSP[2])) {
				myInt = 2;
			}else if(answer.equals("그만")){
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			System.out.print("사용자 = " + arrRSP[myInt] + ", 컴퓨터 = " + arrRSP[randInt]);
			
			if(myInt == 0 && randInt == 2)
				myInt += 3;
			if(myInt == 2 && randInt == 0)
				randInt += 3;
			
			if(myInt == randInt) {
				System.out.println(" 비겼습니다.");
			}else if(myInt > randInt) {
				System.out.println(" 이겼습니다.");
			}else {
				System.out.println(" 졌습니다.");
			}
		}
		System.out.println("게임을 종료합니다.");
	}
}

public class ArrayRockScissorPaperGame {

	public static void main(String[] args) {
		RockScissorPaper game = new RockScissorPaper();
		game.run();
	}

}
