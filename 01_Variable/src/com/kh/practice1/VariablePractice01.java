package com.kh.practice1;

//Scanner 클래스 import : 외부 경로의 클래스 사용 시 선언
import java.util.Scanner;

public class VariablePractice01 {
	//이름, 성별, 나이, 키를 사용자에게 입력받아 각각의 값을 변수에 담고 출력
	public static void main(String[] args) {
		//Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//"이름을 입력하세요 : " 값을 출력
		//줄바꿈 처리하지 않기 위해 print 메소드 사용
		
		System.out.print("이름을 입력하세요 : ");
		//Scanner 객체를 사용하여 문자열을 입력받고,
		// 문자열 타입의 name 이라는 변수에 저장
		
		String name = sc.nextLine();
		//"이름은 최원탁입니다." 출력 
		
		System.out.println("이름은 " + name + "입니다.");
		
		System.out.print("성별을 입력하세요(남/여) : ");
		
		String gender = sc.next();
		
		System.out.println("성별은 " + gender + "입니다.");
		
		System.out.print("나이를 입력하세요: ");
		
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm): ");
		
		double height= sc.nextDouble();
		
		System.out.printf("키는 %.1f cm이고 %d세이며 %s성인 %s님 반갑습니다 \n",height ,age, gender ,name);
		System.out.println("@@@@@@@@");
	}

}
