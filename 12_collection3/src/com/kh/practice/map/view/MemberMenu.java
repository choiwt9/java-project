package com.kh.practice.map.view;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu<V, K> {

	private MemberController mc = new MemberController();

	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		while (true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 회원가입 ");
			System.out.println("2. 로그인 ");
			System.out.println("3. 같은 이름 회원 찾기  ");
			System.out.println("9. 종료 ");

			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				joinMembership();
				break;
			case 2:
				logIn();
				break;
			case 3:
				sameName();
				break;
			case 9:
				System.out.println("프로그램 종료 ");
				return;
			default:
				System.out.println("잘못 입력 하셨습니다, 다시 입력해주세요");
				break;
			}
		}
	}

	private void joinMembership() {

		System.out.println("이름 :");
		String name = sc.nextLine();
		System.out.println("ID :");
		String id = sc.nextLine();
		System.out.println("password :");
		String pw = sc.nextLine();
		Member m = new Member(name, pw);

		boolean result = mc.joinMembership(id, m);

		if (result) {
			System.out.println("회원가입 완료");
		} else {
			System.out.println("중복, 재입력 요망");
		}
	}

	private void memberMenu() {

		System.out.println("******* 회원 메뉴 ******* ");
		while (true) {
			System.out.println("1. 비밀번호 바꾸기 ");
			System.out.println("2. 이름 바꾸기  ");
			System.out.println("3. 로그아웃  ");
			System.out.println("메뉴 번호 선택  ");

			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				changePassWord();
				break;
			case 2:
				changeName();
				break;
			case 3:
				System.out.println("로그 아웃");
				break;
			default:
				System.out.println("다시 입력해주세요.");
			}
		}
	}

	private void logIn() {
		while (true) {
			System.out.println("ID :");
			String id = sc.nextLine();
			System.out.println("password :");
			String pw = sc.nextLine();

			String name = mc.login(id, pw);
			if (name != null) {
				System.out.println(name + "님, 환영합니다!");
				break;
			} else {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");

			}
		}
	}

	private void changePassWord() {

		System.out.print("ID : ");
		String id = sc.nextLine();
		System.out.print("현재 비번 : ");
		String oldPw = sc.nextLine();
		System.out.print("새 비번 : ");
		String newPw = sc.nextLine();

		boolean result = mc.changePassword(id, oldPw, newPw);
		if (result) {
			System.out.println("변경");

		} else {
			System.out.println("변경 실패, 다시 입력");
		}
	}

	private void changeName() {
		System.out.println("ID :");
		String id = sc.nextLine();
		System.out.println("PW :");
		String pw = sc.nextLine();

		String name = mc.login(id, pw);
		if (name != null) {
			System.out.println("현재 이름" + name);
			System.out.println("변경할 이름");
			String newName = sc.nextLine();
			mc.changeName(id, newName);
			System.out.println("변경");

		} else {
			System.out.println("변경실패");
		}
	}

	private void sameName() {

		System.out.println("검색할 이름");
		String searchName = sc.nextLine();

		TreeMap<K, V> result = mc.sameName(searchName);
		if (result.isEmpty()) {
			System.out.println("검색 결과 없음");
		} else {
			for (Object entry : result.entrySet()) {
				Entry<String, String> e = (Entry) entry;
				System.out.println(e.getKey() + "-" + e.getValue());
			}
		}

	}
}
