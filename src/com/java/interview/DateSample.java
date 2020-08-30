package com.java.interview;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateSample {

	public static void main(String[] args) throws ParseException {
		/*
		 * Date date = new Date(); System.out.println(date); Sun Jul 26 18:39:33 EDT
		 * 2020
		 */
		
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat(); String dateString =
		 * sdf.format(new Date()); System.out.println(dateString); 2020-07-26, 6:42 p.m.
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
		String dateString = sdf.format(new Date()); 
		Date date = sdf.parse("31-07-2001");
		System.out.println(dateString+" "+date);
		//increase the date
		//take calendarinstance
		Calendar cal= Calendar.getInstance();
		cal.setTime(sdf.parse("31-07-2001"));
		cal.add(Calendar.DAY_OF_MONTH, 2);
		
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(sdf.format(cal.getTimeInMillis()));
		
		LocalDate ld = LocalDate.now().plusDays(23);
		System.out.println(ld);
		System.out.println(ld.format(DateTimeFormatter.ISO_DATE_TIME));
		
		
	}
}
