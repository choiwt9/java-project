package com.kh.practice;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO01_BufferedInputStream {

	public static void main(String[] args) {
		File f = new File("./resources", "src.txt");

		System.out.println(f.exists());

		FileInputStream fis = null;
		BufferedInputStream bis = null;

		byte[] buf = new byte[1024];
		int len = -1;
		try {
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);

			while ((len = bis.read(buf)) != -1) {
				System.out.println(new String(buf, 0, len));

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null)
					bis.close();
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
