package com.kh.practice.test2;

public class Task1 extends Thread {

	@Override
	public void run() {

		try {
			for (int i = 0; i <= 30; i++) {
				if (i % 2 == 0) {
					System.out.println(Thread.currentThread().getName() + i);

				}
				Thread.sleep(100);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
