package com.kh.practice2;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자:");
		String str = sc.next();

		char word = str.charAt(0);

		System.out.println((int) word);

	}

}
