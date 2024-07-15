package com.kh.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionRun {

	public static void main(String[] args) {
		// exceptionTest1();
		// exceptionTest2();
		System.out.println("-----start1----");
		try {
			exceptionTest3();
		} catch (ValueLengthException e) {
			e.printStackTrace();
		}
		System.out.println("-----end2----");
	}

	/*
	 * ArithmeticException, InputMismatchException 사용자로부터 2개의 값을 입력받고 배수인 경우
	 * "x는x의 배수입니다" 출력 배수가 아닌 경우에는 x는x의 배수가 아닙니다" 출력 (프로그램이 정상적으로 종료될 수 있도록 시작점에
	 * "-----start----" 마지막 지점에 "-----end----" 출력)
	 */

	public static void exceptionTest1() {

		System.out.println("-----start----");
		Scanner sc = new Scanner(System.in);

		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (y % x == 0) {
				System.out.println(y + "는" + x + "의 배수");
			} else {
				System.out.println(y + "는" + x + "의 배수가 아니다");
			}
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
		System.out.println("-----end----");
	}
	/*
	 * NegativeArraySizeException,ArrayIndexOutOfBoundsException -5~5사이의 난수를 발생시켜 해당
	 * 난수 크기로 배열 생성 1부터 배열 크기만큼 1씩 즌가시키면서 값을 저장한 뒤에 출력 처음과 끝에 start, end 출력
	 */

	public static void exceptionTest2() {

		System.out.println("start");
		int random = (int) (Math.random() * (5 - (-5) + 1) + (-5));
		try {
			int[] arr = new int[random];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = i + 1;
				System.out.println(arr[i]);
			}
		} catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
	/*
	 * Exception 클래스 상속 생성자(기본/매개변수1개 -->msg:String) 사용자에게 입력받은 값의 길이가 3 이하인 경우 예외
	 * 발생
	 * 
	 * 클래스명: ValueLengthException main 메소드 예외 처리
	 * 
	 */

	public static void exceptionTest3() throws ValueLengthException {
		System.out.println("-----start2----");
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();

		if (value.length() <= 3) {
			System.out.println("----exception3----");
			throw new ValueLengthException("입력된 길이가 3 이하. 4글자 이상 입력");
		}
		System.out.println(value);
		System.out.println("-----end1----");
	}

}