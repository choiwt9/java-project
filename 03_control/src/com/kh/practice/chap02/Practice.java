package com.kh.practice.chap02;

public class Practice {

	public void method1() {
//		1~10 출력 => 1 2 3 4 5 6 7 8 9 10

		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			if (i != 10) {
				System.out.println("");
			}

		}

		System.out.println("\n----------------------------");
		// 10 9 8 7 6 5 4 3 2 1

		for (int i = 10; i >= 1; i--) {
			System.out.print(i);
			if (i != 1) {
				System.out.println("");
			}
		}

	}

	public void method2() {

		int total = 0;

		for (int i = 1; i <= 10; i++) {
			// total = total +1
			total += i;
		}
		System.out.println("총합 :" + total);
	}

	public void method3() {
		/*
		 * 랜덤값 총 합 1~10 랜덤값 구하는 방법 math : java.lang.math random():랜덤값 반환해주는 메소드
		 * math.random() 값의 범위: 0.0~0.99999xx(0.0 <= n <1.0) (int)(Math.random() * 10+1)
		 */

		int random = (int) (Math.random() * 10 + 1);

		System.out.println("랜덤값은" + random + "입니다.");
		// random 까지의 합을 구하여 출력 (1~random)
		int total = 0;
		for (int i = 1; i <= random; i++) {
			total += i;
		}
		System.out.println("총합은" + total + "입니다.");
	}

	public void method4() {
		// 분기믄 : break (반복문 종료시키는 분기문)
		// 1 ~ 100까지의 랜덤값을 추출하여
		// 해당 랜덤 값이 짝수일때 반복문 종료 (종료 전 "종료 출력)
		// 홀수일 때는 해당 값을 출력
/*		while(true) {
		int random = (int) (Math.random() * 100 + 1);
		if(random%2 == 0) {
			System.out.println("종료 :" + random);
				break;
			}
		System.out.println("랜덤값 :" + random);
		}
	}
*/
		int random = (int) (Math.random() * 100 + 1);
		for (int i = 1; i <= 100; i++) {
			if(random%2 == 1)
				System.out.println("종료 :");
			break;
		}
		System.out.println("랜덤값:");
	}

	public void method5() {
		// 1부터 10까지의 정수 중에 짝수만 출력
		// continue: 반복문 내에서 실행되면 뒤의 코드를 무시하고 증감식이나 조건식으로 이동
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
	}
}
		