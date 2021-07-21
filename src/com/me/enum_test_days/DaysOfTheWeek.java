package com.me.enum_test_days;

//Create a enum for the days of the week
//
//Each enum constant should have a corresponding numeric day field such as MONDAY(1)
//
//Each enum should have a description such as MONDAY(1, "Manic Mondays")

public enum DaysOfTheWeek {

	MONDAY(1, "Manic Monday"),
	TUESDAY(2,"Manic Tuesday"),
	WEDNESDAY(3,"Manic Wednesday"),
	THURSDAY(4,"Manic Thursday"),
	FRIDAY(5,"Manic Friday"),
	SATURDAY(6,"Manic Saturday"),
	SUNDAY(7,"Manic Sunday");
	
	private final int day;
	private final String desc;
	
	
	DaysOfTheWeek(int day, String desc){
		this.day = day;
		this.desc = desc;
	}

	
}
