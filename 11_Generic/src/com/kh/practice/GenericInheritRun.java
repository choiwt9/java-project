package com.kh.practice;

class parent<T> {
	T data;
}

class Child1 extends parent {

}

class Child2 extends parent<String> {

}

class Child3<K> extends parent<K> {

}

class Child4<M, N> extends parent<M> {

	N data2;

}

public class GenericInheritRun {

	public static void main(String[] args) {

		Child3<String> c3 = new Child3<>();
		c3.data = "안녕하세요";
		System.out.println(c3.data);

		Child4<String, Integer> c4 = new Child4<>();
		c4.data = "최원탁";
		c4.data2 = 30;
		System.out.println(c4.data);
		System.out.println(c4.data2);

	}

}
