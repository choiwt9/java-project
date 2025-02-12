package com.kh.ch08_polymorphism;

public class PolyRun {
	/*
	 * *다형성 : 부모 타입으로 파생된 여러가지 타입의 자식 객체들을 부모타입 하나로 다룰 수 있는 기술 => 편리, 코드길이 감소
	 * 
	 * 클래스 참조변수 = new 클래스생성자 (부모타입 올 수 있다) (자식클래그인 경우 사용 가능 ) 실제로 어디까지 접근가능한가 실제로 어떤
	 * 형태로 메모리에 생성이 되었는가
	 * 
	 * "상속 구조의 클래스 간의 형변환" [1] 업캐스팅 -자식-> 부모 형변환 -자동 형변환 부모타입 참조변수=자식객체 [2]다운 캐스팅
	 * 부모타입-> 자식타입으로 형변환 -강제 형변환 ((자식클래스명)참조변수).자식메소드();
	 * 
	 * instanceof 연산자 현재 참조변수가 어떤 타입을 참조하는지 확인 =>연산결과 true/false
	 * 
	 * [표현법] 참조변수 instanceof 클래스타입
	 */
	// --------------------------------------------
	/*
	 * 동적 바인딩 -프로그램 실행 전에는 컴파일되면서 정적바인딩됨(참조변수타입의 메소드를 가리킴) -실제로 참조하는 자식클래스에 해당 메소드가
	 * 오버라이딩 되어있다면 프로그램 실행 시 동적으로 그 자식 클래스에 오버라이딩된 메소드를 찾아서 실행
	 */

	public static void main(String[] args) {

		Parent[] parent = new Parent[2];
		parent[0] = new Son();
		parent[1] = new Daughter();

		for (int i = 0; i < parent.length; i++) {
			if (parent[i] instanceof Son)
				((Son) parent[i]).printSon();
			if (parent[i] instanceof Daughter)
				((Daughter) parent[i]).printDaughter();

		}
		System.out.println("-------------------------------");
		for (int i = 0; i < parent.length; i++) {
			parent[i].print();

		}

	}

}
