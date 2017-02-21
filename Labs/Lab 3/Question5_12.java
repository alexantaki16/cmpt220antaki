/**
 * file: Question5_12.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 21, 2017
 * version: 1
 *
 * This file will tell you the smallest number that can be squared and greater
 than 12000.
 */
public class Question5_12{
  public static void main(String[] args){

    //Finds the answer
    double n = (int) Math.ceil(Math.sqrt(12000));

    //Uses while loop display the answer.
    while(n < 12000){
      System.out.println("The lowest number that can be squared and greater " +
      "than 12000 is: " + n);
      break;
    }
  }
}
