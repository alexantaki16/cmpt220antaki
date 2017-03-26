/**
   * file: Question7_32.java
   * author: Alex Antaki
   * course: CMPT 220
   * assignment: Lab 5
   * due date: March 27, 2017
   * version: 1
   *
   * This file will ask the user to input values for an array and display the
   * largest element.
   */
import java.util.Scanner;
public class Question8_13{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //Prompt the user to enter the number of rows and columns and store them.
    System.out.println("Enter the number of rows and columns in the array: ");
    int numOfRows = input.nextInt();
    int numOfCols = input.nextInt();

    //Create the multidimensional array
    double[][] myMatrix = new double[numOfRows][numOfCols];

    //Prompt the user to enter the values for the array
    System.out.println("Please enter the numbers you want in the arrays: ");

    //These nested loops will allow the user to fill up the array entirely
    for(int i = 0; i < myMatrix.length; i++){
      for(int j = 0; j < myMatrix[i].length; j++){
        myMatrix[i][j] = input.nextDouble();
      }
    }

    //Call the method and store it in a single dimensional array to be displayed
    int[] locOfElement = locateLargest(myMatrix);

    //Display the location of the largest element
    System.out.println("The location of the largest element is at ( "
        + locOfElement[0] + ", " + locOfElement[1] + " )");
  }
  /**
   * locateLargest
   *
   * This method will find the largest number in the array.
   *
   * Parameters:
   *   double[][]: The multidimensional array
   *
   * Return value: location (of the highest value in the array).
   */
  public static int[] locateLargest(double[][] a){

    //Create an array for the location of the largest element.  Also works as
    // a fail safe incase the first input is already the largest element.
    int[] location = {0,0};

    //Initialze minValue
    double minValue = 0;

    //These nested for loops will go through each index and test which is larger
    //If the number is larger the coordinates are saved.
    for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a[i].length; j++){
        //Tests if the number in each index is larger than the next and assigns
        //it if necessary
        if(a[i][j] > minValue){
          location[0] = i;
          location[1] = j;
          minValue = a[i][j];
        }
      }
    }
    return location;
  }
}
