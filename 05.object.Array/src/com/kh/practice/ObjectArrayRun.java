package com.kh.practice;

import java.util.Scanner;

public class ObjectArrayRun {

	public static void main(String[] args) {
		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.println(arr[i]);
		}

		Student[] sArr = new Student[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < sArr.length; i++) {
			System.out.print("이름:");
			String name = sc.next();
			System.out.print("나이:");
			int age = sc.nextInt();
			System.out.print("성별:");
			char gender = sc.next().charAt(0);

			sArr[i] = new Student(name, age, gender);
			sArr[i].info();
		}
		sArr[1].info();
	}

}
