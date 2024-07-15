package com.kh.review;

public class Variable {

	public static void main(String[] args) {

		printvariable();
		declarevariable();
	}

	public static void printvariable() {
		/*
		 * 변수의 목적 -데이터를 저장하기 위한 공간 -가독성의 증가(변수 이름을 의미있게 지어줌으로써) 재사용성 증가 (한번 값을 저장하여 필요할
		 * 때마다 변수 이름으로 가져다가 사용 -유지보수가 쉬워짐(한번 저장해 놓은 위치에 값을 변경함으로서
		 */

		// ex) 월급 = 시급 * 근무시간 * 근무일수
		// 최원탁 : 0000원 형식으로 출력
		System.out.println("최원탁 : " + (9860 * 8 * 14) + "원");
		System.out.println("홍길동 : " + (9860 * 6 * 14) + "원");
		System.out.println("장길산 : " + (9860 * 6 * 14) + "원");
		System.out.println("임꺽정 : " + (9860 * 6 * 14) + "원");

		System.out.println("=========================");

		// 변수 사용시
		int pay = 9980;
		int time = 8;
		int day = 5;

		System.out.println("최원탁 : " + (pay * time * day) + "원");
		System.out.println("홍길동 : " + (pay * time * day) + "원");
		System.out.println("장길산 : " + (pay * time * day) + "원");
		System.out.println("임꺽정 : " + (pay * time * day) + "원");

	}

	public static void declarevariable() {

		/*
		 * 변수의 선언 : 값을 기록하기 위한 변수를 메모리 공간에 할당
		 * 
		 * [표현법] 자료형 변수명;
		 * 
		 * 자료형: 변수의 크기 및 모양을 지정하는 부분 변수명: 변수에 이름을 부여하는 부분(의미 부여)
		 * 
		 * 명명 규칙 [1] 카멜케이스 : 소문자로 시작하고 다른 단어가 붙을때 대문자로 시작 => 클래스 명의 경우 대문자로 시작하도록 지어짐.
		 * [2] 대소문자를 구분 [3] 숫자로 시작하면 안됨 [4] 특수문자는 '$' 또는 '_'만 사용가능
		 * 
		 * 주의사항 -같은 영역 안({}) 에서는 동일한 변수명 선언 불가능 -해당 영역 안({}) 에서 선언된 변수는 그 영역 안에서만 사용 가능
		 * => 다른 영역 에서는 사용 불가
		 */
		// --------------------------------------------------------------
		// 1. 논리형 (boolean). 논리값 (true/false) 1byte
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("isFalse의 값 : " + isFalse);

		isTrue = 1 + 3 > 1; // isTrue의 값
		isFalse = 2 * 3 < 0;// isFalse의 값 false
		// --------------------------

		// 2. 숫자형 (정수/ 실수)
		// 2-1 정수형( 소숫점 x. 딱 떨어지는 수)
		// byte(1B) / short (2B) / int (4B) / long(8B)
		byte bnum;
		bnum = -128;
//		bnum = 1000; //범위 초과 시 오류 발생

		// 2-2 실수형 (소숫점 o)
		// float(4B) / double(8B)
		float fnum = 0.0f;// 0.0값을 저장
							// 값 자체(리터럴)를 저장할 때 값 뒤에 f 붙임
		double dnum = 0; // 소숫점 15자리까지 표현 가능, 실수형의 기본 자료형
		// -------------------------------
		// 3. 문자형 (char / String)
		// 3-1. 문자
		char ch = 'a'; // 2B(byte)
		char kim;
		kim = '김';

		// 3-2 문자열
		String str; // 참조형(참조 자료형)
		str = "aaa";

		// -----------------------------------------
		// 상수 : 변하지 않는 값을 저장하는 공간
		// [표현법] final 자료형 상수명;
		final int AGE; // 명명규칙 : 대문자만 사용, 단어 사이는 '_' 구분
		AGE = 10;
		// AGE = 20; // 값이 한번 저장되면 변경 불가능
		// 대표적인 상수 :Math.PI(원주율)
		System.out.println(Math.PI);

		// 참고_
		int temp = 999_999_999; // 가독성을 위해 3자리마다 _ 표시 가능

	}
}
