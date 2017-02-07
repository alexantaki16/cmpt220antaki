/**
 * file: Question3_15.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 8, 2017
 * version: 1
 *
 * This file takes a random number as a lottery number and tests if the user
 input is equal to it.
 */
 import java.util.Scanner;
 public class Question3_15 {
   public static void main(String[] args) {

      //Generates a random number from 1 to 100 for the lottery number.
      int lottery = (int)(Math.random() * 1000);

      //Use the imported Scanner
      Scanner input = new Scanner(System.in);

      //Prompt the user to enter three digits for the lottery
      System.out.println("Enter your lottery pick (three digits): ");

      //Get the actual input
      int guess = input.nextInt();

      //These next two steps take the lottery generated from the computer
      //and stores them.
      int lotteryDigit1 = lottery / 100;
      int lotteryDigit2 = (lottery / 10) % 10;
      int lotteryDigit3 = lottery % 10;

      //These  next two steps take the user's guess and stores them.
      int guessDigit1 = guess / 100;
      int guessDigit2 = (guess / 10) % 10;
      int guessDigit3 = guess % 10;

      //Will be used to test if the numbers are the exact same later.
      int lotTotal = lotteryDigit1 + lotteryDigit2 + lotteryDigit3;
      int guessTotal = guessDigit1 + guessDigit2 + guessDigit3;

      //Initial results to be used later in the switch statement
      int results = 0;

      //Here we tell the user what the lottery number generated actually was.
      System.out.println("The lottery number is " + lottery);

      //This if will be used to test which digits match.
      if(guess == lottery){
        results = 1;
      }else if((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
        guessDigit1 == guessDigit3) && (guessDigit2 == lotteryDigit1 ||
        guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3) &&
        (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2
        || guessDigit3 == lotteryDigit3) && (lotTotal == guessTotal)){
        results = 2;
      }else if(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
        guessDigit1 == lotteryDigit3 || guessDigit2 == lotteryDigit1 ||
        guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3 ||
        guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 ||
        guessDigit3 == lotteryDigit3){
        results = 3;
      }else{
        results = 4;
      }

      //This switch will display your results.
      switch(results){
        case 1: System.out.println("Exact match: you win $10,000!");
                break;
        case 2: System.out.println("Match all digits you win $3,000!");
                break;
        case 3: System.out.println("Match one digit: you win $1,000.");
                break;
        case 4: System.out.println("Sorry, no match.");
      }
   }
 }
