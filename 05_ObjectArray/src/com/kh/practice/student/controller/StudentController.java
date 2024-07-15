package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {

	private Student[] sArr = new Student[5];
	// 예약어 누락 : static final
	// public static final int CUT_LINE = 60;
	public static final int CUT_LINE = 60;

	public StudentController() {

		sArr[0] = new Student("최원탁", "자바", 100);
		sArr[1] = new Student("마이콜", "디비", 60);
		sArr[2] = new Student("둘리", "화면", 75);
		sArr[3] = new Student("도우너", "서버", 100);
		sArr[4] = new Student("또치", "자바", 100);

	}

//getter의 역할
	public Student[] printStudent() {
		// Student 객체 배열 타입의 변수를 반환!
		// return sArr;
		return sArr;

	}

	public int SumScore() {// 객체 배열 점수 합 반환
		// 방법 1
		int total = 0;
		for (int i = 0; i < sArr.length; i++) {
			total += sArr[i].getScore();
		}
		// 방법 2
		/*
		 * int t2 = 0; for(Student s : sArr) { t2 += s.getScore();
		 */
	}return total;

	}

	public double[] avgScore() {
		// double 형태의 배열 변수를 반환!
		// double[] data = new double[2]; // 배열을 선언 및 할당 한 후
		// 어떠한 정보를 담아서..
		// return data; // double[] 타입의 변수를 반환
		double[] avg = new double[2];
		int total = SumScore();
		avg[0] = total;
		avg[1] = total / sArr.length();
		return avg;
	}
}
