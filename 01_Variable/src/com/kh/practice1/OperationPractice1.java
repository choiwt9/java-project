package com.kh.practice1;

import java.util.Scanner;

public class OperationPractice1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수: ");
		
		int num2 = sc.nextInt();
		
		System.out.println("곱셈 결과 :" + (num1 * num2));
		System.out.println("뻴셈 결과 :" + (num1 - num2));
		System.out.println("덧셈 결과 :" + (num1 + num2));
		System.out.println("나눗셈 결과 :" + (num1 / num2));
		
		
		
	}

}
