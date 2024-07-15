package com.kh.practice.student.model.vo;

public class Student {

	private String name;
	private String subjact;
	private int score;

	public Student() {
	}

	public Student(String name, String subjact, int score) {
		this.name = name;
		this.subjact = subjact;
		this.score = score;
	}

	public String inform() {
		return String.format("이름: %s / 과목: %s / 점수 : %d", name, subjact, score);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubjact() {
		return subjact;
	}

	public void setSubjact(String subjact) {
		this.subjact = subjact;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
