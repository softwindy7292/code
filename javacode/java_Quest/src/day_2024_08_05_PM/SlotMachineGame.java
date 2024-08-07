package day_2024_08_05_PM;

import java.util.Scanner;

class Player {
	protected String[] player = new String[2];

	public Player() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 플레이어 이름 >> ");
		player[0] = sc.next();
		System.out.print("두번째 플레이어 이름 >> ");
		player[1] = sc.next();
	}
}

class SlotMachine extends Player {
	private int playerNum = 0;
	private int[] random = new int[3];

	public SlotMachine() {
		super();
	}

	public void run() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print(player[playerNum++ % 2] + ":\t");
			String enter = sc.nextLine();

			for (int i = 0; i < random.length; i++) {
				random[i] = (int) (Math.random() * 3);
				System.out.print("\t" + random[i]);
			}

			if (random[0] == random[1] && random[1] == random[2]) {
				System.out.println("\t" + player[++playerNum % 2] + "님 승리!!!");
				break;
			}
			System.out.println("\t아쉽군요!");
		}
	}
}

public class SlotMachineGame {

	public static void main(String[] args) {
		SlotMachine game = new SlotMachine();
		game.run();
	}

}
