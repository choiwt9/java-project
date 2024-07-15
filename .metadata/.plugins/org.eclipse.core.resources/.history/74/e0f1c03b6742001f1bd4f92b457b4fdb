package com.kh.practice.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) {

		int port = 8090;
		// 8090 포트를 이용해 요청받을 준비

		try (DatagramSocket ds = new DatagramSocket(port)) {
			byte[] data = new byte[1024];
			DatagramPacket dp = new DatagramPacket(data, data.length);

			while (true) {
				System.out.println("요청 대기중");
				ds.receive(dp);

				System.out.println(dp.getAddress());

				String message = new String(dp.getData());
				System.out.println(message);

			}

		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
