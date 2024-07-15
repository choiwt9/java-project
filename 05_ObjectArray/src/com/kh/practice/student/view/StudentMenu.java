package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	private StudentController ssm = new StudentController();

	public StudentMenu() {
		System.out.print("=======학생 정보 출력=======");
		Student[] sArr = ssm.printStudent();
		for (int i = 0; i < sArr.length; i++) {
			String info = sArr[i].inform();
			System.out.println(info);
			/*
			 * for(Student s : sArr) { String info = s.inform(); System.out.println(info);
			 */
		}

	}System.out.print("=======학생 성적 출력=======");double[]=ssm.avgScore();System.out.println("학생 점수 합계 :"+score[0]);System.out.println("학생 점수 평균 :"+score[1]);System.out.print("=======학생 결과 출력=======");

	int cutLine= StudentController.CUT_LINE;for(
	int i = 0;i<sArr.length;i++)
	{
		if (sArr[i].getScore() < cutLine) {
			System.out.println(sArr[i].getName() + "재시험 대상");
		} else {
			System.out.println(sArr[i].getName() + "통과");
		}
	}

}
