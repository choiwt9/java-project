package com.kh.ch12_io;

public class IORun {

	public static void main(String[] args) {

		/*
		 * *입출력(IO): 프로그램 상의 데이터를 외부매체로 출력하거나 외부매체로부처 입력 받아오는 과정 -->외부매체와의 연결 통로 역할 :
		 * 스트림
		 * 
		 * *스트림의 특징 -단방향 : 입력이면 입력만 / 출력이면 출력만 => 동시에 하고자 한다면 입력용/출력용 스트림을 각각 사용
		 * -선입선출(FIFO) : 통로를 파이프로 본다면 먼저 보낸 데이터가 먼저 나오게 됨 *스트림 종류 -크기 기준으로 구분한다면 (바이트
		 * 1byte/ 문자 2byte) + 바이트 스트림 :1byte 의 데이터가 다니는 통로 입력용 -> InputStream/ 출력용 ->
		 * OutputStream +문자 스트림 : 2byte 의 데이터가 다니는 통로 입력용 -> Reader/출력용 -> Writer
		 * 
		 * -외부매체와의 직접 연결 유무 +기반 스트림 : 외부매체와 직접적으로 연결되는 통로(필수) +보조 스트림 : 기반 스트림을 보조하는
		 * 통로(속도 향상, 다양한 기능 제공) =>단독 사용 불가! 반드시 기반 스트림과 같이 사용
		 * 
		 */

		StramUtils utils = new StramUtils();

		Product[] products = new Product[3];
		products[0] = new Product("큐센", 75000);
		products[1] = new Product("독거미", 70000);
		products[2] = new Product("삼성", 75000);

		String filename = "keyboard.txt";
		utils.objectSave(filename, products);
		utils.objectRead(filename);

	}
}
