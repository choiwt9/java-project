package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {

	private Rectangle r = new Rectangle() {
		
		public String calcArea(int x, int y, int height, int width) {
			
			r = new Rectangle(x, y, height, width);
			return "면적:" + r.toString() + "/" + (r.getHeight()*r.getWidth());
		}
	

	public String calcPerimeter(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width);
		return "둘레:" + r.toString() + "/" + (2*r.getHeight()+2*r.getWidth());
	}
	}
