/**
 * file: Problem6_20.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 28, 2017
 * version: 1
 *
 * This file will take in a string and tell you how long the string is.
 */
import java.util.Scanner;
public class Problem6_20{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    //Prompt the user and store the answer
    System.out.println("Please enter a string: ");
    String userString = input.nextLine();

    //Print results
    System.out.println("The amount of letters in your string: " + countLetters(userString));
  }
  /**
      * countLetters
      *
      * This function takes the input and calculates how long the string is
      *   String: The value of the inputed string
      *
      * Return value: The length of the string.
      */
  public static int countLetters(String s){

    //Initialize counter
    int counter = 0;
    for(int i = 0; i < s.length(); i++){
      counter++;
    }
    return counter;
  }
}
