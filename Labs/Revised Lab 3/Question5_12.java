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

    //Create int n
    int n = 0;

    //Use while loop to check if n is less than 12000.  If it's not then add 1.
    while(Math.pow(n,2) < 12000){
      n += 1;
    }

    //Display results
    System.out.println("The smallest 'n' that can be squared and be greater" +
        " than 12000 is " + n);
  }
}
