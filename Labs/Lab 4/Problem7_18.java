/**
 * file: Problem7_18.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 28, 2017
 * version: 1
 *
 * This file will take 10 numbers and sort them from smallest to largest.
 */
import java.util.Scanner;
public class Problem7_18{
  public static void main(String[] args){

    //Use imported Scanner
    Scanner input = new Scanner(System.in);

    //Prompt user to enter 10 numbers and store them in an array called userInput
    System.out.println("Please enter 10 numbers: ");
    int[] userInput = new int[10];

    //Assign each input to a specific index in the array
    for(int i = 0; i < 10; i++){
      userInput[i] = input.nextInt();
    }

    //Call and sort the user import
    bubble(userInput);

    //Call and display sorted input
    displayAns(userInput);
  }

  /**
      * bubble
      *
      * This function takes the input and sorts them from smallest to largest
      *
      *
      * Return value: The sorted array.
      */
  public static int[] bubble(int [] myArray){

    //Takes the input and checks it needs to be switched or not
    for(int i = 0; i < myArray.length - 1; i++){
      for(int j = 0; j < myArray.length - 1 - i; j++){
        if(myArray[j] > myArray[j+1]){
          int temp = myArray[j + 1];
          myArray[j+1] = myArray[j];
          myArray[j] = temp;
        }
      }
    }
    return myArray;
  }
  /**
      * displayAns
      *
      * This function takes the sorted array and simply displays it
      *
      *
      * Return value: This method is of type void so it does not need any
      * return value.
      */
  public static void displayAns(int[] myArray){

    //Prints the already sorted numbers by index
    for(int i = 0; i <myArray.length; i++){
      System.out.println(myArray[i] + " ");
    }
  }
}
