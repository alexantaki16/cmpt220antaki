/**
 * /**
 * file: Question5.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 1
 * due date: January 31, 2017
 * version: 1
 *
 * This file takes four input values
 * and averages them out.
 */
import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {

    //Use imported scanner
    Scanner input = new Scanner(System.in);

		System.out.println("Please enter your grades for your midterm, final, " +
		"projects, and homework and labs: ");

    //Have user input all four grades.
		double midterm = input.nextDouble();
		double final1 = input.nextDouble();
		double projects = input.nextDouble();
		double hwandlab = input.nextDouble();

    //Averages all inputed values
		double average = (midterm + final1 + projects + hwandlab) / 4;

		System.out.println("Your average for the class is: " + average);
  }
}
