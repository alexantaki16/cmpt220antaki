/**
 * file: Question6_3.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 21, 2017
 * version: 1
 *
 * This file will take input and run through two custom methods that will
 reverse the input and tell you if the number is a palindrome or not.
 */
import java.util.Scanner;
public class Question6_3{
  public static void main(String[] args){

    //Inport Scanner
    Scanner input = new Scanner(System.in);

    //Prompt the user to enter an integer
    System.out.println("Please enter an integer.");

    //Store the user input
    int number = input.nextInt();

    //Use an if to check if the number entered is a palindrome
    if(isPalindrome(number)){
      System.out.println("The integer you have entered is a palindrome!");
    }else{
      System.out.println("The integer you have entered is not a palindrome.");
    }
  }

  /**
   * Reverse
   *
   * This function take the input and reverses it to check if the
   * number is a palindrome.
   * Parameters:
   *   number: the number entered by the user
   *
   * Return value: The reversed input.
   */
  public static int reverse(int number){

    //Initialize backwards
    int backwords = 0;

    //Reverses the input
    while(number != 0){
      backwords = (backwords * 10) + (number % 10);
      number = number / 10;
    }
    //Returns backwards input
    return backwords;
  }

  /**
   * isPalindrome
   *
   * This function will test the reversed number to see if the number is
   * indeed a palindrome
   * Parameters:
   *   number: the reversed number
   *
   * Return value: True or false for the if statement in the main method.
   */
  public static boolean isPalindrome(int number){

    //Run the backwords int through the reverse method
    int backwords = reverse(number);

    //Use an if to check if the number is equal to the reversed input then
    //return it to the main method
    if(number == backwords){
      return true;
    }else{
    return false;
    }
  }
}
