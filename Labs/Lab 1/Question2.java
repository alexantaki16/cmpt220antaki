/**
 * /**
 * file: Question2.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 1
 * due date: January 31, 2017
 * version: 1
 *
 * This file converts Celsius input
 * into Fahrenheit
 */
import java.util.Scanner;

public class Question2 {
  public static void main (String[] args) {

    //Use Scanner import
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a temperature in Celsius.");

    //Obtain Celsius from user
    double celsius = input.nextDouble();

    //Formula to convert Celsius to Fahrenheit
    double fahrenheit = (celsius * 9) / 5 + 32;

    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
  }
}
