package com.kh.practice.list.library.model.vo;

public class Book implements Comparable<Book> {

	private String title;
	private String author;
	private String category;
	private int price;

	public Book() {
	}

	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "\t(" + title + "/" + author + "/" + category + "/" + price + ")";
	}

	public int compareTo(Book o) {

		return this.title.compareTo(o.title);
	}

}
