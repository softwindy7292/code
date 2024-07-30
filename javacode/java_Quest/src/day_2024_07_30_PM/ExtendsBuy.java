package day_2024_07_30_PM;

class Buyer{
	private int money = 1000;
	private int i = 0;
	private Product[] cart = new Product[3];
	
	public void buy(Product p) {
		if(money < p.price)
			return;
		money -= p.price;
		add(p);
	}
	
	public void add(Product p) {
		
	}
	
	public void summary() {
		
	}
}

class Product{
	protected int price;
	
	public Product(int price) {
		this.price = price;
	}
}

class TV extends Product{
	public TV() {
		super(100);
	}
	
	public String toString() {
		return "TV";
	}
}

class Computer extends Product{
	public Computer() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product{
	public Audio() {
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}

public class ExtendsBuy {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new TV());
		b.buy(new Computer());
		b.buy(new TV());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}

}
