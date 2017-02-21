/**
 * file: Question6_2.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 21, 2017
 * version: 1
 *
 * This file will take input and pass it through another method and return the
 the sum of the digits.
 */

//Import Scanner class
import java.util.Scanner;
public class Question6_2{
  public static void main(String[] args){

    //Import Scanner
    Scanner input = new Scanner(System.in);

    //Prompt the user to enter an integer
    System.out.println("Please enter an integer: ");

    //Create a long and have the user input a value
    long userInput = input.nextLong();

    //Create an int ans assign it the returned values from the sumDigits method
    int sum = sumDigits(userInput);

    //Display answer
    System.out.println("The sum of the digits is: " + sum);
  }

  /**
   * sumDigit
   *
   * This function take the input and adds the digits together.
   *
   * Parameters:
   *   long: the user inputs a long and it is run through the method.
   *
   * Return value: The sum.
   */
  public static int sumDigits(long n){

    //Initialize the variables to 0
    int i = 0;
    int sum = 0;

    //Check input in a while loop
    while(n > 0){
      sum = sum + (int)(n % 10);
      n = n / 10;
    }
    //Return the answer back to the main method
    return sum;
  }
 }
