package com.kh.practice.book.view;

import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {

	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	public Book[] bArr;

	public BookMenu() {
		bc.makeFile();

		bArr = bc.fileRead();
	}

	public void mainMenu() {
		System.out.println("1.도서 추가 저장");
		System.out.println("2.저장 도서 출력");
		System.out.println("9.프로그램 종료");
		System.out.println("번호");

		int menu = sc.nextInt();
		sc.nextLine();
		switch (menu) {
		case 1:
			fileSave();

		}

	}

	public void fileSave() {
		
		System.out.print("도서 명 :");
		String title = sc.nextLine();
		System.out.print("저자 명 :");
		String author = sc.nextLine();
		System.out.print("출판 날짜(yyyy-mm-dd) :");
		String date = sc.next(author)
		System.out.print("도서 가격 :" );
		int price = sc.nextInt();
		System.out.print("할인율 : ");
	    double discount = sc.nextDouble();
		sc.nextLine();
		String dItem[] = date.split("-");
		
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(dItem[0]), 
				Integer.parseInt(dItem[1])-1, 
				Integer.parseInt(dItem[2]));
		Book newBook = new Book(title, author, price, cal, discount);
		for(int i = 0; i<bArr.length; i++) {
			if(bArr[i] ==null) {
				bArr[i] = newBook;
				break;
			}
		}
		bc.fileSave(bArr);
	}

	public void fileRead() {

		Book[] bList = bc.fileRead();
		for (Book b : bList) {
			if (b != null) {
				System.out.println(b);
			}
		}
	}

}
