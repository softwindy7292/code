package edu.ict.shop;

import java.util.ArrayList;

public class Cart {
	private ArrayList<String> productList;
	
	public Cart() {
		productList = new ArrayList<String>();
		productList.add("사이다");
		productList.add("콜라");
		productList.add("커피");
		productList.add("주스");
		productList.add("우유");
	}

	public ArrayList<String> getProductList() {
		return productList;
	}
}