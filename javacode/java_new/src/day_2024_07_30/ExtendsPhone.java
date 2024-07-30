package day_2024_07_30;

class MobilePhone{
	protected String number;
	
	public MobilePhone(String num) {
		number = num;
	}
	public void answer() {
		System.out.println("Hi~ from " + number);
	}
}

class SmartPhone extends MobilePhone{
	private String androidVer;
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	
	public void answer() {
		System.out.println("Hi~ from " + number);
	}
	
	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}

public class ExtendsPhone {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("010-555-777", "Nougat");
		phone.answer();
		phone.playApp();
		
		MobilePhone ph1 = new SmartPhone("000-461-6183", "Ver 12.0"); //업 캐스팅
		ph1.answer();
		((SmartPhone)ph1).playApp(); //다운 캐스팅
	}

}
