package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import com.kh.practice.set.mdel.vo.Lottery;
import com.kh.practice.set.model.compare.SortedLottery;

public class LotteryController {
	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();

	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}

	public boolean deleteObject(Lottery l) {
		boolean result = lottery.remove(l);

		if (result && win != null) {
			return win.remove(l);
		}
		return false;
	}

	public HashSet winObject() {

		if (lottery.size() < 4) {
			return null;
		}
		ArrayList<Lottery> lotteryList = new ArrayList<>(lottery);
		while (win.size() < 4) {
			int random = (int) (Math.random() * lottery.size());
			win.add(lotteryList.get(random));
		}
		return win;
	}

	public TreeSet sortedWinObject() {
		TreeSet<Lottery> sortedWin = new TreeSet<>(new SortedLottery());
		sortedWin.addAll(win);

		return sortedWin;
	}

	public boolean searchWinner(Lottery l) {

		return win.contains(l);

	}
}
