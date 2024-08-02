package day_2024_07_30_PM;

import java.util.Scanner;

class Buyer{
	Scanner sc = new Scanner(System.in);
	private int money, useMoney;
	private int i = 0;
	private Product[] cart = new Product[3];
	Product[] cartSave;
	
	public Buyer() {
		System.out.print("현재 소지한 금액: ");
		money = sc.nextInt();
		useMoney = money;
	}
	
	public void buy(Product p) {
		if(useMoney < p.price) {
			System.out.println("잔액이 부족해서 " + p + "을/를 살 수 없습니다.");
			return;
		}
		useMoney -= p.price;
		add(p);
	}
	
	public void add(Product p) {
		if(i >= cart.length) {
			cartSave = new Product[cart.length * 2];
			for(int j = 0;j < i;j++) {
				cartSave[j] = cart[j];
			}
			cart = cartSave;
		}
		
		cart[i++] = p;
	}
	
	public void summary() {
		System.out.print("구입한 물건: ");
		for(int j = 0;j < i;j++) {
			System.out.print(cart[j] + ", ");
		}
		System.out.println();
		System.out.println("사용한 금액: " + (money - useMoney));
		System.out.println("남은 금액: " + useMoney);
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
