package com.kh.practice.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClient {

	public static void main(String[] args) {

		// 사용자에게 메시지 입력받기

		Scanner sc = new Scanner(System.in);
		System.out.print("전송 메시지 입력 : ");

		String message = sc.nextLine();

		try (DatagramSocket ds = new DatagramSocket()) {

			InetAddress iNet = InetAddress.getByName("192.168.10.27");
			int port = 8090;

			DatagramPacket dp = new DatagramPacket(message.getBytes(), message.getBytes().length, iNet, port);
			ds.send(dp);

		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}