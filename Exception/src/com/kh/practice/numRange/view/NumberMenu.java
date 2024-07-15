package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberControlle;

public class NumberMenu {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		NumberControlle nc = new NumberControlle();

		System.out.println("정수 1:");
		int num1 = sc.nextInt();
		System.out.println("정수 2:");
		int num2 = sc.nextInt();
		System.out.println(num1 + "는" + num2 + "의 배수인가");
	}

}
