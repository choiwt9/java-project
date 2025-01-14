package com.kh.ch05_object;

public class Object {

	public static void main(String[] args) {
		/*
		 ** 객체: 현실세계에 독립적으로 존재하는 것들 (목적, 의미, 가치가 있는 유형, 무형, 개념 등) 객체지향 프로그램 : 현실세계의 객체들간의
		 * 상호작용을 프로그래밍을 통해 가상세계에 구현하는 과정 => 프로그램 상에 필요한 객체들을 만들기 위해 "클래스라는 틀을 먼저 만들어야 함!
		 * *클래스 : 객체들의 속성들을 담고 있는 틀 -추상화 과정: 대상 객체에 대하여 정리하는 과정 [1] 프로그램에서 필요한 대상 객체 선정
		 * [2] 객체들이 가지고 있는 공통적인 속성, 기능들을 모두 추출 [3] 추출된 내용들을 가지고 구현할 프로그램의 "목적"에 맞게 필요한
		 * 속성 기능을 추려낼 것 [4] 최종적으로 추출된 속성들을 어떤 자료형 변수명으로 사용할 것인지 정리
		 * 
		 */

		/*
		 * 클래스 구조 public class 클래스명 { //필드부 --> 데이터를 저장할 변수들을 정의하는 부분 //생성자부 --> 객체 생성시
		 * 사용되는 특이한 메소드 //메소드부 --> 객체의 어떤 기능들을 정의하는 부분
		 */
		// 객체 생성
		// 클래스명 참조변수명 = new 클래스명();
		Student s1 = new Student();
		s1.name = "최원탁";
		System.out.println(s1);
		System.out.println(s1.name);

		Student s2 = new Student();
		s2.name = "키아누 리브스";
		// -------------------------------------------
		/*
		 * 객체지향원칙 : 외부에서 직접 접근 차단 *캡슐화 : 외뷰로부터의 직접 접근을 막고 간접적으로 처리하는 메소드를 클래스 내부에 작성하는 것
		 * [1]정보은닉 : private 제한자 사용 [2]getter/setter 메소드 : private으로 제한된 필드에 간접적으로 접근하게
		 * 해주는 메소드 getter:해당필드에 담긴 값을 반환 setter:해당필드에 값을 대입하고자 할 때 저장할 값을 전달받아 대입시켜주는
		 * 메소드
		 * 
		 */
		Animal animal1 = new Animal();
		animal1.setName("도치");
		animal1.setType("고슴도치");
		animal1.setGender('m');
		animal1.setMasterName("주원님");
		animal1.setAge(2);

		System.out.println(animal1);

		Animal animal2 = new Animal("초롱이", 5, 'm', "민욱님", "고양이");
		System.out.println(animal2);
	}

}
