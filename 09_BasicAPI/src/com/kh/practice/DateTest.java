package com.kh.practice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		Date date = new Date();

		System.out.println(date.getMonth() + 1 + "/" + date.getDate());

		LocalDateTime date2 = LocalDateTime.now();
		System.out.println(date2.getMonth());
		System.out.println(date2.getMonthValue() + "/" + date2.getDayOfMonth());
		LocalDateTime birth = LocalDateTime.of(LocalDate.of(1993, 10, 15), LocalTime.of(7, 15));
		System.out.println(birth);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));

		Date dateOfBirth = java.sql.Timestamp.valueOf(birth);
		System.out.println(sdf.format(dateOfBirth));

		System.out.println(birth.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));

		LocalDateTime today = LocalDateTime.now();
		System.out.println(366 - today.getDayOfYear());

		System.out.println(18 - today.getHour());

	}

}
