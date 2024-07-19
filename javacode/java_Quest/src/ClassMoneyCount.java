class Money{
	int money;
	
	void setMoney(int money){
		this.money = money;
	}
	
	void count() {
		int m50000, m10000, m5000, m1000, m500, m100, m50, m10;
		int money_save;
		
		money_save = money;
		
		m50000 = money_save / 50000;
		money_save = money % 50000;
		
		m10000 = money_save / 10000;
		money_save = money % 10000;
		
		m5000 = money_save / 5000;
		money_save = money % 5000;
		
		m1000 = money_save / 1000;
		money_save = money % 1000;
		
		m500 = money_save / 500;
		money_save = money % 500;
		
		m100 = money_save / 100;
		money_save = money % 100;
		
		m50 = money_save / 50;
		money_save = money % 50;
		
		m10 = money_save / 10;
		money_save = money % 10;
		
		System.out.println("총액: " + money);
		System.out.println("오만원: " + m50000 + "장");
		System.out.println("만원: " + m10000 + "장");
		System.out.println("오천원: " + m5000 + "장");
		System.out.println("천원: " + m1000 + "장");
		System.out.println("오백원: " + m500 + "장");
		System.out.println("백원: " + m100 + "장");
		System.out.println("오십원: " + m50 + "장");
		System.out.println("십원: " + m10 + "장");
	}
}

public class ClassMoneyCount {

	public static void main(String[] args) {
		Money money = new Money();
		
		money.setMoney(1256780);
		money.count();
	}

}
