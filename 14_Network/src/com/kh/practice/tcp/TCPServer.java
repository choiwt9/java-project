package com.kh.practice.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {

	public static void main(String[] args) {

		/*
		 * TCP : 서버와 클라이언트의 1:1 통신 : 데이터 교환 전 서버와 클라이언트가 연결되어야 함 (연결전에는 서버가 먼저 실행되어 있어야
		 * 한다.) :신뢰성 있는 데이터 전달 가능
		 * 
		 * -소켓 : 네트워크에서 통신할 때 통로 역할 Input,OutputStream 가지고 있다 ServerSocket :설정된 프로토
		 * 프로그램이 실행되어 외부의 연결 요청을 대기하다 요청이 들어오면 수락 (통신할 수 있는 소켓 생성)하는 용도
		 */

		Scanner sc = new Scanner(System.in);
		// 1) 포트번호 설정
		int port = 3000;
		ServerSocket server = null;
		BufferedReader stream = null;
		PrintWriter pw = null;

		// 2)서버용 소켓 객체
		try {
			server = new ServerSocket(port);
			// -----클라이언트 요청 대기-----
			System.out.println("-----요청 대기 중-----");

			// 3)연결 요청 수락 후 클라이언트와 통신 준비
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "로부터의 연결 요청.......");

			// 4) 클라이언트 입출력을 위한 스트림 생성
			// 입력용 스트림
			stream = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// +출력용 스트림 : 클라이언에트게 데이터를 출력하기 위한 용도
			pw = new PrintWriter(socket.getOutputStream());

			while (true) {
				String message = stream.readLine();
				System.out.println(socket.getInetAddress().getHostAddress() + ":" + message);
				System.out.print("답변");
				String sendMessage = sc.nextLine();

				pw.println(sendMessage);
				pw.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pw != null)
					pw.close();
				if (stream != null)
					server.close();
				if (server != null)
					server.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
