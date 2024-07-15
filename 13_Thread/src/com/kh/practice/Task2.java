package com.kh.practice;

//Runnable

public class Task2 implements Runnable {

	@Override
	public void run() {

		String name = Thread.currentThread().getName();
		System.out.println(name + ":" + "Hi Thread?");

	}

}
