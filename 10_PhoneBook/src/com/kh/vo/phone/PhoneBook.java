package com.kh.vo.phone;

import java.util.Scanner;

public class PhoneBook {
	private String name;
	private String phone;
	private String group;
	private String eMail;
	private String Memo;

	public PhoneBook() {
	}

	public PhoneBook(String name, String phone, String group, String eMail, String Memo) {
		this.name = name;
		this.phone = phone;
		this.group = group;
		this.eMail = eMail;
		this.Memo = Memo;
	}

	public String getNames() {
		return name;
	}

	public void setNames(String names) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getMemo() {
		return Memo;
	}

	public void setMemo(String memo) {
		this.Memo = memo;
	}

	@Override
	public String toString() {
		return "PhoneBook [name=" + name + ", phone=" + phone + ", group=" + group + ", eMail=" + eMail + ", Memo="
				+ Memo + "]";
	}
}

class PhoneMenu {

	public PhoneMenu() {
	}

	public PhoneBook[] pArr;

	public void BringNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.아버지");
		System.out.println("2.어머니");
		System.out.println("3.친구 1");
		System.out.println("4.친구 2");
		System.out.println("5.지인 1");
		System.out.println("번호: ");
		int pn = 0;
		switch (pn) {
		case 1:
			father();
			break;
		case 2:
			mother();
			break;
		case 3:
			friend1();
			break;
		case 4:
			friend2();
			break;
		case 5:
			friend3();
			break;
		}

	public String father() {
		PhoneBook pb = new PhoneBook();
		
		
		System.out.println(name);
		System.out.println(phone);
		System.out.println(group);
		System.out.println(eMail);
		System.out.println(Memo);

		for(int i=1; i < pArr.length; i++ ) {
		return toString();

	}
}
