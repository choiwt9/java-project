package com.kh.example.practice.run;

import com.kh.example.practice.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setName("아이폰");
		p1.information();

		// 매개변수 3개인 생성자를 사용해 product 객체 생성

		// 저장된 데이터 출력. information 메소드 호출

		Product p2 = new Product("아이폰", "삼성", 300000);
		p2.information();

	}

}
