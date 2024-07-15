package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	public void practice1() {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");

		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();

//		 메뉴 1 선택 시, menu 변수의 값이 1과 같다면
		if (menu == 1) {
			System.out.println("입력 메뉴입니다");
		} // 메뉴 2 선택 시, menu 변수의 값이 2와 같다면
		else if (menu == 2) {
			System.out.println("수정 메뉴입니다");
		} // 메뉴 3 선택 시, menu 변수의 값이 3과 같다면
		else if (menu == 3) {
			System.out.println("조회 메뉴입니다");
		} // 메뉴 4 선택 시, menu 변수의 값이 4과 같다면
		else if (menu == 4) {
			System.out.println("삭제 메뉴입니다");
		} // 메뉴 7 선택 시, menu 변수의 값이 7과 같다면
		else if (menu == 7) {
			System.out.println("종료 메뉴입니다");
		}

	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 하나를 입력 하세요 : ");

		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {// 짝수인 경우)
				System.out.println("짝수");
			} else if (num % 2 == 1) {
				System.out.println("홀수");
			} else if (num < 0) {
				System.out.println("양수만 입력하시오");
			}

		}
	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수 : ");

		int L = sc.nextInt();

		System.out.print("수학 점수 : ");

		int M = sc.nextInt();

		System.out.print("영어 점수 : ");

		int E = sc.nextInt();
		// 세 과목 점수 각각 40점 이상 평균 50점 이상
		if (L >= 40 && M >= 40 && E >= 45) {

			int total = L + M + E;
			double avg = total / 3;

			if (avg >= 60) {
				System.out.println("국어 : " + L);
				System.out.println("수학 : " + M);
				System.out.println("영어 : " + E);
				System.out.println("합계 : " + total);
				System.out.println("평균 : " + avg);
				System.out.println("합격입니다");

			} else {
				System.out.println("불합격입니다");
			}
		}
	}
	public void practice4(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~ 12 사이의 정수 입력 : ");
		
		int month = sc.nextInt();
		
		String season = "";
		switch (month) {
		case 1:
		case 2:
		case 12:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		default:
			season = "해당없음";
		}

		if (month >= 1 && month <= 12) {
			System.out.println(month + "월은" + season + "입니다");
		} else {
			System.out.println("해당없음");
		}
		
	}
		
	public void practice5(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID : ");
		String id = sc.nextLine();

		System.out.print("pw : ");
		String pw = sc.nextLine();
		
		if(id.equals("myID") && pw.equals("myPassword12")) {
			System.out.println("로그인 성공");
	}else if(!id.equals("myID")){
		    System.out.println("아이디 오류");
	}else {
		 System.out.println("비밀번호 오류");
	}
		/*
		 if(id.equals("myID")) {
		  System.out.println("아이디 오류");
		 else if(pw.equals("myPassword12")){
		 System.out.println("비밀번호 오류"); 
		 }else {
		 System.out.println("로그인 성공");
		 }
		 */
	}
	public void practice6(){	
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 등급 : ");
		String grade = sc.nextLine();
		
		if(grade.equals("관리자")){
			System.out.println("회원관리,게시글 관리, 게시글 작성, 조회, 댓글 작성");
		}else if(grade.equals("회원")) {
			System.out.println("게시글작성, 게시글조회, 댓글작성");
		}else if(grade.equals("비회원")){
			System.out.println("게시글조회");
		}else {
			System.out.println("입력 오류");
		}
	}
	public void practice7(){
		Scanner sc = new Scanner(System.in);
		System.out.print("키 : ");
		double h = sc.nextDouble();
		System.out.print("몸무게 : ");
		double w = sc.nextDouble();
		
		double bmi = w/(h*h);
		System.out.println("bmi : " + bmi);

		if(bmi < 1.85) {
			System.out.println("저체중");
		}else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		}else if(bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		}else if(bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
}
	public void practice8(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 : ");
		int x = sc.nextInt();
		
		System.out.print("피연산자2 : ");
		int y = sc.nextInt();
		
		System.out.print("연산기호(+,-,*,/,% : ");
		String op = sc.next();
		
		if(x > 0 && y > 0) {
			
			switch(op) {
			case"+"://op.equals("+)
			System.out.printf("%d %s %d = %d,", x, op, y, (x + y) );
			break;
			case"-"://op.equals("+)
			System.out.printf("%d %s %d = %d,", x, op, y, (x - y) );
			break;
			case"*"://op.equals("+)
			System.out.printf("%d %s %d = %d,", x, op, y, (x * y) );
			break;
			case"/"://op.equals("+)
			System.out.printf("%d %s %d = %f,", x, op, y, ((double)x / y) );
			break;
			case"%"://op.equals("+)
			System.out.printf("%d %s %d = %f,", x, op, y, ((double)x % y) );
			break;
			default:
				System.out.println("입력오류 시스템 종료");
			}
		} else {
			System.out.println("입력 오류 시스템 종료");
		}
	}
	public void practice9(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간점수 : ");
		   int mid = sc.nextInt();
		
		System.out.print("기말점수 : ");
		   int fin = sc.nextInt();
		
		System.out.print("과제점수 : ");
		   int hw = sc.nextInt();
		
		System.out.print("출석 : ");
		   int at = sc.nextInt();
		   
		   System.out.println("====================결과===================");
		   double midP = mid*0.2;
		   double finP = fin*0.3;
		   double hwP = hw*0.3;
		   double atP = at;
		   
		   double total = midP +  finP + hwP + atP;
		   
		   //전체 강의 30% 이상 결석 => 70% 초과 출석 시 통과
		   int passAt = (int)(20 * 0.7);
		   if(passAt >= at) { //14 >= at
			   System.out.println("Fail [출석회수 부족 (" + at + "/ 20)]");
		   }else {
			   
			   System.out.println("중간고사 점수(20) : " + midP);
			   System.out.println("기말고사 점수(30) : " + finP);
			   System.out.println("과지 점수(30) : " + hwP);
			   System.out.println("출석 점수(20) : " + atP);
			   System.out.println("총점(20) : " + total);
	
			   if (total >= 70) {
				   System.out.println("Pass");
			   }else {
				   System.out.println("Fail [점수미달]");
				   
				  

			   }
		   }
		   }
	
	}


	

	



	


	
	

	

