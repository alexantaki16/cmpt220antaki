/**
 * file: Question3_8.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 8, 2017
 * version: 1
 *
 * This file takes three random numbers and displays them
 in ascending order.
 */
 import java.util.Scanner;
 public class Question3_8 {
  public static void main(String[] args) {

    //Use imported Scanner
    Scanner input = new Scanner(System.in);

    //Prompt the user to enter three random integers.
    System.out.println("Enter three random integers: ");

    //Ask the user for any three numbers.
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    int number3 = input.nextInt();

    //This if statement determines which numbers are the smallest and places
    //them first.
    if(number1 < number2 && number2 < number3) {
      System.out.println(number1 + ", " + number2 + ", " + number3);
    } else if(number1 < number3 && number3 < number2){
      System.out.println(number1 + ", " + number3 + ", " + number2);
    } else if(number2 < number1 && number1 < number3){
      System.out.println(number2 + ", " + number1 + ", " + number3);
    }else if(number2 < number3 && number3 < number1){
      System.out.print(number2 + ", " + number3 + ", " + number1);
    } else if(number3 < number1 && number1 < number2){
      System.out.println(number3 + ", " + number1 + ", " + number2);
    } else {
      System.out.println(number3 + ", " + number2 + ", " +number1);
    }
  }
 }
