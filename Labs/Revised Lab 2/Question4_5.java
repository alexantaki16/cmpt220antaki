/**
 * file: Question4_5.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 8, 2017
 * version: 1
 *
 * This file calculates the area of a regular polygon.
 */
import java.util.Scanner;
public class Question4_5{
  public static void main(String[] args){

    //Use imported Scanner
    Scanner input = new Scanner(System.in);

    //Tell the user to input the number of sides
    System.out.println("Enter the number of sides.");

    //Where the user inputs the number
    double numOfSides = input.nextDouble();

    //Tell the user to input the length of the sides
    System.out.println("Enter the length of each side.");

    //Have the user input the length
    double length = input.nextDouble();

    //Calculate the area
    double calcArea = (numOfSides*Math.pow(length, 2))/4*Math.tan(Math.PI/numOfSides);

    //Display the results
    System.out.println("The area of the polygon is " + calcArea);
  }
}
