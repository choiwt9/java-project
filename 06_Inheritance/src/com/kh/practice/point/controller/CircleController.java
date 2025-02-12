package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {

	private Circle c = new Circle();

	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		double area = c.getRadius() * c.getRadius() * Math.PI;
		return "면적:" + c.toString() + "/" + radius * area;
	}

	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		double circum = c.getRadius() * c.getRadius();
		return "둘레:" + c.toString() + "/" + circum;
	}
}
