package com.me.conditionals;

public class Runner3 {

public static int Physics = 25;			//max points 150
public static int Chemistry = 150;		//max points 150
public static int Biology = 150; 		//max points 150
public static int Total = Physics + Chemistry + Biology;
public static double Percentage = (Total * 100) / 450; 

public static double PercentagePhysics = (Physics * 100) / 150; 
public static double PercentageChemistry = (Chemistry * 100) / 150; 
public static double PercentageBiology = (Biology * 100) / 150; 

public static void main(String[] args) {
	
	method1();

//	Expand the Results class so that there is now a pass mark of 60%; if the person receives under 60% they get a fail message.
//	Expand the previous example so that even if the person gets higher than 60% overall, if they fail 1 or more of the exams (pass grade of 60% for each exam) they still fail overall.
}

public static void method1() {
	System.out.println("Physics Score: "+ Physics);
	System.out.println("Physics Percentage is: "+ PercentagePhysics+"%");
	System.out.println("Chemistry Score: "+ Chemistry);
	System.out.println("Physics Chemistry is: "+ PercentageChemistry+"%");
	System.out.println("Biology Score: "+ Biology);
	System.out.println("Biology Percentage is: "+ PercentageBiology+"%");
	System.out.println("Total Score: "+ Total);
	System.out.println("Total Overall Percentage is: "+ Percentage+"%");
//	if (Percentage<60) {
//		System.out.println("You have failed!");
//	}else {
//		System.out.println("You have passed!");
//	}
	if (PercentagePhysics < 60 || PercentageChemistry < 60 || PercentageBiology < 60 ) {
		System.out.println("You have failed overall!");
	}else {
		System.out.println("You have passed overall!");
	}
}



}

