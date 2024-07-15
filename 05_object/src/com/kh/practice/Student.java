package com.kh.practice;

public class Student {
	private String name; // 이름
	int no;// 학번
	int age;// 나이
	char gender;// 성별

	public Student(String name) {
		// 이름을 저장할 name 변수에 전달된 값 (name)대입 (초기화)
		this.name = name;
	}

	public Student() {
	}

	// 정보조회
	public void inform() {
		System.out.println("[" + no + "]" + name + "[" + age + "]" + "[" + gender + "]");
	}

	public void setName(String name) {
		this.name = name;
	}
}
