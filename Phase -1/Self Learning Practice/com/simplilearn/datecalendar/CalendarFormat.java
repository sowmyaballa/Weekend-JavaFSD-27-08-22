package com.simplilearn.datecalendar;

import java.util.Calendar;

public class CalendarFormat {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("Curent Date = "+ cal.getTime());
		cal.add(Calendar.DATE, -15);
		System.out.println("15 Days ago = " + cal.getTime());

	}

}
