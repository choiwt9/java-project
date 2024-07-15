package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

//화면(view) 용 클래스 -->사용자에게 데이터 표시(출력),입력 받는 역할
public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();

	public void mainMenu() {

		System.out.println("== Welcome Library ==");
		System.out.println("***** 메인 메뉴 *****");
		while (true) {
			System.out.println("1. 새 도서 추가 ");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회 ");
			System.out.println("4. 도서 삭제 ");
			System.out.println("5. 도서 명 오름차순 정렬 ");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int bookNum = sc.nextInt();
			sc.nextLine();

			switch (bookNum) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				return; // 메소드 종료 호출한 위치로 돌아감

			default:
				System.out.println("잘못 입력 하셨습니다.");
				break;
			}
		}
	}

	private void insertBook() {

		System.out.println("도서 명");
		String title = sc.nextLine();
		System.out.println("저자 명");
		String author = sc.nextLine();
		System.out.println("장르  (1.인문 / 2.자연과학 / 3.의료 / 4.기타)  명");
		int category = sc.nextInt();
		System.out.println("가격");
		int price = sc.nextInt();

		String strCtg = "";
		if (category == 1) {
			strCtg = "인문";
		} else if (category == 2) {
			strCtg = "자연과학";
		} else if (category == 3) {
			strCtg = "의료";
		} else if (category == 4) {
			strCtg = "기타";
		}
		Book b = new Book(title, author, strCtg, price);
		/*
		 * String[] categories = {"인문", "자연과학","의료","기타" }; Book b2 = new Book(title,
		 * author, categories[category -1], price);
		 */
		// String categories = "인문, 자연과학,의료,기타";
		// Book b3 = new Book(title, author, categories.split(",")[category -1], price);
		// 컨트롤러에 생성된 Book 객체 전달
		bc.insertBook(b);
	}

	private void selectList() {

		ArrayList<Book> bookList = bc.selectList();
		if (bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for (int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
		}
	}

	private void searchBook() {
		System.out.print("제목: ");
		String keyword = sc.nextLine();
		ArrayList<Book> searchList = bc.searchBook(keyword);
		if (searchList.isEmpty()) {
			System.out.println("해당 도서가 없습니다");
		} else {
			for (Book b : searchList) {
				System.out.println(b);
			}
		}

	}

	private void deleteBook() {
		System.out.print("삭제할 도서 제목: ");
		String title = sc.nextLine();

		System.out.print("삭제할 도서 저자: ");
		String author = sc.nextLine();

		Book remove = bc.deleteBook(title, author);
		if (remove != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}

	}

	private void ascBook() {
		int result = bc.ascBook();
		if (result == 1) {
			System.out.println("정렬에 성공하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");

		}
	}

}
