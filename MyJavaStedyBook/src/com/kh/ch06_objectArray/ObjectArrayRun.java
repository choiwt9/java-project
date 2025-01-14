package com.kh.ch06_objectArray;

public class ObjectArrayRun {

	public static void main(String[] args) {
		/*
		 * 객체 배열 : 객체를 저장하는배열 배열의 각 요소가 참조변수들로 이루어짐 => 객체를 사용하려면 각 요소마다 객체 생성 필요 클래스명 []
		 * 참조변수명(배열명) = new 클래스명[배열크기]; => 배열 크기만큼 참조변수 배열 생성
		 * 
		 * 배열명[인덱스] = new 클래스명();//new 생성자;
		 * 
		 */

		Product[] products = new Product[3];

		/*
		 * for (int i = 0; i <= products.length; i++) {
		 * System.out.println(products[i].getName());
		 */
		/*
		 * 문제점 1. 인덱스 범위를 벗어나 접근 반복문의 조건식 부분이 i<=길이로 되어 있어 마지막 인덱스보다 큰값까지 접근 => 조건식 부분을
		 * i<배열길이로 수정해줘야 함 2.객체 배열의 각 인덱스 위치에 담긴 값이 null 이 상태로 객체 내의 메소드로 접근하려 한다. =>
		 * 메소드 접근 전에 각 인덱스 위치에 객체를 생성해 주어야 한다.
		 */
		products[0] = new Product();
		products[0].setName("zz");
		products[1] = new Product();
		products[1].setName("dd");

		for (int i = 0; i < products.length; i++) {
			products[i] = new Product();
		}

	}

}
