package com.kh.practice;

public class StringBuilder {

	public StringBuilder(String str) {
	}

	public static void main(String[] args) {
		String str = "winter";
		StringBuilder sb = new StringBuilder(str);

		System.out.println(sb);
		System.out.println(sb.toString());
		System.out.println(System.identityHashCode(sb));
		System.out.println("--------------------");

		sb.append(" is pretty.");
		sb.append("!!!");

		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));

	}

	private void append(String string) {
		// TODO Auto-generated method stub

	}

}
