package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i]);
			if (i != 9) {
				System.out.print(" ");

			}
		}
	}

	public void practice2() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) {
				System.out.print(" ");
			}

		}
	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수: ");
		int num = sc.nextInt();
		if (num > 0) {
			int[] arr = new int[num];

			for (int i = 0; i < num; i++) {
				arr[i] = i + 1;
			}
			for (int i = 0; i < num; i++) {
				System.out.print(arr[i]);
				if (i != num - 1) {
					System.out.print("");

				}

			}

		}
	}

	public void practice4() {
		/*
		 * String[] arr1 = { "사과", "귤", "포도", "복숭아", "참외" }; String[] arr2 = new
		 * String[5]; for (int i = 0; i <= 5; i++) { arr2[1] = arr1[1];
		 * 
		 * } System.out.print(arr1[1]);
		 */

		String[] strarr = new String[] { "사과", "귤", "포도", "복숭아", "참외" };
		// 귤 출력
		// System.out.println(strarr[1]);
		for (int i = 0; i < strarr.length; i++) {
			if (strarr[i].equals("귤")) {
				System.out.print(strarr[1]);
			}
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열: ");
		String str = sc.nextLine();
		System.out.print("문자: ");
		char ch = sc.next().charAt(0);
		// 문자열 길이 : 문자열_변수/값.length()
		// 배열 길이 :배열 변슈 값 length()
		char[] arrch = new char[str.length()];
		// 입력받은 문자열을 배열에 문자 하나하나 저장 => 문자형 배열
		for (int i = 0; i < arrch.length; i++) {
			arrch[i] = str.charAt(i);
		}
		System.out.printf("%s에 %c가 존재하는 위치 :", str, ch);
		int count = 0;
		for (int i = 0; i < arrch.length; i++) {
			if (arrch[i] == ch) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println(ch + "의 개수 : " + count);
	}

	public void practice6() {
		// 문자열 배열 초기화

		String[] days = { "월", "화", "수", "목", "금", "토", "일" };
		Scanner sc = new Scanner(System.in);
		System.out.print("0에서 6까지 입력");
		int num = sc.nextInt();

		if (num < 0 || num > 6) {
			System.out.println("잘못 입력 함");
		} else {

			System.out.println(days[num] + "요일");

		}

	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int n = sc.nextInt();
		// 정수형 배열 선언 및 생성 (입력받은 값 만큼)
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			// i: 0,1,2,3, n-1
			System.out.print("배열" + i + "번째 인덱스에 놓을 값");
			arr[i] = sc.nextInt(); // arr배열의 i번째 위치에 입력된 값 대입
		}
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			total += arr[i];

		}
		System.out.println("\n총합 : " + total);

	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			// 3이상 홀수 자연수
			if (num >= 3 && num % 2 != 0) {
				// 입력받은 정수길이만큼 정수열 선언 할당
				int[] arr = new int[num];
				int value = 1;
				for (int i = 0; i < num; i++) {
					if (i < num / 2) {// 중간 위치 계산 num/2
						arr[i] = value++;
					} else {
						arr[i] = value--;
					}

				}
//배열 데이터 출력
				for (int i = 0; i < arr.length; i++) {
					if (i < arr.length - 1) { // 배열의 마지막 위치-1 까지는 , 넣어 출력

						System.out.print(arr[i] + ", ");
					} else {
						System.out.print(arr[i]);
					}
				}
				break;
			} else {
				System.out.println("다시 입력 하세요 ");

			}
		}
	}

	public void practice9() {
		String[] menu = new String[] { "양념치킨", "후라이드", "간장치킨", "치즈치킨" };
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름: ");
		String name = sc.nextLine();

		int count = 0;
		for (int i = 0; i < menu.length; i++) {
			if (menu[i].equals(name)) {
				count++;
				break;
			}
		}
		if (count > 0) {
			System.out.print(name + "배달 가능");
		} else {
			System.out.print("배달 불가능");

		}

	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호: ");
		String ssn = sc.nextLine();
		String[] num = new String[14];
		// 길이만큼 문자열 선언
		char[] origin = new char[ssn.length()];
		for (int i = 0; i < origin.length; i++) {
			origin[i] = ssn.charAt(i);
		}
//깊은 복사
		char[] copy = new char[origin.length];
		for (int i = 0; i < copy.length; i++) {
			if (i <= 7) {
				copy[i] = origin[i];
			} else {
				copy[i] = '*';
			}
		}
		for (

				int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]);
		}
	}

	public void practice11() {
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10 + 1);
			System.out.print(numbers[i] + " ");
		}

	}

	public void practice13() {
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10 + 1);

			// 현위치 전까지 중복값 확인
			for (int j = 0; j < i; j++) {
				// i번째와 j번째 위치값 비교
				// 같으면 랜덤값 다시 저장
				if (numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
