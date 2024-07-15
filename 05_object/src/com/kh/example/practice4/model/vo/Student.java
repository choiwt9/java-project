package com.kh.example.practice4.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	// 초기화 블록
	{
		grade = 1;
	}

	public Student() {

	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;

	}

	public int getclassroom() {
		return classroom;
	}

	public void setclassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public double getheight() {
		return height;
	}

	public void setheight(double height) {
		this.height = height;
	}

	public char getgender() {
		return gender;
	}

	public void setgender(char gender) {
		this.gender = gender;

	}

	public void information() {
		System.out.println(grade + classroom + name + height + gender);
	}
}
