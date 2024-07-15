package com.kh.practice;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO02_BufferedOutPutStream {

	public static void main(String[] args) {

		File f = new File("./resources", "OutPutTest.txt");

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {

			fos = new FileOutputStream(f);
			bos = new BufferedOutputStream(fos);

			String contents = "IO는 어려워";
			bos.write(contents.getBytes());
			bos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null)
					bos.close();
			} catch (IOException e) {
				// TODO: handle exception
			}

		}
	}

}
