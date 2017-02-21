/**
 * file: Question5_1.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 21, 2017
 * version: 1
 *
 * This file will take input from the user and will display the number of
 positives, negatives, the total, and average of the values.
 */

//Import Scanner
import java.util.Scanner;

public class Question5_1{
  public static void main(String[] args){

    //Use imported Scanner
    Scanner input = new Scanner(System.in);

    //Prompt the user to enter an integer
    System.out.println("Enter an integer, the input ends if it 0: ");

    //Initialize all variables to 0
    double num = 0;
    double total = 0;
    double numofPositive = 0;
    double numofNegative = 0;

    //Check the input and add up the inputs at the same time.
    do{
      num = input.nextDouble();
      total += num;
      if(num > 0){
        numofPositive++;
      }else if(num < 0){
        numofNegative++;
      }
    }while(num > 0 || num < 0);

    //Calculate the average and then display the results.
    double ave = total / (numofPositive + numofNegative);
    System.out.println("The number of positives is " + numofPositive);
    System.out.println("The number of negatives is " + numofNegative);
    System.out.println("The total is " + total);
    System.out.println("The average is " + ave);
  }
}
