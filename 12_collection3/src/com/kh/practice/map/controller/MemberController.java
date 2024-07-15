package com.kh.practice.map.controller;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	HashMap<String, Member> map = new HashMap<>();
	Member m = new Member();

	public boolean joinMembership(String id, Member m) {
		if (!map.containsKey(id)) {
			map.put(id, m);
			return true;

		} else {

			return true;
		}

	}

	public String login(String id, String pw) {

		Member m = map.get(id);

		if (m != null) {
			if (m.getPassword().equals(pw)) {
				return m.getName();

			}

		}
		return null;

	}

	public boolean changePassword(String id, String oldPw, String newPw) {
		Member m = map.get(id);

		if (m != null) {
			if (m != null) {
				if (m.getPassword().equals(oldPw)) {
					m.setPassword(newPw);
					return true;
				}
			}

		}
		return false;
	}

	public void changeName(String id, String newName) {

		if (map.containsKey(id)) {
			Member m = map.get(id);
			m.setName(newName);
		}
	}

	public TreeMap sameName(String name) {
		TreeMap tMap = new TreeMap(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {

				return s1.compareTo(s2);
			}
		});

		for (String k : map.keySet()) {
			Member m = map.get(k);
			if (m.getName().equals(name)) {
				tMap.put(k, name);
			}
		}
		return tMap;
	}

}