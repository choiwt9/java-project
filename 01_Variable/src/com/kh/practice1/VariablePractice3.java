package com.kh.practice1;

import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 :");

		double L = sc.nextDouble();

		System.out.print("수학 :");

		double M = sc.nextDouble();

		System.out.print("영어 :");

		double E = sc.nextDouble();

		int total = (int) (L + M + E);

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (total / 3));
		System.out.println("총점 : " + (int) (L + M + E));
		System.out.println("평균 : " + (int) ((L + M + E) / 3));

	}
}
