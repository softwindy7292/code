
public class MoneyCount {

	public static void main(String[] args) {
		int money = 126870;
		int five_man, one_man, five_cheon, one_cheon, five_back, one_back, five_ship, one_ship;
		int money_save;
		
		money_save = money;
		
		five_man = money_save / 50000;
		money_save = money % 50000;
		
		one_man = money_save / 10000;
		money_save = money % 10000;
		
		five_cheon = money_save / 5000;
		money_save = money % 5000;
		
		one_cheon = money_save / 1000;
		money_save = money % 1000;
		
		five_back = money_save / 500;
		money_save = money % 500;
		
		one_back = money_save / 100;
		money_save = money % 100;
		
		five_ship = money_save / 50;
		money_save = money % 50;
		
		one_ship = money_save / 10;
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