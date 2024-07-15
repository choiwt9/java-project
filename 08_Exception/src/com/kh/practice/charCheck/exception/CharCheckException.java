package com.kh.practice.charCheck.exception;

//예외클래스: 특정조건에서 예외(오류) 발샹시킬때 사용할 목적
public class CharCheckException extends Exception {

	public CharCheckException() {
	}

	public CharCheckException(String msg) {
		super(msg);

	}

}
