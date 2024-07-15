package com.kh.practice;

//Thread 클래스 상속

public class Task1 extends Thread {
//이 thread 에서 실행시킬 작업을 run메소드에 재정의
	@Override
	public void run() {

		String hello = "Hello, World!";
		String name = Thread.currentThread().getName();
		System.out.println(name + ":" + hello);
	}

}
