package com.kh.practice;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String data = "name: choi, phone: 010-1234-5678, address: SsangMoon, mail: wontak9";
//		String[] dArr = new String[4];
		String[] dArr = new String[10];

		int index = 0;
		StringTokenizer st = new StringTokenizer(data, ",");
		while (st.hasMoreTokens()) {
			String keyValue = st.nextToken();
//			int count = 0;
			StringTokenizer st2 = new StringTokenizer(keyValue, ":");
			while (st2.hasMoreTokens()) {
//				if (count % 2 != 0) {

				dArr[index++] = st2.nextToken();
//				} else {
//					st2.nextToken();
//					count++;
//				}
			}
		}

//		System.out.printf("이름 %s이고, 연락처는 %s이고, 주소 %s, 이메일은 %s다.\n", dArr[0], dArr[1], dArr[2], dArr[3]);
		System.out.printf("이름은 %s이고, 연락처는 %s이고, 주소는 %s이고, 이메일은 %s입니다.\n", dArr[1], dArr[3], dArr[5], dArr[7]);

	}

	public static void test1() {
		String msg = "안녕하세요|나는 최원탁 입니다| 반갑습니다";

		String[] arr = new String[3];

		StringTokenizer st = new StringTokenizer(msg, "|");

		int index = 0;

		while (st.hasMoreTokens()) {

			arr[index++] = st.nextToken();
			System.out.println(arr[index]);
			index++;

		}
	}
}
