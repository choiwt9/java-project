package com.kh.practice;

public class ThreadRun {
	/*
	 * 
	 * Thread : 프로세스 내에서 가지고 있는 최소 작업 단위
	 * 
	 */

	// main 메소드 실행시

	public static void main(String[] args) {
		// Task1
		Task1 t1 = new Task1();

		Task2 task = new Task2();
		Thread t2 = new Thread(task);

		t1.start();
		t2.start();

		System.out.println("====" + Thread.currentThread().getName() + "====");

	}

}
