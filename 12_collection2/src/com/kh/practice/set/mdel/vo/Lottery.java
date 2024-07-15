package com.kh.practice.set.mdel.vo;

public class Lottery {

	private String name;

	private String phone;

	public Lottery() {
	}

	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Lottery [name=" + name + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		String hash = name + phone;
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Lottery) {
			Lottery others = (Lottery) obj;
			if (this.name.equals(others.name)) {
				return true;
			}
		}
		return false;
	}

}
