/*
 * Created by: Michael Balcerzak
 * Created on: 8-September-2016
 * Created for: ICS4U
 * Daily Assignment – #1-02
 * This program displays log companies that the user choose a company and shows the price of logs to fit in a 1100 kg truck. 
*/

import java.util.Scanner;

public class LoggingCompanySchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Create scanner object
        Scanner input = new Scanner(System.in);
		
		//Variables
		double firstLog = 0.25;
		double secondLog = 0.5;
		double thirdLog = 1;
		double logCompany = 55;
		double cost = 0;
		
		// Make the person enter
		System.out.println("Enter a length of the log that can be 1m, 0.5m, 0.25: ");
		double value = input.nextDouble();
		
		//prosses
		if (value == firstLog){
			cost = logCompany/firstLog;
		}
		
		else if (value == secondLog){
			cost = logCompany/secondLog;
		}
		
		else if (value == thirdLog){
			cost = logCompany/thirdLog;
		}
		else {
			System.out.println("Sorry. no there is no log that has " + value);
		}

		//output
		System.out.println("Cost: " + cost);
	}

}
