package com.kh.review;

public class Cast {

	/*
	 * *형면환 : 값의 자료형을 바꾸는 것
	 * 
	 * *컴퓨터에서의 값 처리 규칙(형변환이 필요한 상황) 1) 대입 연산자 : 왼쪽과 오룬쪽이 같은 자료형이어야 함 => 다른 자료형의 값을
	 * 대입하고자 한다면 형변환이 필수
	 * 
	 * 자료형 변수명 = (자료형) 값
	 * 
	 * 2) 같은 자료형 끼리만 연산이 가능
	 * 
	 * 결과값 = 값1 + 값2 => 값1, 값2 모두 같은 자료형이어야 함 결과 \값도 같은 자료형이어야 함
	 * 
	 */
	public static void main(String[] args) {
		autoCasting();
		// forceCasting();
	}

	public static void autoCasting() {

		/*
		 * *자동 형변환 -값의 범위가 작은 자료형에서 큰 자료형으로 자동 형변환
		 * 
		 */

		int i1 = 12;
		double d1 = 11; // int (4byte) => double (8byte)

		int i2 = 15;
		double d2 = 3.3;
	}

	public static void forceCasting() {
		// 강제 형변환 : 큰 범위의 자료형에서 작은볌위의 자료형으로 변환이 필요할때
		double d1 = 4.0;
		int i1 = 50;

		int result = (int) (i1 + d1);
		// 강제 형변환 시 데이터 손실 발생할 수 있음

		int inum = 290;
		byte bnum = (byte) inum; // byte 범위 : -128~127

		System.out.println("bnum의 값 : " + bnum);

	}

}
