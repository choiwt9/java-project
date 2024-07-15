package com.kh.practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO00_IOStream {

	public static void main(String[] args) {

		InputStream is = System.in;
		OutputStream os = System.out;

		byte[] buf = new byte[1024];
		int len = 0;

		try {
			// EOF를 만날 때까지 키보드입력을 받겠다
			while ((len = is.read(buf)) != -1) {
				os.write(buf, 0, len);
				os.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();
				if (is != null)
					os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
