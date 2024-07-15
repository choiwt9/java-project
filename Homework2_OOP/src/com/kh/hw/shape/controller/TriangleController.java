package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	private Shape s = new Shape();

	// 생성자 생략 기본생성자 존재
	public double calcArea(double height, double width) {

		s = new Shape(3, height, width);

		return s.getWidth() * s.getHeight();

	}

	public void paintColor(String color) {
		s.setColor(color);
	}

	public String print() {
		return "삼각형" + s.information();
	}
}
