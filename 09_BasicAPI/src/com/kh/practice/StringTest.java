package com.kh.practice;

public class StringTest {

	public static void main(String[] args) {
		test1();
		test2();
	}

	public static void test2() {
		String str = "Hello";
		System.out.println("[1]" + str.equals("Hello"));
		System.out.println("[2]" + str.equals("Bye"));

		System.out.println("[3]" + str.charAt(1));

		System.out.println("[4]" + str.length());

		System.out.println("[5]" + str.charAt(str.length() - 1));

		System.out.println("[6]" + str.toUpperCase());
		System.out.println("[7]" + str.toLowerCase());
		System.out.println("[8]" + str.contains("el"));
		System.out.println("[9]" + str.contains("cc"));
		System.out.println("[10]" + str.indexOf("el"));
		System.out.println("[11]" + str.indexOf("cc"));
		System.out.println("[12]" + str.substring(2));
		System.out.println("[13]" + str.substring(2, 4));

		System.out.println("졸리다 ".repeat(5));

		String str2 = "카레. 돈가스.김치.밥.닭갈비";
		String[] menus = str2.split(".");
		for (int i = 0; i < menus.length; i++) {
			System.out.println(i + "번째 메뉴 : " + menus[i]);
		}

	}

	public static void test1() {

		String str1 = "apple";
		String str2 = "apple";

		System.out.println("[1]" + (str1 == str2));

		System.out.println("[2]" + (str1 == "apple"));

		String str3 = new String("apple");
		String str4 = new String("apple");

		System.out.println("[3]" + (str3 == str4));
		// => 주소값이 다르다

		System.out.println("[4]" + (str3 == "apple"));
		// str3는 새로운 메모리 공간 할당 후 apple값을 저장
		// apple은 상수풀에 저장되있어 서로 다른 곳을 가리킨다.

		System.out.println("값 자체를 비교하고자 할때 (equals): " + (str3.equals("apple")));

		System.out.println("======================================");

		String str5 = "Hello";
		String str6 = "world";

		System.out.println("[5]" + str5);
		System.out.println("[6]" + str5.toString()); // String 클래스에서 toString 메소드 오버라이딩

		int hash = System.identityHashCode(str5);
		System.out.println("[7]" + hash);

		str5 = str5.concat(str6);
		System.out.println("[8]" + str5);

		int hash2 = System.identityHashCode(str5);
		System.out.println("[9]" + hash2);
		System.out.println("[10]" + System.identityHashCode("HelloWorld"));

	}
}
