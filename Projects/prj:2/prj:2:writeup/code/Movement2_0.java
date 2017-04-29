/*
 * file: Movement2_0.java
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Movement for prj:2
 * due date: May 4, 2017
 * version: 1
 *
 *  This program will allow movement on the checker board
 */
import java.util.*;

public class Movement2_0{
  public static void main(String[] args){
    //Create 2d array for the checker board.  This is used to repesent
    // pieces on the board.
    int myCheckerBoard[][] = {
      { 1, 0, 1, 0, 1, 0, 1, 0},
      { 0, 1, 0, 1, 0, 1, 0, 1},
      { 1, 0, 1, 0, 1, 0, 1, 0},
      { 0, 0, 0, 0, 0, 0, 0, 0},
      { 0, 0, 0, 0, 0, 0, 0, 0},
      { 0, 2, 0, 2, 0, 2, 0, 2},
      { 2, 0, 2, 0, 2, 0, 2, 0},
      { 0, 2, 0, 2, 0, 2, 0, 2}};

    //Initialize all variables
    int empty = 0;
    int bluePiece = 1;
    int yellowPiece = 2;
    int blueKing = 3;
    int yellowKing = 4;

    //Call printing method to display array.
    printArray(myCheckerBoard);
  }

  /*
    * printArray
    *
    * This method will print the 2D array
    *
    * Parameters:
    *   double[][] a: This array holds the coordinates of the pieces
    *
    * Return value: The method returns the printed array.
  */
  public static int[][] printArray(int[][] a){
    //Create a counter
    int counter = 0;

    //These nested loops will dispay the array above
    for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a[0].length; j++){
        //Makes sure the array is properly organized
        if(counter % 8 == 0)
          System.out.println();
        System.out.print(a[i][j] + " ");
        counter++;
      }
    }
    System.out.println();
    return a;
  }
}
