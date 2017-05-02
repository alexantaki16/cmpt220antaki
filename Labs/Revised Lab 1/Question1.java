/**
 * file: Question1.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 1
 * due date: January 31, 2017
 * version: 1
 *
 * This file displays "Java" on the screen.
 */
import java.util.Scanner;
public class Question1{
  public static void main(String[] args) {

    //Create a random lottery number
    int lottery = (int)(Math.random() * 100);

    //Import Scanner
    Scanner input = new Scanner(System.in);

    //Prompt user for their guess and store it
    System.out.println("Enter your lottery pick (three digits):. ");
    int guess = input.nextInt();

    //Take the lottery digits and store them
    int lotteryDigit1 = lottery / 10;
    int lotteryDigit2 = lottery % 10;

    //Take the user's guess and store the values
    int guessDigit1 = guess / 10;
    int guessDigit2 = guess % 10;

    System.out.println("The lottery number is " + lottery);

    //Use if to see how much money you may win
    if(guess == lottery)
      System.out.println("Exact match: you win $10,000.");
    else if(guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
      System.out.println("Match all digits: you win $3,000.");
    else if(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
        guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit1)
      System.out.println("Match one digit: you win $1,000.");
    else
      System.out.println("Sorry, no match.");
  }
}
