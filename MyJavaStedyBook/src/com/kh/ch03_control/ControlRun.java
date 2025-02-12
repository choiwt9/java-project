package com.kh.ch03_control;

import java.util.Scanner;

public class ControlRun {

	public static void main(String[] args) {
		/*
		 * *프로그램 진행은 위에서 아래오 왼쪽에서 오른쪽으로 진행 이 흐름을 바꾸고자 할 때 제어문으로 직접 제어 가능
		 * 
		 * -선택적으로 실행하고자 할 때 => 조건문 -반복적으로 실행하고자 할 때 => 반복문 -그 외에 흐름 제어 => 분기문
		 * 
		 */
		/*
		 * 조건문 : 조건식을 참 거짓에 따라 코드 실행 -종류 [1]if [2]switch
		 */

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("숫자 입력 : "); int num = sc.nextInt(); //입력값이 양수인가 아닌가 if
		 * (num > 0) {// 참일 때 실행 System.out.println(num + "은 양수다"); } else {// 거짓일 때 실행
		 * System.out.println(num + "은 양수가 아니다"); }
		 */
		/*
		 * System.out.print("나이 입력 : "); int age = sc.nextInt(); String result = ""; if
		 * (age <= 13) { result = "어린이"; } else if (age <= 19) { result = "청소년"; } else
		 * { result = "성인"; } System.out.println(age + "살은" + result + "입니다"); } else {
		 * System.out.println("잘못 입력했습니다"); }
		 */

		/*
		 * 과일을 입력 받아 가격 출력 -수박 : 15000 -참외 : 5000 -복숭아 : 10000
		 */
		/*
		 * System.out.print("구매 할 과일을 입력(수박/참외/복숭아)"); String fruit = sc.next(); int
		 * price = 0; switch (fruit) { case "수박": price = 15000; break; case "참외": price
		 * = 5000; break; case "복숭아": price = 10000; break;
		 * 
		 * default: System.out.println("잘못 입력하였습니다"); break; } if (price > 0) {
		 * System.out.println(fruit + "의 가격은" + price + "원입니다"); } }
		 */

		/*
		 * 반복문: 어떤 코드를 반복적으로 실행 [1] for [2] while
		 */
		/*
		 * for(초기식; 조건식; 증감식){//반복 횟수 설정 // 반복할 코드 작성 } -초기식 : 반복문 실행될때 "처음 단 한 번 실행" =>
		 * 반복문 안에서 사용될 변수를 선언 및 초기화 -조건식 : "반복문이 수행될 조건" => 결과가 참일 때 실행,거짓일 때 종료 =>초기식에
		 * 선언된 변수를 가지고 조건식을 작성 -증감식 : 반복문을 제어하고 있는 변수의 값을 증가시키거나 감소 => 보통 초기식에 선언된 변수를
		 * 가지고 증감 연산자(++,--)를 사용
		 */

		int dan = (int) (Math.random() * (9 - 2 + 1) + 2);

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);

		}

		for (int i = 1; i < dan; i++) {
			for (int j = 1; j < dan; j++) {
				if (i == j)
					System.out.print(i);
				else
					System.out.print("*");
			}
			System.out.println();

		}
		// ---------------------------------
		int i = 1;
		while (i < 10) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			i++;
		}
		int num2 = 1;
		do {
			System.out.println(num2);
		} while (num2 == 0);

		/*
		 * 분기문 -comtinue;: 코드를 실행하다가 이 분기문을 만나면 다음 분기로 넘김 -break;: 반복문을 강제로 빠져나감 switch문
		 * 안의 break;는 switch문만을 빠져나감
		 */
		// 1~10 사이의 홀수만 출력
		for (int k = 1; k <= 10; k++) {

			if (k % 2 == 0) {
				continue;
			}
			System.out.print(k + " ");

		}

		System.out.println();

		while (true) {
			int random = (int) (Math.random() * (100 - 1 + 1) + 1);
			if (random % 3 == 0) {
				System.out.println("\n >>" + random);
				break;
			}
			System.out.print(random + " ");

		}
	}

}
