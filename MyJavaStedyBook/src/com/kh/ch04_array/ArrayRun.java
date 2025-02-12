package com.kh.ch04_array;

public class ArrayRun {

	public static void main(String[] args) {
		/*
		 * -변수 : 하나의 공간에 하나의 값만 저장 -배열 : 하나의 공간에 여러개의 값을 저장한다( 같은 자료형의 값만 저장) 선언 -자료형[]
		 * 참조변수명(배열이름); -배열 이름 = new 자료형 [배열 크기]; (배열 크기 >=0) 선언과 동시에 할당 -자료형 [] 배열이름 =
		 * new 자료형 [배열크기]; 값을 대입 -배열 이름[인덱스]= 값; 선언, 할당 초기화 동시에 처리 자료형[] 배열이름 = new
		 * 자료형[]{값,값,값,값,.....} 자료형[] 배열이름={값,값,값,값,.....}
		 * 
		 * -일반 변수 : 실제 리터럴(값 자체)를 담을 수 있는 변수 => 기본자료형 int, double............ -참조 변수 :
		 * 주소값을 담고 있는 변수 =>int[], String, Scanner.......
		 */
		int[] iArr = new int[3]; // 인덱스 범위 0 1 2

		for (int i = 0; i < iArr.length; i++)
			System.out.println(iArr[i]);

		System.out.println("--------------------");
		double[] dArr = new double[5];

		for (int i = 0; i < dArr.length; i++)
			System.out.println(dArr[i]);
		System.out.println("--------------------");
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (100 + 1));

			System.out.println(arr[i]);
		}

	}
}
