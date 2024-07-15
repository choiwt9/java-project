package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {

	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();

	public void mainMenu() {
		System.out.println("1. 지정문자열");
		System.out.println("2. 입력문자열");
		System.out.println("9. 프로그램 끝내기");
		System.out.println("메뉴 번호: ");

		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			tokenMenu();
			break;
		case 2:
			inputMenu();
			break;
		case 9:
			System.out.println("프로그램을 종료합니다 ");
		default:
			break;
		}

	}

	public void tokenMenu() {
		String str = "“J a v a P r o g r a m “";
		System.out.println("토큰 처리 전 글자" + str);
		System.out.println("토큰 처리 전 글자수" + str.length());
		String after = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자" + after);
		System.out.println("토큰 처리 후 글자" + after.length());
		System.out.println("모두 대문자로 변환" + after.toUpperCase());

	}

	public void inputMenu() {

		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next();
		String result = tc.firstCap(str);

		System.out.print("찾을 문자를 하나 입력하세요 : ");
		char findCh = sc.next().charAt(0);
		int count = tc.findChar(result, findCh);
		System.out.println("문자가 들어간 개수" + count);
	}
}
