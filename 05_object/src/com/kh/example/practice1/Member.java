package com.kh.example.practice1;

public class Member {

	// 변수 선언--->
	// 접근 제한자 예약어 자료형 변수명 [=값];
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;

	// 생성자--> 인스턴스 생성/ 초기화가 필요한 경우 초기화 작업
	// 접근제한자 생성자 명([매개변수 정보]){}
	// +Member()
	public Member() {
	}

	// 메소드 --> 기능
	// 접근 제한자 예약어 변환타입 메소드명 ([매개변수 정보]) {//기능수행코드}

	public void changeName(String name) {
		// memberName변수의 값을 전달된 name값으로 변경
		memberName = name;
	}

	public void printName() {
		// memberName변수의 값을 출력
		System.out.println(memberName);
	}
}
