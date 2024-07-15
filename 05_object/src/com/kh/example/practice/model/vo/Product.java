package com.kh.example.practice.model.vo;

public class Product {

	private String name;
	private String brand;
	private int price;

	// 기본 생성자
	public Product() {

	}

	// 모든 필드를 매개변수로 갖는 생성자
	public Product(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

// name변수에 저장된 값을 반환
	public String getName() {
		return name;
	}

// 전달된 값을 name 변수에 저장
	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void information() {
		System.out.println("제품명" + name + "브랜드" + brand + "가격" + price);
	}
}
