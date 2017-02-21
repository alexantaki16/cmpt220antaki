/**
 * file: Driver_lab3.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 21, 2017
 * version: 1
 *
 * This file will take input from the user and calcuate the distance. (Kattis
 problem).
 */

import java.util.Scanner;
public class Driver_lab3 {
  public static void main(String[] args){

    //Import Scanner
    Scanner input = new Scanner (System.in);

    //Use for loop to allow the program to run up to 1000 times
    for(int i = 0; i <= 1000; i++){

    //Have user input a value for x1
    double x1 = input.nextDouble();

    //Check to see if x1 is valid, otherwise stop the program
    if(x1 == 0 || x1 >= 101)
      break;

    //Have user input remaining values
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double p = input.nextDouble();

    //Calculate distance
    double distance = Math.pow(Math.pow(Math.abs(x1-x2),p) +
    Math.pow(Math.abs(y1-y2),p), 1/p);

    //Print distance on screen
    System.out.println(distance);
    }
  }
}
