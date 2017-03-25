/**
   * file: Question7_20.java
   * author: Alex Antaki
   * course: CMPT 220
   * assignment: Lab 5
   * due date: March 27, 2017
   * version: 1
   *
   * This program will take in 10 numbers from the user and display them from
   * largest to smallest
   */
import java.util.Scanner;
import java.util.Arrays;
public class Question7_20{
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    //Prompt user to enter 10 numbers
    System.out.println("Please enter 10 numbers: ");

    //Create array
    double[] myArray = new double[10];

    //This loop stores all 10 numbers that the user gives
    for(int i = 0; i < myArray.length; i++){
      myArray[i] = input.nextDouble();
    }

    //Call sorting algorithm
    selection(myArray);

    //Displays properly sorted array
    System.out.println(Arrays.toString(myArray));
  }
  /**
   * selection
   *
   * This function takes 10 numbers from an array and sorts them from largest
   * to smallest
   *
   * Parameters:
   *   double[]: the array to be sorted
   *
   * Return value: None.  It is void.
   */
  public static void selection(double[] list){
    //Initialize variables
    double currentMin = 0;
    int currentMinIndex = 0;

    //This for loop will begin the rearranging of the array.  The beginning of
    //this loop will set the variables equal to the indexes.
    for(int i = 0; i < list.length - 1; i++){
      currentMin = list[i];
      currentMinIndex = i;
      //At this point in the loop, the actual rearranging occurs
      for(int j = i + 1; j < list.length; j++){
        if(currentMin < list[j]){
          currentMin = list[j];
          currentMinIndex = j;
        }
      }
      //This acts as a fail safe incase the loop is not enough to completely
      //rearrange the array
      if(currentMinIndex != i){
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
      }
    }
  }
}
