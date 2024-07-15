package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {

	public void menu() {

		Scanner sc = new Scanner(System.in);

		CharacterController cc = new CharacterController();
		try {
			System.out.print("문자열 :");
			String str = sc.nextLine();
			int count = cc.countAlpha(str);
			System.out.printf("'%s'에 포함된 영문자 개수 : %d");
		} catch (CharCheckException e) {
			e.printStackTrace();

		}
	}

}
