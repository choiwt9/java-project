package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {

		String[][] arr = new String[3][3];

		for (int i = 0; i < arr.length; i++) { // i: 행의 인덱스로 사용

			for (int j = 0; j < arr[i].length; j++) { // j:열의 인덱스로 사용

				arr[i][j] = "(" + i + ", " + j + ")";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

	public void practice2() {

		int[][] numbers = new int[4][4];

		int value = 1;
		for (int i = 0; i < numbers.length; i++) { // 행의 인덱스.
			for (int j = 0; j < numbers[i].length; j++) { // 열의 인덱스.
				numbers[i][j] = value++; // 4 * i + (j + 1)
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.printf("%3d", numbers[i][j]);
			}
			System.out.println();
		}

	}

	public void practice4() {// 4행 4열
		// 4행 4열 정수형 배열 선언 및 할당
		int[][] sumArr = new int[4][4];

		// 0행 0열부터 2행 2열까지는 1 ~ 10까지 임의의 정수 값 저장
		// 3행에는 각 열의 합을, 3열에는 각 행의 합, 3행 3열에는 가로 세로 합

		for (int i = 0; i < sumArr.length; i++) {
			for (int j = 0; j < sumArr[i].length; j++) {

				int lastRow = sumArr.length - 1; // 마지막 행의 인덱스
				int lastCol = sumArr[i].length - 1; // 마지막 열의 인덱스

				// 랜덤값을 각 위치에 저장 (0,0 ~ 2,2)
				if (i != lastRow && j != lastCol) {
					sumArr[i][j] = (int) (Math.random() * 10 + 1);
				}

				System.out.printf("%d, %d, 랜덤값: %d\n", i, j, sumArr[i][j]);

				// 마지막 행의 위치에 현재 값을 더하기
				if (i < lastRow) {
					sumArr[lastRow][j] += sumArr[i][j];
					System.out.printf("마지막행: %d <-- %d\n", sumArr[lastRow][j], sumArr[i][j]);
				}

				// 마지막 열의 위치에 현재 값을 더하기
				if (j < lastCol) {
					sumArr[i][lastCol] += sumArr[i][j];
					System.out.printf("마지막열: %d <-- %d\n", sumArr[i][lastCol], sumArr[i][j]);
				}

			}
		}
	}

	public void practice4_1() {// 4행 4열
		int[][] sumarr = new int[4][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sumarr[i][j] = (int) (Math.random() * 10 + 1);
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sumarr[3][i] += sumarr[j][i];
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sumarr[i][3] += sumarr[i][j];
			}
		}
		sumarr[3][3] = sumarr[3][0] + sumarr[3][1] + sumarr[3][2] + sumarr[0][3];
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("행 :");
			int row = sc.nextInt();
			System.out.print("열 :");
			int col = sc.nextInt();

			if (row < 1 || row > 10 || col < 1 || col > 10) {
				System.out.println("반드시 1과 10 사이 ");
				continue;
			}
			// 입력받은 행, 열크기로 2차원 배열 선언 및 할당
			int[][] charr = new int[row][col];

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					// 65 에서 90까지 랜덤
					charr[i][j] = (int) (Math.random() * (90 - 65 + 1) + 65);
				}
			}
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print((char) charr[i][j] + " ");
				}
				System.out.println();
			}
			break;
		}

	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("행 :");
		int row = sc.nextInt();
//열의 크기가 다른 2차원 선언
		int[][] arr = new int[row][];
		char value = 'a';
		for (int i = 0; i < row; i++) {
			System.out.print(i + "행 열");
			int col = sc.nextInt();
			arr[i] = new int[col];

			for (int j = 0; j < col; j++) {
				arr[i][j] = value++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print((char) arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice10() {

	}
}
