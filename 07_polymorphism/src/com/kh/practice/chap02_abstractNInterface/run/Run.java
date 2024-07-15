package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		String[] r = pc.Method();
		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i]);
		}
	}

}
