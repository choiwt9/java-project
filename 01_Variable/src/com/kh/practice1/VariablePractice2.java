package com.kh.practice1;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//"문자열을 입력하세요 : " 출력
		System.out.print("문자열을 입력하세요 : ");
		//사용자로부터 문자열로 입력을 받는다 => Scanner
		//
		
		
		//문자열을 입력 받아주는 메소드 : next(), nextLine()
		
		String str = sc.nextLine();
		//String기능 중 문자 하나씩 꺼내오는 메소드 : charAt(위치값)
		System.out.println("첫번째 문자 : " + str.charAt(0));
		System.out.println("두번째 문자 : " + str.charAt(1));
		System.out.println("세번째 문자 : " + str.charAt(2));
		System.out.println("네번째 문자 : " + str.charAt(3));
		System.out.println("다섯번째 문자 : " + str.charAt(4));
	}

}
