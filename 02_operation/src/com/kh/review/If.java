package com.kh.review;

import java.util.Scanner;

public class If {

	/*
	 * 조건문 : 조건에 따라 프로그램 흐름을 제어하고자 할때 사용 -"조건식" 을 통해 참인지 거짓인지 판단하여 그에 해당하는 코드를 실행
	 * *조건식 결과 : true/false *연산자 : 비교 연산자 (대소/동등), 논리 연산자 (&&, ||, ..)wnfh tkdyd
	 * 
	 * - if/switch *if문 if(조건식){ //조건식 결과가 참일때 실행할 코드 }else if(조건식2) { //조건식의 결과가
	 * 거짓이고 조건식2의 결과가 참일
	 * 
	 * else { //조건식, 조건식2의 결과가 거짓일 때 실행할 코드 }
	 * 
	 * switch문
	 * 
	 * switch(조건식 => 비교대상) { case 값1: //비교대상 == 값1인 경우 실행할 코드 break; // break만나면 종료
	 * default: //모든 케이스 값에 해당 안될 경우 실행할 코드 }
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char ch = sc.next().charAt(0);
		String result;
		if (ch >= 'A' && ch <= 'Z') {
			result = "대문자 ";
		} else {
			result = "대문자 아님";
		}
		System.out.println(result);
//대문자 확인 하는 코드 => 조건문 사용
	}

}
