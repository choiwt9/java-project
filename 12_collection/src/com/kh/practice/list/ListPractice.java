package com.kh.practice.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListPractice {
	/*
	 * List 특징 중복 가는 순서있음 ArrayList -배열구조 -데이터 조회가 빠르다. -데이터 추가와 삭제가 느리다.
	 * 
	 * ArrayList<E>참조변수 이름 = new ArrayList<[E]>(); // [E] : E 타입 생략가능!
	 *
	 * List<E> 참조변수명 =new ArrayList<[E]>();
	 * 
	 * LinkedList -리스트 구조 -데이터 추가와 삭제가 빠르다. -데이터 조회가 느리다.
	 * 
	 * LinkedList<E> 참조변수명 = LinkedList<[E]>(); List<E> 참조변수명 =new
	 * LinkedList<[E]>();
	 * 
	 * *List 관련 메소드 -size():저장된 데이터 크기 -add(데이터) : 데이터 추가 -remove(인덱스): 데이터 삭제
	 * -get(인덱스):데이터 조회
	 */

	public static void main(String[] args) {
		// arrayListTest();
		// linkedListTest();
		// stackTest();
		QueueTest();
	}

	public static void QueueTest() {
		MyQueue myqueue = new MyQueue();

		myqueue.enQueue("민트 ");
		myqueue.enQueue("초코");
		myqueue.enQueue("딸기");
		myqueue.enQueue("바나나");

		System.out.println(myqueue.deQueue());
		System.out.println(myqueue.deQueue());
		System.out.println(myqueue.deQueue());
		System.out.println(myqueue.deQueue());
		System.out.println(myqueue.deQueue());

	}

	public static void stackTest() {
		/*
		 * 스택:제일 마지막에 저장된 데이터가 제일 처음으로 꺼내올 수 있음
		 * 
		 */
		MyStack stack = new MyStack();

		stack.push("레몬");
		stack.push("아보카도");
		stack.push("파인애플");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

	public static void linkedListTest() {
		LinkedList<Integer> list = new LinkedList<>();

		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력");
		int length = sc.nextInt();
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * length + 1);
			list.add(random);
		}
		printItem(list);
	}

	public static void arrayListTest() {
		// 문자열 데이터관리하는 ArrayList객체

		ArrayList<String> list = new ArrayList<>();

		// 데이터 추가 //배열에서 데이터를 추가
		list.add("아구찜"); // arr[0] = "아구찜"
		list.add("찜닭");
		list.add("갈비찜");
		// 데이터 조회:get
		printItem(list);
		System.out.println("=============");
		list.add(1, "돈가스");
		printItem(list);
		System.out.println("=============");

		list.remove(1);
		printItem(list);
		System.out.println("=============");
		list.set(1, "돈가스");
		printItem(list);
		Collections.swap(list, 0, 2);
		System.out.println("=============");
		printItem(list);
	}

	public static <E> void swapList(List<E> list, int n1, int n2) {
		// n1,n2위치 변경
		// n1위치의 데이터를 변수에 저장

		E temp = list.get(n1);

		// 2)n2위치 데이터를 n1위치에 저장
		list.set(n1, list.get(n2));

		// 3)

		list.set(n2, temp);

	}

	public static void printItem(List list) {

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "번째: " + list.get(i));
		}

	}
}
