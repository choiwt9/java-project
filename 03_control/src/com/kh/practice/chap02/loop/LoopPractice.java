package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1이상의 숫자를 입력하세요");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i);
				if (i != num) {
					System.out.print(" ");
				}

			}
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		/*
		 * while(true) { System.out.print("1이상의 숫자를 입력하세요 : "); int num = sc.nextInt();
		 * if(num<1) { System.out.println("1이상의 숫자를 입력해주세요 "); }else {
		 * System.out.print("1이상의 숫자를 입력하세요 : "); }for(int i = 1; i<=num; i++) {
		 * System.out.print(i); if(i !=num){ System.out.print(" "); } } break; } }
		 */
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		do {
			if (num >= 1) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i);
					if (i != num) {
						System.out.print(" ");
					}
				}
				break;
			} else {
				System.out.println("1이상의 숫자를 입력해주세요 ");

				System.out.print("1이상의 숫자를 입력하세요 : ");
				num = sc.nextInt();
			}
		} while (true);
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 하나를 입력하세요 : ");
		int num = sc.nextInt();

		int total = 0;

		for (int i = 1; i <= num; i++) {
			total += i;
			System.out.print(i);
			if (i != num) {
				System.out.print("+");
			}

		}
		System.out.println("=" + total);
	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
//	입력된 숫자 중 1 미만의 숫자가 있는 경우

		if (num1 < 1 || num2 < 1) {
			for (int i = num2; i <= num1; i--) {
				System.out.print("1이상의 숫자를 입력하세요");

			}
		} else {

			int min = num1 < num2 ? num1 : num2;
			int max = num1 < num2 ? num2 : num1;

			for (int i = min; i <= max; i++) {
				System.out.print(i);
				if (i != max) {
					System.out.print(" ");
				}
			}
		}
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 :");
		int num = sc.nextInt();

		System.out.println("===================" + num + "단===================");

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}

	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 :");
		int num = sc.nextInt();

		if (num > 9) {
			System.out.println("9이하의 숫자만 가능");
		} else {
			for (int i = num; i <= 9; i++) {
				System.out.println("===================" + i + "단===================");
				for (int j = 1; j < 10; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i * j);

				}
			}
		}
	}

	public void practice12() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("연산지(+, - * / %) : ");
			String op = sc.next();

			if (op.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.print("정수1 :");
			int n1 = sc.nextInt();
			System.out.print("정수2 :");
			int n2 = sc.nextInt();

			switch (op) {
			case "+":
				System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 + n2);
				break;
			case "-":
				System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 - n2);
				break;
			case "*":
				System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 * n2);
				break;
			case "/":
				if (n2 == 0) {
					System.out.printf("0으로 나눌 수 없습니다 다시 해주세요");
				} else {
					System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 / n2);
				}
				break;
			case "%":
				if (n2 == 0) {
					System.out.printf("0으로 나눌 수 없습니다 다시 해주세요");
				} else {
					System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 % n2);
				}
				break;
			default:
				System.out.println("없는 연산자 재입력");
			}
		}
	}
}