/**
 * file: Question5_7.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 21, 2017
 * version: 1
 *
 * This file will calculate the change in tuition over 10 years and the net
 price after 4 years.
 */
public class Question5_7{
  public static void main(String[] args){

    //Initialize all variables to 0
    double year = 0;
    double tuition = 10000;
    double newTution = 0;

    //Check the tuition after 10 years
    for(year = 0; year < 10; year++){
      tuition = tuition + (tuition * 0.05);
    }

    //Display results
    System.out.format("The tuition after 10 years is: %.2f\n", tuition);

    //Check the tuition for four years of attendance
    for(year = 0; year < 4; year++){
      tuition = tuition + (tuition * 0.05);
      newTution += tuition;
    }

    //Display results
    System.out.format("The tuition for 4 years is: %.2f", newTution);
  }
 }
