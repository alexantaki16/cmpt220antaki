/**
   * file: Question7_31.java
   * author: Alex Antaki
   * course: CMPT 220
   * assignment: Lab 5
   * due date: March 27, 2017
   * version: 1
   *
   * This program will take two sorted arrays, merge them, and sort them
   * if needed
   */
import java.util.Scanner;
import java.util.Arrays;
public class Question7_31{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //Prompt the user to enter how many values will be in list 1
    System.out.println("How many numbers will be in list 1");
    int num1 = input.nextInt();

    //Prompt the user to enter said number of values and store them using
    // a for loop
    System.out.println("Please enter " + num1 + " numbers");
    int[] myList1 = new int[num1];
    for(int i = 0; i < num1; i++){
      myList1[i] = input.nextInt();
    }

    //Prompt the user to enter how many values will be in list 2
    System.out.println("How many number will be in list 2");
    int num2 = input.nextInt();

    //Prompt the user to enter said number of values and store them using
    // a for loop
    System.out.println("Please enter " + num2 + " numbers");
    int[] myList2 = new int[num2];
    for(int i = 0; i < num2; i++){
      myList2[i] = input.nextInt();
    }

    //Call the merge method and store the values in an array called mergedList
    int[] mergedList = merge(myList1, myList2);

    //Print the array using the Arrays.toString method and use another
    //System.out.println() to help space it out
    System.out.print(Arrays.toString(mergedList));
    System.out.println();
  }
  /**
   * merge
   *
   * This function takes the two arrays and merges them
   *
   * Parameters:
   *   double[]: the two arrays that will be merged
   *
   * Return value: mergedList.
   */
  public static int[] merge(int[] myList1, int[] myList2){

    //Create an array that is equal to the first two put together
    int[] mergedList = new int[myList1.length + myList2.length];

    //Initialize ints
    int i = 0;
    int j = 0;

    //Use two while loops to properly store the values in the new array
    while(i < myList1.length){
      mergedList[i] = myList1[i];
      i++;
    }
    while(j < myList2.length){
      mergedList[j + myList1.length] = myList2[j];
      j++;
    }

    //Call sorting algorithm to make sure array will always be sorted
    sort(mergedList);
    return mergedList;
  }
  /**
   * sort
   *
   * This function takes the array and sorts it.
   *
   * Parameters:
   *   double[]: the two arrays to be sorted
   *
   * Return value: None.  It is void.
   */
  public static void sort(int[] list){
    //This method is used to make sure the array will alaways be sorted.

    //Initialize variables
    int currentMin = 0;
    int currentMinIndex = 0;

    //This for loop will begin the sorting of the.  The beginning of
    //this loop will set the variables equal to the indexes.
    for(int i = 0; i < list.length - 1; i++){
      currentMin = list[i];
      currentMinIndex = i;
      //At this point in the loop, the actual sorting occurs
      for(int j = i + 1; j < list.length; j++){
        if(currentMin > list[j]){
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
