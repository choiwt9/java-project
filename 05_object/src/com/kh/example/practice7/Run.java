package com.kh.example.practice7;

public class Run {

	public static void main(String[] args) {
		Employee e1 = new Employee();

		e1.setEmpName("최원탁");
		System.out.println(e1.getEmpNo() + "|" + e1.getEmpName());

		Employee e2 = new Employee(200, "홍길동");
		e1.setEmpNo(100);
		e2.setDept("영업부");
		System.out.println(e2.getEmpNo() + "|" + e2.getEmpName() + "|" + e2.getDept());

		Employee e3 = new Employee(300, "임꺽정");
		System.out.println(e3.getEmpNo() + "|" + e3.getEmpName());
	}

}
