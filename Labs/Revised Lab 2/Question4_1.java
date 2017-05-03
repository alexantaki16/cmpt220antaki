/**
 * file: Question4_1.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 8, 2017
 * version: 1
 *
 * This file calculates the area of a pentagon.
 */
import java.util.Scanner;
public class Question4_1 {
  public static void main(String[] args){

    //Use the imported Scanner
    Scanner input = new Scanner(System.in);

    //Prompt the user to enter the length of the radius
    System.out.println("Please enter the length from the center of the" +
        " pentagon to one vertex(Enter radius): ");

    //Initialize the radius to 0
    double radius = 0;

    //Make sure the user enters a positive value
    do {
      radius = input.nextDouble();
    } while (radius <= 0);

    //Calculate the length of a side
    double s = (2*radius*Math.sin(Math.PI/5));

    //Calculate the area of the pentagon with the user input
    double calcArea = (5*Math.pow(s, 2))/4*Math.tan(Math.PI/5);

    //Round the area to the 2 nearest decimal places
    double round = (double)Math.round(calcArea*100)/100;

    //Display the area
    System.out.print("The area is ");

    //Properly format the answer
    System.out.printf("%.2f", round);

    System.out.println();
  }
}
