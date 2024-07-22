class TV{
	String brand;
	int year;
	int size;
	
	TV(){
		this.brand = "00";
		this.year = 2000;
		this.size = 0;
		
		show();
	}
	TV(String brand, int year, int size){
		this.brand = brand;
		this.year = year;
		this.size = size;
	}
	
	void show() {
		System.out.println(brand + "에서 만든 " + year + "년형 " + size + "인치 TV");
	}
}

public class ClassTV {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
		
		TV yourTV = new TV();
	}

}