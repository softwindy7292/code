
public class MoneyCount {

	public static void main(String[] args) {
		int money = 126870;
		int five_man, one_man, five_cheon, one_cheon, five_back, one_back, five_ship, one_ship;
		int money_save, count;
		
		money_save = money;
		
		count = money_save / 50000;
		five_man = count;
		money_save = money % 50000;
		
		count = money_save / 10000;
		one_man = count;
		money_save = money % 10000;
		
		count = money_save / 5000;
		five_cheon = count;
		money_save = money % 5000;
		
		count = money_save / 1000;
		one_cheon = count;
		money_save = money % 1000;
		
		count = money_save / 500;
		five_back = count;
		money_save = money % 500;
		
		count = money_save / 100;
		one_back = count;
		money_save = money % 100;
		
		count = money_save / 50;
		five_ship = count;
		money_save = money % 50;
		
		count = money_save / 10;
		one_ship = count;
		money_save = money % 10;
		
		System.out.println("오만원: " + five_man + "장");
		System.out.println("만원: " + one_man + "장");
		System.out.println("오천원: " + five_cheon + "장");
		System.out.println("천원: " + one_cheon + "장");
		System.out.println("오백원: " + five_back + "장");
		System.out.println("백원: " + one_back + "장");
		System.out.println("오십원: " + five_ship + "장");
		System.out.println("십원: " + one_ship + "장");
	}

}