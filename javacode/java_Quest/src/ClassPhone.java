class Phone{
	String name, number;
	
	Phone(){
		name = "없음";
		number = "없음";
	}
	
	Phone(String name, String number){
		this.name = name;
		this.number = number;
	}
	
	void show(){
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + number);
	}
}

public class ClassPhone {

	public static void main(String[] args) {
		Phone phone = new Phone("홍길동", "010-0000-0000");
		phone.show();

		phone = new Phone("홍길순", "010-1111-1111");
		phone.show();

		phone = new Phone();
		phone.show();
	}

}
