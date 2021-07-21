package com.me.enum_test_days;

public class Days {

	enum WeekDays{
		MONDAY(1,"Manic Monday"),
		TUESDAY(2,"Panic Tuesday"),
		WEDNESDAY(3,"Manic Wednesday"),
		THURSDAY(4,"Panic Thursday"),
		FRIDAY(5,"Manic Friday"),
		SATURDAY(6,"Panic Saturday"),
		SUNDAY(9,"Manic Sunday");
		
		public final int dayNum;		//elements to add to enum
		public final String label;

		WeekDays(int dayNum, String label){	//attaching elements to enum
			this.dayNum = dayNum;
			this.label = label;
		}
		
	}
	//------------------end of enum----------------------------------------------
	
	//method loop
	public static void loop() {
		for(WeekDays myVar : WeekDays.values()) {
			System.out.println(myVar.dayNum+ " " + myVar.label);
		}
	}
	
	//method search
	public static WeekDays valueOfDayNum(String label) {
		for (WeekDays d : WeekDays.values()) {
			if(d.label.equals(label)) {
//				return d;
				System.out.println(d);
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		
		WeekDays myVar = WeekDays.MONDAY;
		System.out.println(myVar.dayNum + " " + myVar.label); // test to print enum
		
		loop();
		valueOfDayNum("Panic Tuesday");
	}
	
}
