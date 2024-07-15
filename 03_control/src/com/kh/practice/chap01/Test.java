package com.kh.practice.chap01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		// Q1. 주민번호를 입력받아 남자인지, 여자인지 출력하기 (입력 형식: 000000-0000000)
				// 단, 입력받은 값의 길이가 14가 아닌 경우 "잘못 입력되었습니다." 출력
				// ( hint ) 문자열의 길이를 확인하는 메소드 : length()
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호 : ");
		
		String idNum = sc.nextLine();
		
		if(idNum.length() != 14) {
			
			System.out.println("잘못 입력되었습니다");
		} else { 
			
			char genNum = idNum.charAt(7);
		if(genNum == '1' || genNum == '3') {
			System.out.println("남자입니다.");
		}else if(genNum == '2' || genNum == '4') {
			System.out.println("여자입니다.");
	}

		}
	}
		
}

