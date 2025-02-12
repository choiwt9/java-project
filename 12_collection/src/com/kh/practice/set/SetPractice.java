package com.kh.practice.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetPractice {

	/*
	 * Set특징 -중복불가 -순서 없음
	 * 
	 * 해시(Hash) 알고리즘 : 특정 기준에 따라 분류 -HashSet *중복 데이터 판단: equals, hashCode메소드
	 * [1]hashCode: 기준 데이터 정의 [2]equals: hashCode값이 같을 경우 동일 데이터 판단 로직 정의
	 * 
	 * Set 메소드 -데이터 추가:add -데이터 삭제:remove 데이터 길이 조회:size() 데이터 조회 [1]Iterator(반복자)사용
	 * -Iterator 객체 생성 : set_참조변수.itretor() -데이터 유무 판단 :itretor_참조변수.hasNext() -데이터
	 * 조회:itretor_참조변수.next() [2]향상된 for문(for- each문) for(set에 저장된 데이터 타입(자료형) 변수명
	 * :Set_참조변수명){ 변수명을 사용하여 데이터 접근 }
	 */

	public static void main(String[] args) {
		/*
		 * object -equals() : 두 객체의 "주소값을 비교하여 일치하면 true. 불일치면 false 반환 -hashCode():
		 * 해당객체의 주소값을 가지고 10진수 만들어 반환
		 */

		HashSet hSet1 = new HashSet();

		hSet1.add("안녕하세요");
		hSet1.add(new String("안녕하세요"));
		hSet1.add(new String("여러분"));
		hSet1.add(new String("힘내요"));
		hSet1.add(new String("여러분"));

		System.out.println(hSet1);// 저장순서 미반영, 중복 제외
		/*
		 * String -equals(): 재정의 됨. "실제 담긴 문자열"을 가지고 동등비교 -hashCode():재정의 됨 10진수로 만들어 반환
		 */
		// =================================
		HashSet<Person> hSet2 = new HashSet<>();
		hSet2.add(new Person("최원탁", 32, 170));
		hSet2.add(new Person("양민욱", 31, 170));
		hSet2.add(new Person("안창원", 31, 181));
		hSet2.add(new Person("최원탁", 32, 170));
		System.out.println(hSet2);

		// ======================================

		for (Person p : hSet2) {
			System.out.println(p);
		}
		System.out.println("================");
		Iterator it = hSet2.iterator();

		while (it.hasNext()) {
			Person p = (Person) it.next();
			System.out.println(p);
		}
	}

}
