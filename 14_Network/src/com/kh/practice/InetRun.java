package com.kh.practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {
	/*
	 * 네트워크 : 여러대의 컴퓨터들이 연결되어 있는 통신망 =>네트워크를 통해 서로 데이터 주고 받을 수 있다
	 * 
	 * *IP 주소 : 네트워크상의 각 컴퓨터들을 식별해 주는 번호 *포트 : 컴퓨터 내의 프로그램 식별해주는 번호
	 * 
	 * *서버 : 클라이언트(고객)에게 서비스를 제공해주는 프로그램 ->요청받아 처리 후 응답 *클라이언트 : 서비스를 제공받는 고객 -> 서버에
	 * 요청을 하는 프로그램
	 */
	public static void main(String[] args) {
//네트워크 정보 확인 클래스 : java.net.InetAddress
		try {
			InetAddress iNet = InetAddress.getLocalHost();
			// 현재 pc에 대한 네트워크 정보를 확인할 수 있다.
			System.out.println(iNet);// pc 정보/ip주소 출력
			System.out.println(iNet.getHostName());
			System.out.println(iNet.getHostAddress());
			System.out.println(iNet.getAddress());
			System.out.println("----------------------");

			InetAddress iNet2 = InetAddress.getByName("www.naver.com");

			System.out.println(iNet2.getHostName());
			System.out.println(iNet2.getHostAddress());

			System.out.println("----------------------");

			InetAddress[] iNet3 = InetAddress.getAllByName("kh-academy.co.kr");
			System.out.println(iNet3.length);

			for (InetAddress n : iNet3) {
				System.out.println(n.getHostName());
				System.out.println(n.getHostAddress());
			}
			InetAddress[] iNet4 = InetAddress.getAllByName("www.youtube.com");
			System.out.println(iNet4.length);

			for (InetAddress n1 : iNet4) {
				System.out.println(n1.getHostName());
				System.out.println(n1.getHostAddress());
			}
		} catch (UnknownHostException e) {
			// TODO: handle exception
		}

	}

}
