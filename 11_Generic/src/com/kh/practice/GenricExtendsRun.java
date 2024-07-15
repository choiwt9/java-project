package com.kh.practice;

public class GenricExtendsRun {

	public static void main(String[] args) {

		print(12345);
		print(3.14);
	}

	public static <T extends Number> void print(T value) {
		System.out.println(value);
	}

	// 제네릭 메소드 정의

}
