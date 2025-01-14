package com.kh.ch09_interface;

public class InterfaceRun {
	/*
	 * *인터페이스= 상수 필드 + 추상메소드 -추상메소드를 가지고 있기 때문에 객체를 직접 생성할 수 없다 -참조변수 타입으로 사용 가능
	 * -추상메소드 : 미완성된 메소드 몸통({})부가 없다(미구현) 무조건 오버라이딩 후 메소드 호출이 가능
	 * 
	 * [public abstract] 반환타입 메소드명([매개변수]);
	 * 
	 * *추상클래스 = [추상메소드] + 일반 필드 + 일반 메소드 -미완성된 클래스 -객체 생성 불가 -참조변수 타입으로 사용 가능 -추상
	 * 메소드는 가질 수도 있고 가지지 않을 수도 있다. =>추상 메소드가 있는 경우 반드시 추상 클래스로 명시해야함 접근제한자 abstract
	 * class 클래스명 {}
	 * 
	 * -> 자식 클래스에서 강제로 오버라이딩하여 동일한 형식의 메소드를 정의하고자 할때 자식 클래스마다 구현내용응 다르지만 동일한 형식을
	 * 적용(메소드 통일성/표준화된 틀 제공)
	 * 
	 * 
	 * => 추상 메소드가 없는 경우 추상 클래스로 만들 수 있음 ->해당 클래스가 미완성된 클래라고 부여하고자 할 때 객체 생성 불가능하게
	 * 하고자 할 때
	 * 
	 ** 상속(구현) 관계 -클래스에서 클래스를 상속받을 때 : 자식클래스 extends 부모클래스 (단일 상속만 가능) : 화살표 실선
	 * -클래스에서 인터페이스를 구현할 때 : 클래스 implements 인터페이스, 인터페이스,......(다중상속 가능): 화살표 점선
	 * -인터페이스에서 인터페이스를 상속받을 때 : 인터페이스 extends 인터페이스,...(다중 상속 가능) : 화살표 실선
	 *
	 *
	 */

	public static void main(String[] args) {
		Plant monstera = new Monstera("카스테라");
		Plant lavender = new Lavender("라베");

		System.out.println(monstera);
		System.out.println(lavender);

		System.out.println("------1회---------");

		monstera.sprinkleWater();
		monstera.baskSun();

		lavender.sprinkleWater();
		lavender.baskSun();

		System.out.println(monstera);
		System.out.println(lavender);

		System.out.println("------2회---------");

		monstera.sprinkleWater();
		lavender.baskSun();

		System.out.println(monstera);
		System.out.println(lavender);
	}

}
