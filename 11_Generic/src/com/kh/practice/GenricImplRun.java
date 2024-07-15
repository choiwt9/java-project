package com.kh.practice;

interface Inter1<T> {
	void method1(T data);
}

interface Inter2<F> {
	void method2(F data);
}

class DataClass04<E> implements Inter1<E>, Inter2<E> {

	public void method1(E data) {
		System.out.println(data);
	}

	public void method2(E data) {
		System.out.println(data);
	}

}

public class GenricImplRun {

	public static void main(String[] args) {
		DataClass04<String> dc4 = new DataClass04<>();
		dc4.method1("좋아하는 색은");
		dc4.method2("무지개색이다");
		DataClass04<Integer> dc5 = new DataClass04<>();
		dc5.method1(12345679);
		dc5.method2(9);
		System.out.println();
	}

}
