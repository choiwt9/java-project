package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {

	private Shape s = new Shape();
//생성자부 생략

	// 메소드부
	public double calcPerimeter(double height, double width) {
		s = new Shape(4, height, width);
		return s.getHeight() * 2 + s.getWidth() * 2;
	}

	public double calcArea(double height, double width) {
		s = new Shape(4, height, width);
		return s.getHeight() * s.getWidth();

	}

	public void paintColor(String color) {
		s.setColor(color);
	}

	public String paint() {
		return "사각형" + s.information();
	}
}
