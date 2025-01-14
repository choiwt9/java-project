package com.kh.ch11_api;

import java.util.StringTokenizer;

public class API02_String {

	public static void main(String[] args) {
//java.lang.String
		System.out.println("=========java.lang.String==========");

		String str = "Hello, World!";

		// toString() : 저장된 값을 반환
		System.out.println(str/* toString() */);

		// 문자열.charAt(인덱스): char
		// 문자열에서 해당 인덱스 위치의 문자 추출해서 반환
		System.out.println("인덱스 7번 위치의 문자 : " + str.charAt(7));
		char ch = str.charAt(7);
		System.out.println("ch : " + ch);

		// 문자열.concat(문자열) : String
		// => 문자열A이랑 전달된 문자열 B를 합쳐 새로운 문자열로 반환
		String str2 = str.concat("###");
		System.out.println("str2 : " + str2);

		String str3 = str + "###";
		System.out.println("str3 : " + str3);

		System.out.println(str2 == str3);
		// 저장된 값은 같지만 저장된 위치가 다르다.

		// 문자열 A와 문자열 B에 저장된 값을 비교하여 같으면 true 다르면 false
		System.out.println(str2.equals(str3));

		// 문자열.trim(): String
		// 문자열 앞 뒤 공백을 제거한 후 새 문자열을 반환
		System.out.println(str.trim());
		String str4 = "  J A V A   ";
		System.out.println(str4.trim());

		// 문자열 길이 반환
		System.out.println("문자열 길이 : " + str.length());

		char[] chArr = str.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			System.out.println(i + "번째 : " + chArr[i]);

		}
		// 문자열을 대문자로 변환
		System.out.println(str.toUpperCase());
		// 문자열을 소문자로 변환
		System.out.println(str.toLowerCase());

		// ---------------------------------------

		String language = "Java,Oracle,JDBC,HTML,CSS,JS,Spring";
		/*
		 * // 1)split(구분자) : String[] String[] lArr = language.split(",");
		 * System.out.println(lArr.length); for (String lang : lArr) {
		 * System.out.println(lang);
		 */
		// 2)StringTokenizer 클래스
		StringTokenizer st = new StringTokenizer(language.concat(","));
		System.out.println(st.countTokens());
		for (int i = 0; i <= 7; i++) {
			System.out.println(st.nextToken());
		}

		System.out.println(st.nextToken());

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}
}
