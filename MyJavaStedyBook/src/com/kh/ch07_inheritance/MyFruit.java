package com.kh.ch07_inheritance;

public class MyFruit extends Fruit {
	// 이름과 가격정보를 받아 초기화해주는 생성자
	// -->매개변수가 2개인 생성자 필요

	public MyFruit(String name, int price) {
		// super 사용
		// 부모클래스의 생성자 호출 super()
		// 부모클래스 변수, 메소드 접근 super. 멤버이름
		super(name, price);
	}
//toString() 오버라이딩

	@Override
	public String toString() {
		// 상속을 받았어도 멤버 접근제한자가 private이면 직접 접근 불가
		return "내가 좋아하는 과일은" + getName() + "이다";
	}

}
