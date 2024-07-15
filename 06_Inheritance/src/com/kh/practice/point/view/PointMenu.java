package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {

	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();

	public void mainMenu() {

		System.out.println("=======메뉴======");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		System.out.println("메뉴 번호:");
		int menu = sc.nextInt();

		while (true) {
			switch (menu) {
			case 1:
				circleMenu();
				break;
			case 2:
				retangleMenu();
				break;
			case 9:
				System.out.println("종료");
				break;
			default:
				System.out.println("다시 입력");

			}
		}

	}

	public void circleMenu() {
		System.out.println("=======원 메뉴======");
		System.out.println("1. 원 둘레");
		System.out.println("1. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호:");
		int menu = sc.nextInt();

		if (menu != 1 && menu != 2) {
			System.out.println("메인으로");
		}
		return;

		if (menu == 1) {
			calcCircum();
		} else if (menu == 2) {
			calcCircleArea();
		} else if (menu == 9) {
			System.out.println("메인으로");
		} else {
			System.out.println("입력 오류 메인으로");
		}
	}

	public void retangleMenu() {
		System.out.println("=======사각형 메뉴======");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호:");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			calcPerimeter();
			break;
		case 2:
			calcRectArea();
			break;
		case 9:
			System.out.println("메인으로");
			break;
		default:
			System.out.println("입력 오류 메인으로");
			return;
		}
	}

	public void calcCircum() {
		System.out.print("x좌표 : ");
		int x = sc.nextInt();

		System.out.print("y좌표 : ");
		int y = sc.nextInt();

		System.out.print("반지름 : ");
		int r = sc.nextInt();

		System.out.println(cc.calcArea(x, y, r));
	}

	public void calcCircleArea() {

		System.out.print("x좌표 : ");
		int x = sc.nextInt();

		System.out.print("y좌표 : ");
		int y = sc.nextInt();

		System.out.print("반지름 : ");
		int r = sc.nextInt();

		System.out.println(cc.calcArea(x, y, r));
	}

	}

	public void calcPerimeter() {
		System.out.print("x좌표 : ");
		int x = sc.nextInt();

		System.out.print("y좌표 : ");
		int y = sc.nextInt();

		System.out.print("높이 : ");
		int h = sc.nextInt();

		System.out.print("너비 : ");
		int w = sc.nextInt();

		System.out.println(rc.calcPerimeter(x, y, h, w));

	}

	public void calcRectArea() {
		
		System.out.print("x좌표 : ");	
		int x = sc.nextInt();
		
		System.out.print("y좌표 : ");	
		int y = sc.nextInt();
		
		System.out.print("높이 : ");	
		int h = sc.nextInt();
		
		System.out.print("너비 : ");	
		int w = sc.nextInt();
		
		System.out.println(rc.calcRectArea(x, y, h, w));

	}
