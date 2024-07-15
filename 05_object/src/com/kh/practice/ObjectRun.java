package com.kh.practice;

public class ObjectRun {

	public static void main(String[] args) {
		// 학생을 대상으로 프로그래밍
		// "학생" 객체 선정!
		// 정보-> 학번 이름 나이
		// 기능-> 정보조회
		// 변수 사용해 학생 정보 조회
		int no1 = 100;
		String name1 = "최원탁";
		int age1 = 20;
		char gender1 = '남';

		int no2 = 101;
		String name2 = "카리나";
		int age2 = 26;
		char gender2 = '여';

		int no3 = 103;
		String name3 = "장동건";
		int age3 = 46;
		char gender3 = '남';
		// 너무 많은 변수
		// 배열 사용 (각 정보를 담을 배열)
		int[] noArr = new int[3];
		String[] nameArr = new String[3];
		int[] ageArr = new int[3];
		char[] genderArr = new char[3];

		/*
		 * int [] noArr = new int{}; String [] nameArr = new {}; int [] ageArr = new
		 * int{}; char [] genderArr = new char{};
		 */

		// 첫번째 학생 정보
		/*
		 * noArr = 100; St = "최원탁"; int age1 = 20; char gender1 = '남';
		 */
		// 클래스를 사용해 서로 다른 데이터를 한 곳에 저장
		/*
		 * Student s1 = new Student(); s1.no = 100; s1.name = "최원탁"; s1.age = 20;
		 * s1.gender='남';
		 */

		/*
		 * Student s2 = new Student(); s1.no = 100; s1.name = "최원탁";
		 */
	}

}
