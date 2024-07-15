package com.kh.chap01_beforeVSafter.before.model.vo;

public class SmartPhone {

	private String brand;
	private String code;
	private String name;
	private int price;
	private String mobileagency;

	public SmartPhone() {
	}

	public String information() {
		return "brand=" + brand + "code" + code + "name" + name + "price" + price + "mobileagency" + mobileagency;

	}

}
