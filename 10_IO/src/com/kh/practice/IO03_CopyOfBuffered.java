package com.kh.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO03_CopyOfBuffered {

	public static void main(String[] args) {
		File src = new File("./resources/src.txt");
		File dst = new File("./resources/dst.txt");

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		byte[] buf = new byte[1024];
		int len = -1;
		int total = 0;

		try {
			bis = new BufferedInputStream(new FileInputStream(src));

			bos = new BufferedOutputStream(new FileOutputStream(dst));
			while ((len = bis.read(buf)) != -1) {
				bos.write(buf, 0, len);
				bos.flush();

				total += len;
			}
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 알수없는 파일!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 입출력 작업 실패!");
			e.printStackTrace();
		} finally {
			try {
				if (bis != null)
					bis.close();
				if (bos != null)
					bos.close();
			} catch (IOException e) {

				System.out.println("반납 실패");
				e.printStackTrace();
			}
		}
		System.out.println("총길이" + total);

	}
}
