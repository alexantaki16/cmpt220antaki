/**
 * file: Question4_26.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 8, 2017
 * version: 1
 *
 * This file will take calculate the change of any double input.
 */
import java.util.Scanner;
public class Question4_26{
  public static void main(String[] args){

    //Use the imported scanner
    Scanner input = new Scanner(System.in);

    //Prompt the user to enter an amount
    System.out.print("Enter an amount in double, for example 11.56: ");

    //Store the double
    double amount = input.nextDouble();

    //Rounds the remainingAmount
    int remainingAmount = (int)Math.rint((amount*100));

    //Determines how many dollars you can evenly divide into
    int numberOfOneDollars = remainingAmount / 100;
    remainingAmount = remainingAmount % 100;

    //Determines how many quarters you can evenly divide
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;

    //Determines how many dimes can be evenly divided
    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    //Determines how many nickels can be evenly divided
    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    //Takes the remaining amount that can not be evenly divided and assigns
    //them as pennies
    int numberOfPennies = remainingAmount;

    //Displays your results
    System.out.println("Your amount " + amount + " consists of");
    System.out.println("     " + numberOfOneDollars + " dollars");
    System.out.println("     " + numberOfQuarters + " quarters ");
    System.out.println("     " + numberOfDimes + " dimes");
    System.out.println("     " + numberOfNickels + " nickels");
    System.out.println("     " + numberOfPennies + " pennies");
  }
}
