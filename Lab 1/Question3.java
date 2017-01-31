/**
 * /**
 * file: Question3.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 1
 * due date: January 31, 2017
 * version: 1
 *
 * This file will take input for the
 * subtotal and gratuity and display
 * the new total wiht the gratuity
 * included.
 */
import java.util.Scanner;
public class Question3 {
  public static void main (String[] args) {
    //Use imported Scanner
    Scanner input = new Scanner(System.in);

    //Declare all variables globally to be used in loops.
    double subtotal;
    double gratRate;
    double gratuity;

    System.out.println("Please enter the subtotal: ");

    //Prompt user to enter the Subtotal.  Make sure it makes sense.
    //Do not allow the user to enter an invalid number.
    do {
      subtotal = input.nextDouble();
    } while (subtotal <= 0);

    System.out.println("Please enter a gratuity rate: ");

    //Prompt user to enter a Gratuity rate
    do {
      gratRate = input.nextDouble();
    } while (gratRate <= 0);


    //Changes the gratuity to the dollar amount
    gratuity = (gratRate / 100) * subtotal;

    //Creates a variables for the new total
    double newTotal = subtotal + gratuity;

    //Display results
    System.out.println("The gratuity is $" + gratuity + " and the total is $"
    + newTotal);
    }
}
