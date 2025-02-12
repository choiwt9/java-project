package com.kh.ch12_io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StramUtils {

	/*
	 * 보조스트림 : 기반 스트림만으로는 부족한 성능을 향상시키는 스트림 기반스트림에서 제공되는 메소드 외에 추가적인 메소드 제공(데이터 전송
	 * 속도를 향상)
	 * 
	 * 출력 : 프로그램 --> 외부매체(파일)
	 * 
	 */

	public void objectSave(String filename, Object[] objs) {
//FileOutputStream : 파일에 연결하여 1바이트 단위로 출력할 수 있는 기반 스트림
//ObjectOutputStream : 객체단위로 출력하도록 보조
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			for (Object o : objs) {
				oos.writeObject(o); // 객체데이터를 출력하는 메소드
			}
		} catch (IOException e) {
			System.out.println("객체 데이터를 파일에 저장 중 문제 발생" + e.getMessage());
		}
	}

//입력 : 외부매체(파일)--> 프로그램
	public void objectRead(String filename) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			while (true) {
				System.out.println(ois.readObject());
			}
		} catch (EOFException e) {
			System.out.println("====파일 읽기 완료====");
		} catch (IOException e) {
			System.out.println("객체 데이터를 읽어오는 중 문제 발생" + e.getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}