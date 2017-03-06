/**
 * file: Question5_13.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 21, 2017
 * version: 1
 *
 * This file will tell you the greatest integer that can be cubes and be
  less than 12000.
 */
 public class Question5_13 {
   public static void main(String[] args){

    //Finds the answer
    double n = Math.floor(Math.cbrt(12000));

    //Runs through while loop to display the answer
    while(n < 12000){
      System.out.println("The highest number that can be squared and greater " +
          "less than 12000 is: " + n);
      break;
    }
  }
 }
