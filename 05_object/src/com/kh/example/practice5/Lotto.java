package com.kh.example.practice5;

import java.util.Arrays;

public class Lotto {

	// 필드부
	private int[] Lotto;
//초기화 블럭
	{
		Lotto = new int[6]; // 6개 정수 데이터 할당
		for (int i = 1; i < Lotto.length; i++) {
			// 로또 배열의 i번째 위치에 랜덤값 저장
			Lotto[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (Lotto[i] == Lotto[j]) {
					i--;
					break;
				}

			}
		}

	}

	public Lotto() {
	}

	public void information() {
		// Arrays.toString(배열명):[값1 값 2 .....] 출력
		System.out.println(Arrays.toString(Lotto));
		// 향상된 for문
		// for(자료형 변수명 : 배열명){}-->자료형은 배열명과 일치해야한다
		for (int num : Lotto) {
			System.out.print(num + ",");
		}
	}
}
