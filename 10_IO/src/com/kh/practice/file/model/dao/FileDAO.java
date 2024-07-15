package com.kh.practice.file.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

	String path = "./resources/files";

	public FileDAO() {
		// 저장된 경로가 없을 경우 폴더 생성
		File f = new File(path);
		if (!f.exists()) {
			if (!f.mkdirs()) {
				System.out.println("실패" + path);
			}
		}
	}

	public boolean checkName(String file) {
		File f = new File(path, file);
		return f.exists();
	}

	public void fileSave(String file, String s) {
		File f = new File(path, file);

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {

			bw.write(s.toString());
			bw.newLine();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileSave1(String file, String s) {
		File f = new File(path, file);
		BufferedOutputStream bos = null;

		try {
			bos = new BufferedOutputStream(new FileOutputStream(f));
			bos.write(s.getBytes());
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
				e.printStackTrace();
			}
		}
	}

	public StringBuilder fileOpen(String file) {
		File f = new File(path, file);

		StringBuilder sb = new StringBuilder();
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f))) {
			byte[] data = new byte[1024];
			int len = -1;

			while ((len = bis.read(data)) != -1) {
				sb.append(new String(data, 0, len));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb;

	}

	public void fileEdit(String file, String s) {
		try (FileWriter fw = new FileWriter(new File(path, file), true)) {
			fw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
