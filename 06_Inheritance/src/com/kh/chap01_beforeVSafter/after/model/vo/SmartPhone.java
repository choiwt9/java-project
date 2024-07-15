package com.kh.chap01_beforeVSafter.after.model.vo;

public class SmartPhone extends Product {

	private String mobileagency;

	public SmartPhone() {

	}

	public String information(String brand, String code, String name, int price, String mobileagency) {
		return super.information() + ",mobileagency" + mobileagency;
	}

	public String getMobileagency() {
		return mobileagency;

	}

	public void setMobileagency(String mobileagency) {
		this.mobileagency = mobileagency;
	}

}
