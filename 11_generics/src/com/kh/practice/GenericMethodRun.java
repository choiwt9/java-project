package com.kh.practice;

class dataClass {
	public <T> void test(Integer num) {
		T data;

		data = (T) num;

		System.out.println();
	}

	public <T> T test2(T data) {
		T t;
		t = data;
		return t;
	}
}

class dataClass1<T> {

	public <K> void test(T data, K data2) {
	}
}

public class GenericMethodRun {
	public static void main(String[] args) {
		dataClass d1 = new dataClass();

		d1.test(123456);
		d1.<Double>test(777);

		d1.test2("Orange");
		d1.<Integer>test2(999999);

		dataClass1<String> d2 = new dataClass1<>();

	}
}
