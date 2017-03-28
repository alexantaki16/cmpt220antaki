/**
   * file: Convolution.java
   * author: Alex Antaki
   * course: CMPT 220
   * assignment: prj 1
   * due date: March 27, 2017
   * version: 1
   *
   * This program will two separate arrays and preform convolution
   */

import java.util.Scanner;
import java.util.Arrays;

public class Convolution {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //Have user input two numbers for the array lengths
    int vFirstLength = input.nextInt();
    int vSecondLength = input.nextInt();

    //Have the user input the values for the first array
    double[] vFirst = new double[vFirstLength];
    for(int i = 0; i <vFirst.length; i++){
      vFirst[i] = input.nextDouble();
    }

    //Have the user input the values for the second array
    double[] vSecond = new double[vSecondLength];
    for(int i = 0; i <vSecond.length; i++){
      vSecond[i] = input.nextDouble();
    }

    //Call the method and store it in an array of type double
    double[] answer = convolveVectors(vFirst, vSecond);

    //Create a new array so "answer" can be casted as an int without any loss
    //of data
    int[] convolution = new int[answer.length];
    for(int i = 0; i < answer.length; i++){
      convolution[i] = (int)Math.round(answer[i]);
    }

    //Displays the answer as int values
    for(int e: convolution){
      System.out.print(e + " ");
    }

    //Gives spacing as it displays
    System.out.println();
  }
  /**
   * convolveVectors
   *
   * This method will perform convolution
   *
   * Parameters:
   *   double[]: vFirst
   *   double[]: vSecond
   *
   * Return value: The two arrays concatenated after performing convolution.
   */
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {

    //Declare a new array
    double[] cResult = new double[(vFirst.length + vSecond.length) - 1];

    //Flips the second array (vSecond)
    for(int i = 0; i < cResult.length / 2; i++){
      double temp = cResult[i];
      cResult[i] = cResult[cResult.length - i - 1];
      cResult[cResult.length - i - 1] = temp;
    }

    //Preforms convolution
    for(int idx = 0; idx < cResult.length; idx++){
      cResult[idx] = 0;
      //This loop will check every index in the array
      for(int shift = 0; shift <= idx; shift++){
        //The if checks the indexes and shifts to make sure everything is in bounds
        if((idx-shift >= 0) && (shift <= idx)  && (idx - shift < vFirst.length)
            && (shift < vSecond.length))
          cResult[idx] += vFirst[idx-shift] * vSecond[shift];
      }
    }
    return cResult;
  }
}
