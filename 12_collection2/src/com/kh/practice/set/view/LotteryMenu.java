package com.kh.practice.set.view;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.mdel.vo.Lottery;

public class LotteryMenu {

	LotteryController lc = new LotteryController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.println("========== 추첨 프로그램 ==========");
		while (true) {

			System.out.println("******* 메인 메뉴 *******");

			System.out.println("1. 추첨 대상 추가 ");
			System.out.println("2. 추첨 대상 삭제 ");
			System.out.println("3. 당첨 대상 확인 ");
			System.out.println("4. 정렬된 당첨 대상 확인 ");
			System.out.println("5. 당첨대상 검색 ");
			System.out.println("9. 종료 ");
			System.out.println("메뉴 번호 선택: ");

			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				insertObject();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				winObject();
				break;
			case 4:
				sortedWinObject();
				break;
			case 5:
				searchWinner();
				break;
			case 9:
				System.out.println("“프로그램 종료 ");
				return;
			default:
				System.out.println("잘못 입력 하셨습니다.");
				break;
			}
		}
	}

	private void insertObject() {
		System.out.print("추가할 추첨 대상 수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < num; i++) {
			System.out.println("이름 : ");
			String name = sc.nextLine();
			System.out.println("핸드폰 번호 : ");
			String phone = sc.nextLine();
			Lottery lottery = new Lottery(name, phone);
			boolean result = lc.insertObject(lottery);
			if (!result) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				i--;

			}
		}
		System.out.println("추가 완료되었습니다");
	}

	private void deleteObject() {
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("핸드폰 번호 : ");
		String phone = sc.nextLine();

		Lottery lottery = new Lottery(name, phone);
		boolean result = lc.deleteObject(lottery);

		if (result) {
			System.out.println("삭제 완료되었습니다");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}

	private void winObject() {
		HashSet<Lottery> lSet = lc.winObject();
		System.out.println(lSet);

	}

	private void sortedWinObject() {
		TreeSet<Lottery> lSet = lc.sortedWinObject();
		Iterator<Lottery> it = lSet.iterator();
		while (it.hasNext()) {
			Lottery l = it.next();
			System.out.println(l);
		}
	}

	private void searchWinner() {
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("핸드폰 번호 : ");
		String phone = sc.nextLine();
		Lottery l = new Lottery(name, phone);
		boolean result = lc.searchWinner(l);

		if (result) {
			System.out.println("축하합니다. 당첨입니다.");
		} else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}

	}
}
