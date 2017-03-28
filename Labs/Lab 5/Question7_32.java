/**
   * file: Question7_32.java
   * author: Alex Antaki
   * course: CMPT 220
   * assignment: Lab 5
   * due date: March 27, 2017
   * version: 1
   *
   * Will take in an array and partition the list.
   */
import java.util.Scanner;
import java.util.Arrays;

public class Question7_32{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //Prompt user to enter how many values they want in the array and store it
    System.out.println("Please enter how many values you want in the array: ");
    int arraySize = input.nextInt();
    int[] myArray = new int[arraySize];

    //Prompt the user to enter the array and store the values
    System.out.println("Please enter the values: ");
    for(int i = 0; i < arraySize; i++){
      myArray[i] = input.nextInt();
    }

    //Call partition method and store it in an array called answer
    int[] answer = partition(myArray);

    //Use sorting method as a fail safe incase it is not properly sorted
    java.util.Arrays.sort(answer);

    //Dislpay each element in the array
    for(int e: answer){
      System.out.print(e + ", ");
    }
  }
  /**
   * partition
   *
   * This function takes in an array and partitions it
   *
   * Parameters:
   *   int[]: the array that will be partitioned
   *
   * Return value: partionedList.
   */
  public static int[] partition(int[] list){

    //Set the lenght of the new array
    int[] myPartition = new int[list.length];

    //Create a deep copy of the array
    for(int i = 0; i < myPartition.length; i++){
      myPartition[i] = list[i];
    }

    //Initialize your pivot value
    int pivot = list[0];

    //The for loop will run through and check which values are below the pivot
    // and which are above and store them in the array.
    for(int i = 1; i <= myPartition.length - 1; i++){
      if(myPartition[i] > pivot){
        myPartition[i] = myPartition[i];
      }else{
        for(int j = myPartition[i - 1]; j >= 0; j--){
          myPartition[i - 1] = myPartition[i];
          myPartition[i] = j;
          break;
        }
      }
    }
  return myPartition;
  }
}
