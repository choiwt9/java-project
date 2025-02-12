package com.kh.ch11_api;

public class API03_Wrapper {
	/*
	 * Wrapper 클래스 => 기본 자료형을 객체로 감싸는 클래스 기본자료형 <------> Wrapper 클래스 int Integer
	 * char Character double Double
	 * 
	 * 기본 자료형을 객체로 표현하는 경우 -메소드 호출 시 매개변수가 기본 자료형이 아닌 객체 타입만 요구할때 -다형성을 적용하고자 할 때
	 */

	public static void main(String[] args) {

		// Boxing : 기본 자료형 ---> Wrapper클래스 자료형

		int n1 = 16;
		int n2 = 26;

		Integer i1 = new Integer(n1);
		Integer i2 = new Integer(n2);

		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));
		// => 0: 같은 값, -1: 뒤가 앞보다 크다, 1: 앞이 뒤보다 크다

		Integer i3 = n1;

		// "101" 이라는 값을 Integer 타입으로 바꾸고자 한다면

		Integer i4 = new Integer("101");
		System.out.println(i4);
		int n4 = Integer.parseInt("123");
		System.out.println(n4);

		String n101 = String.valueOf(101);
		System.out.println(n101);
	}
}
