package com.kh.practice.set.model.compare;

import java.util.Comparator;

import com.kh.practice.set.mdel.vo.Lottery;

public class SortedLottery implements Comparator<Lottery> {

	@Override
	public int compare(Lottery o1, Lottery o2) {

		int num = o1.getName().compareTo(o2.getName());
		if (num == 0) {
			o1.getPhone().compareTo(o2.getPhone());

		}
		return 0;
	}

}
