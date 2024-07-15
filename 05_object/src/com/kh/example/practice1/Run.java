package com.kh.example.practice1;

public class Run {

	public static void main(String[] args) {
// 기본 생성자를 통해 Member타입의 객체를 생성
		Member m = new Member();

		// changeName을 이용해 값을 변경
		m.changeName("최원탁");
		// printName으로 값을 변경
		m.printName();

		System.out.println(m);
	}

}
