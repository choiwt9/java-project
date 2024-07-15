package com.kh.example.practice6;

public class Book {

	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;

//생성자 3개
	public Book() {
	} // 기본 생성자 초기화 없이 객체 생성
//전달된 데이터를 변수에 초기화 하여 객체 생성

	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;

	}

	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}

	public void inform() {
		// 정보 출력 :현재 클래스 변수의 값을 출력
		System.out.printf("title=%s, publisher=%s, author=%s", title, publisher, author);

	}
}
