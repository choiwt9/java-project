package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen {

	private static final boolean PEN_BUTTON = false;

	public GalaxyNote9() {

		setMaker("삼성");
	}

	public String charge() {
		return "고속 충전";
	}

	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}

	public String takeCall() {
		return "수신 버튼을 누름";
	}

	public String touch() {
		return "정전식 와콤펜 지원";
	}

	public String picture() {
		// TODO Auto-generated method stub
		return "1200만 듀얼 카메라";
	}

	public boolean bluetoothPen() {
		return PEN_BUTTON;
	}

	public String printInformation() {
		return "갤럭시 노트 9은" + getMaker() + "에서 만들어졌고 제원은 다음과 같다" + makeCall() + "\n" + takeCall() + "\n" + picture()
				+ "\n" + charge() + "\n" + touch() + "\n" + "블루투스 펜 탑재 여부" + bluetoothPen();
	}

}
