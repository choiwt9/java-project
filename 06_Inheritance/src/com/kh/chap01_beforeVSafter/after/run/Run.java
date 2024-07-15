package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		Desktop d = new Desktop("삼성", "갤럭시", "삼성데스크탑", 200, true);
		Desktop d1 = new Desktop("삼성", "갤럭시", "삼성데스크탑", 200, true);
		System.out.println(d.information());
		System.out.println(d1.information());
		Tv tv = new Tv("삼성", "갤럭시", "삼성tv", 200, 45);
		System.out.println(tv.information());
		SmartPhone sm = new SmartPhone();
		System.out.println(tv.information());
	}

}
