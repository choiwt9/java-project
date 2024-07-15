package com.kh.practice.list;

import java.util.ArrayList;

public class MyQueue {

	private ArrayList<String> queue = new ArrayList<>();

	public void enQueue(String data) {

		queue.add(data);

	}

	public String deQueue() {

		if (queue.isEmpty()) {
			return "자료 없음";

		} else {
			return queue.remove(0);

		}

	}
}
