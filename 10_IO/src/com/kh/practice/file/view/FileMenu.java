package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {

	FileController fc = new FileController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {

		while (true) {
			System.out.println("****my note****");
			System.out.println("1 노트 새로 만들기 : ");
			System.out.println("2 노트 열기 : ");
			System.out.println("3 노트 열어서 수정하기 : ");
			System.out.println("9. 종료 : ");
			System.out.print("메뉴번호 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("다시 입력해 주세요");
			}
		}
	}

	private void fileEdit() {

		System.out.print("수정할 파일 명 : ");
		String fileName = sc.nextLine();

		if (fc.checkName(fileName)) {

			StringBuilder sb = new StringBuilder();
			while (true) {
				System.out.println("파일에 저장할 내용을 입력하세요");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다. ");
				System.out.print("내용 : ");
				String content = sc.nextLine();
				if (!content.equals("ex끝it"))
					sb.append(content);
				else {
					fc.fileEdit(fileName, sb);
					return;
				}
			}
		} else {
			System.out.println("없는 파일입니다");
			return;
		}

	}

	public void fileSave() {

		StringBuilder sb = new StringBuilder();
		while (true) {
			System.out.println("저장할 내용을 입력하세요 : ");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다. ");
			System.out.print("내용 : ");
			String content = sc.nextLine();

			if (!content.equals("ex끝it")) {
				sb.append(content);
			} else {
				break;
			}
		}
		System.out.println("저장할 파일명을 입력해 주세요 (ex. myFile.txt)");
		String fileName = sc.nextLine();

		if (fc.checkName(fileName)) {
			System.out.print("이미 존재하는 파일입니다 덮어쓰시겠습니까?");
			char yn = sc.next().charAt(0);

			if (yn == 'y' || yn == 'Y') {
				fc.fileSave(fileName, sb);
				return;
			}

		} else {
			fc.fileSave(fileName, sb);
			return;
		}
	}

	private void fileOpen() {
		System.out.print("열 파일 명 : ");
		String fileName = sc.nextLine();

		if (fc.checkName(fileName)) {
			System.out.println(fc.fileOpen(fileName));
		} else {
			System.out.print("없는 파일입니다. ");
			return;
		}

	}
}
