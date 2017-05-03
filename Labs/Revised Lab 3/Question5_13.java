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

    //Initialize n
    int n = 0;

    //Use while loop to figure out the correct answer
    while(Math.pow(n,3) < 12000){
      n += 1;
    }
    n -= 1;

    //Display the results
    System.out.println("The largest 'n' that can be cubed and be smaller than "
        + "12000 is " + n);
  }
}
