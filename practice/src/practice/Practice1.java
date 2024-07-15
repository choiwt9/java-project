package practice;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자");

		int num= sc.nextInt();

		for (int i = 1; i <= num; i++ ) {

			System.out.println("자릿수를 맞추시오");

		} else if (num.equals(num)) {

			System.out.println("중복 있음");

		} else {

			System.out.println("성공");

		}

	}

}