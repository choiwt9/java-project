package com.kh.practice;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	String name;
	int age;
	double height;

	public Student(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;

	}

	public String toString() {
		return "Student [name= " + name + ", age=" + age + ", height=" + height + "]";
	}
}

public class IO06_DObjectOutputStream {

	public static void main(String[] args) {

		File f = new File("./resources", "ObjectTest.txt");
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));

			Student s1 = new Student("최원탁", 93, 170);
			Student s2 = new Student("홍길동", 50, 165);
			Student s3 = new Student("임꺽정", 60, 160);

			oos.writeObject(s1);
			oos.flush();

			oos.writeObject(s2);
			oos.writeObject(s3);
			oos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
