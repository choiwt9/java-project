package com.kh.example.practice2;

public class Product {
//변수부 필드부
	private String name;
	private int price;
	private String brand;

//생성자부
	public Product() {
	}

//메소드부
// name변수의 getter/ setter
//getter 메소드 해당변수의 값을 조회하는 메소드
	public String getName() {

		return name;

	}

//해당변수에 닶을 저장하는 메소드 
	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {

		return price;
	}

	public void setPrice(int price) {

		this.price = price;
	}

	public String getBrand() {

		return brand;
	}

	public void setbrand(String brand) {
		this.brand = brand;
	}

	public void information(String name) {
		System.out.println("pName" + name + "price");
	}
}
