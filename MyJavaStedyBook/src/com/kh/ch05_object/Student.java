package com.kh.ch05_object;

public class Student {
//필드부:	
	String name;
	int age;
	double height;
	String phone;
	String address;

//생성자부: 접근제한자 클래스명 ([매개변수]){}

	public Student() {
	}

	public Student(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;

	}

//메소드부: [접근제한자] [예약어] 반환타입 메소드명 ([매개변수]){}

	public String toString() {
		return "이름: " + name + "나이 :" + age + "주소 :" + address + "키:" + height + "전화번호:" + phone;
	}

}
