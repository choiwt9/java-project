package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {

	private String[] result = new String[2];

	public String[] Method() {
		Phone[] phoneList = new Phone[2];

		phoneList[0] = new GalaxyNote9();
		phoneList[1] = new V40();
		int index = 0;
		for (int i = 1; i < phoneList.length; i++) {

			if (phoneList[i] instanceof GalaxyNote9) {
				result[index++] = ((GalaxyNote9) phoneList[i]).printInformation();
			} else if (phoneList[i] instanceof V40) {
				result[index++] = ((V40) phoneList[i]).printInformation();
			}
		}

		return result;
	}

}
