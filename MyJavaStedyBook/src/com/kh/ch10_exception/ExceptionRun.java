package com.kh.ch10_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionRun {
	/*
	 * *예외 : 프로그램 실행 중 비정상적으로 종료되는 상황 (오류)
	 * 
	 * -종류 [1] 시스템 오류 : 컴퓨터 오작동으로 발생 => 코드로 해결 불가 [2] 컴파일 오류 : 소스코드 문법상의 오류 => 발견이
	 * 쉽다 [3] 런타임 오류 : 코드상 문제는 없으나 실행중 발생하는 오류 => RuntimeException -
	 * ClassCastException : 참조하지 않는 타입으로 변환하려 할 때 발생 - ArithmeticException : 산술예외
	 * -IndexOutOfBoundException : 인덱스 범위를 벗어나서 접근하려할 때 발생 -NullPointException :
	 * 참조변수가 null일 경우 특정변수나 메소드에 젒근하려 할때 발생 *예외처리 : 예외들이 발생되었을때 해결하는 방법 -> 정상적으로
	 * 프로그램이 실행될 수 있도록 하는 것
	 * 
	 * *방법 [1]직접처리: try ~ catch문 [2]위임 : throws 사용
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// method01();
		try {
			method02();
		} catch (IOException e) {
			System.out.println("입출력 오류 발생!! main에서 처리");
		}
		System.out.println("--------main 끝---------");
	}

	public static void method01() {
//예외처리는 선택 사항, 데이터에 따라 예외가 생길 수 잇다

		System.out.println("배열 크기 : ");
		try {
			int size = sc.nextInt();

			int[] arr = new int[size];
			System.out.println("100 번째 인덱스 값 : " + arr[100]);

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("잘못된 접근입니다" + e.getMessage());
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
			System.out.println("잘못된 접근입니다" + e.getMessage());
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("잘못된 접근입니다" + e.getMessage());
		}
	}

	public static void method02() throws IOException {
		// CheckedException : 필수
		// --> 외부 매체와의 입출력 작업시엔 반드시 해야함
		// System.in : InputStream--> BufferedReader 변환시 InputStreamReader의 도움을 받음
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * try { String data = reader.readLine(); System.out.println("입력된 값" + data); }
		 * catch (IOException e) { System.out.println("오류"); }
		 */

		// 위임

		String data = reader.readLine();
		System.out.println("입력된 값 : " + data);

	}
}
