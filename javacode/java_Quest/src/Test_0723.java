class Phone1{
	String name, number;
	
	Phone1(){
		name = "없음";
		number = "없음";
	}
	
	Phone1(String name, String number){
		this.name = name;
		this.number = number;
	}
	
	void show(){
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + number);
	}
}

class Song{
	String title, artist, country;
	int year;
	
	Song(String title, String artist, int year, String country){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	void show() {
		System.out.println(year + "년 " + country + " 국적의 " + artist + "가 부른 " + title);
	}
}

class Grade{
	int kor, eng, math;
	
	Grade(int kor, int eng, int math){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	double average() {
		return (kor + eng + math)/3;
	}
}

class TV{
	String brand;
	int year, size;
	
	TV(String brand, int year, int size){
		this.brand = brand;
		this.year = year;
		this.size = size;
	}
	
	void show() {
		System.out.println(brand + "에서 만든 " + year + "년형 " + size + "인치 TV");
	}
}

public class Test_0723 {

	public static void main(String[] args) {
		Phone1 phone = new Phone1("홍길동", "010-0000-0000");
		phone.show();
		
		phone = new Phone1("홍길순", "010-1111-1111");
		phone.show();
		
		phone = new Phone1();
		phone.show();
		
		System.out.println("=============================");
		
		Song song = new Song("Dancing Queen", "ABBA", 1987, "스웨덴");
		song.show();
		
		System.out.println("=============================");
		
		Grade me = new Grade(90, 80, 60);
		System.out.println("평균: " + me.average());
		
		System.out.println("=============================");
		
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
