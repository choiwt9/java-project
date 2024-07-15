package com.kh.ch07_inheritance;

public class InheritRun {

	public static void main(String[] args) {
		/*
		 * 상속: 부모 타입이 가지고 있는 변수,메소드를 자식클래스에서 직접 만들지 않고 자신의 변수,메소드처럼 사용할 수 있는 기능
		 * 
		 * [표현법]* extends * 접근제한자 예약어 class 클래스명 extends 부모클래스명{}
		 * 
		 * 장점 -중복된 코드를 하나로 관리할 수 있어서 추가 수정이 용이하다. -적은 양의 코드로 새로운 클래스를 작성
		 * 
		 * *특징 -클래스 간의 상속은 단일 상속만 가능(하나의 부모타입만 상속 가능) - -private 멤버는 접근 불가 -자식 객체에서 부모
		 * 클래스에 정의되어있는 메소드를 내것처럼 호출하여 사용 가능 -명시되어 있지 않지만 모든 클래스(자바 제공, 직접 제작)는
		 * object클래스의 상속을 받는다 오버라이딩 : 부모타입의 메소드를 자식클래스에서 재정의하는 것 -단 부모타입에 정의된 메소드명 반환타입,
		 * 매개변수(갯수/타입/순서) 모두 동일해야 함 -접근제한자는 같은 범위나 큰범위여야 한다. ex)public-->public /
		 * default--> default, private, public
		 * 
		 * - 예외처리 : 같은 클래스이거나 그 클래스의 자식클래스만 가능
		 */
		Fruit f = new Fruit("수박", 15000);
		MyFruit mf = new MyFruit("딸기", 8000);

		System.out.println(f);
		System.out.println(mf);
	}

}
