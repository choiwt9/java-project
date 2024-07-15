package com.kh.practice;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO04_dataOutPutStream {

	public static void main(String[] args) {

		File f = new File("./resources", "DataSample.txt");

		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f)));

			dos.write(83);

			dos.writeBoolean(true);
			dos.writeChar('j');
			dos.writeDouble(3.14159256);
			dos.writeInt(369);

			dos.flush();
		} catch (FileNotFoundException e) {
			System.out.println("오타를 확인하시오");
		}

		catch (IOException e) {
			System.out.println("오류 발생, 관리자 호출");
		} finally {
			try {
				dos.close();
			} catch (IOException e) {
				System.out.println("자원반납 실패");
			}
		}
	}
}
