package com.kh.view;

import java.util.Scanner;

import com.kh.controller.PlayControlGame;

public class DisplayMenu {

	public DisplayMenu() {
	}

	Scanner sc = new Scanner(System.in);

	private PlayControlGame pc = new PlayControlGame();

	public void menu() {

		System.out.println("=====game console=====");
		System.out.println("up & down");
		System.out.println("가위바위보");
		System.out.println("==========");

		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			game1();
			break;

		default:
			break;
		}

	}

	public void game1() {
		int randomInt = (int) (Math.random() * 50 + 1);

		int num = sc.nextInt();

		for (int i = 0; i < 5; i++) {
			System.out.print("참가자 번호");
			if (num > randomInt) {
				System.out.println("up");
			} else if (num == randomInt) {
				System.out.println("catch");
			} else if (num < randomInt) {
				System.out.println("down");

			}
		}

	}
}
