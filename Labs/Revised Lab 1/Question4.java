/**
 * /**
 * file: Question4.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 1
 * due date: January 31, 2017
 * version: 1
 *
 * This file take an integer between 0 and 1000.
 * It will take the digits themselves and add them
 * together.
 */
import java.util.Scanner;
public class Question4 {
  public static void main (String[] args) {

    //Import scanner
    Scanner input = new Scanner(System.in);

    //Prompt user to enter an int
    System.out.println("Enter any integer between 0 and 1000.");

    //Have the user input a number
    int userInt = input.nextInt();

    //Takes each digit and stores it
    int userInt1 = userInt / 100;
    int userInt2 = userInt / 10 % 10;
		int userInt3 = userInt % 10;

    //Add all of the digits together.
		int totalInt = userInt1 + userInt2 + userInt3;
	  System.out.println("The sum of the digit is: " + totalInt);
  }
}
