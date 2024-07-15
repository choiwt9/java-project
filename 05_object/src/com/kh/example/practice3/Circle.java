package com.kh.example.practice3;

public class Circle {
//변수부
	private static final double PI = 3.14;
	private static int radius = 1;

	public Circle() {
	}

//메소드
	public void incrementRadius() {
		radius++;
	}

	public void getAreaOfCircle() {
		System.out.println(radius * radius * PI);
	}

	public void getSizeOfCircle() {
		System.out.println(radius * 2 * PI);
	}
}
