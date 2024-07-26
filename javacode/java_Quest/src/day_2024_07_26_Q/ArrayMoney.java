package day_2024_07_26_Q;

public class ArrayMoney {

	public static void main(String[] args) {
		int money = (int) (Math.random() * 5000 + 1);
		int[] count = new int[4];
		int moneySave = money;
		
		count[0] = moneySave / 500;
		moneySave = moneySave % 500;
		
		count[1] = moneySave / 100;
		moneySave = moneySave % 100;
		
		count[2] = moneySave / 50;
		moneySave = moneySave % 50;
		
		count[3] = moneySave / 10;
		moneySave = moneySave % 10;
		
		System.out.println("랜덤액수: " + money + "원");
		System.out.println("500원: " + count[0] + "개");
		System.out.println("100원: " + count[1] + "개");
		System.out.println("50원: " + count[2] + "개");
		System.out.println("10원: " + count[3] + "개");
		System.out.println("남은금액: " + moneySave + "원");
	}

}
