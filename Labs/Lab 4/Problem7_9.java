/**
 * file: Problem7_9.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 28, 2017
 * version: 1
 *
 * This file will take 10 numbers and tell you whats the smallest number.
 */
public class Problem7_9{
  public static void main(String[] args){

    //Prompt the user to enter 10 numbers
    System.out.println("Please enter ten numbers: ");

    //Call method and store answer
    double ans = min(new double[] {});

    //Display results
    System.out.println("The lowest number is: " + ans);
  }
  /**
      * min
      *
      * This function takes the input and calculates which number is the
      * smallest and returns it
      *
      * Return value: The smalles input.
      */
  public static double min(double[] array){

    //Use imported Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    //Create array
    double[] min = new double[10];

    //Stores the 10 numbers the user inputs
    for(int i = 0; i < min.length; i++){
      min[i] = input.nextDouble();
    }

    //Initialize a minimum value.  Also acts as a fail-safe incase the first
    //input is already the smallest value.
    double minValue = min[0];

    //Check every index and see if it is smaller.
    int i = 0;
    while(i < min.length){
      if(minValue > min[i]){
        minValue = min[i];
      }
      i++;
    }
    return minValue;
  }
}
