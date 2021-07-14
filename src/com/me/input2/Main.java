package com.me.input2;

import java.util.Scanner;

import CalculatorTask.DivideByZeroException;

public class Main {

	public static void main(String[] args) throws DivideByZeroException {

		Scanner keyboard = new Scanner(System.in);

		String answer;
//--------------------------------------------------------------------------------------------------		
		do {										//Do the following While return answer equals Yes

			Message.welcomeMsg();					//Pulls welcome message from Message class
			Calculations.calculation();				//Pulls calculation method from Calculation class

			System.out.println("Would you like to play another game? Yes or No.");
			answer = keyboard.next();
			
		} while (answer.equalsIgnoreCase("Yes"));	//Checks user input for "Yes"
				
		keyboard.close();							//If not Yes then close keyboard scanner (Resource Leak)
		Message.finishMsg();						//Pulls finish message from Message class

	}

}
