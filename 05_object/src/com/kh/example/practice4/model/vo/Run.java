package com.kh.example.practice4.model.vo;

public class Run {
	public static void main(String[] args) {
		Student s = new Student();
		s.setGrade(1);
		s.setclassroom(5);
		s.setname("최원탁");
		s.setheight(170);
		s.setgender('남');

		s.information();
	}
}
