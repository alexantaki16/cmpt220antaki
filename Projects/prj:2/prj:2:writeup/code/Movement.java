/*
 * file: Movement.java
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Movement for prj:2
 * due date: May 4, 2017
 * version: 1
 *
 *  This program will allow movement on the checker board
 *
 *     DOES NOT COMPILE!!!!!
 */

import java.util.Scanner;
public class Movement {

  //Create data fields
  int fromRow;
  int fromCol;
  int toRow;
  int toCol;
  int moveFrom;
  int moveTo;
  int blueCheckers = 12;
  int yellowCheckers = 12;

  //Create default constructor
  Movement(){

  }

  //Create another constructor
  Movement(int rowOne, int colOne, int rowTwo, int colTwo){
    this.fromRow = rowOne;
    this.fromCol = colOne;
    this.toRow = rowTwo;
    this.toCol = colTwo;
  }

/*
  * isJump
  *
  * This method will test whether the move was a jump or not
  *
  * Parameters:
  *   This method takes no parameters
  *
  * Return value: The method returns whether the move was a jump or not
  */
  public boolean isJump(){
    return (fromRow - toRow == 2  || fromRow - toRow == -2);
  }

/*
 * Position
 *
 * This method will hold the position of the pieces
 *
 * Parameters:
 *   This method takes no parameters
 *
 * Return value: The method is void and has no return type.
*/
  public void Position(){
    //???????
  }

/*
 * isKing
 *
 * This method will test whether the piece is eligible to become a king
 *
 * Parameters:
 *   This method takes no parameters
 *
 * Return value: The method is a boolean and returns whether the piece is a
 * king or not.
*/
  public boolean isKing(){
    if(blueCheckers == 7 || yellowCheckers == 0)
      return true;
    else
      return false;
  }

/*
 * isLegalMove
 *
 * This method test whether the move made was a legal move or not
 *
 * Parameters:
 *   int moveFrom: Holds the location of where the piece originally was
 *   in moveTo: Hold the location of where the piece ends up
 *
 * Return value: The method whether the player moved and wont finish until
 * the player has moved to a legal position.
*/
  public boolean isLegalMove(int moveFrom, int moveTo){
    boolean moved = false;
    //Infinite recursion?
    while(!moved){
      if(isLegalMove(moveFrom, moveTo)){
        executeMove(moveFrom, moveTo);
        moved = true;
      } else
        System.out.println("Invalid move");
    }
    return true;
  }

/*
 * executeMove
 *
 * This method will execute a move
 *
 * Parameters:
 *   int moveFrom: This holds the last position of the piece
 *   int moveTo: This holds the new location of the piece
 *
 * Return value: The method is void and has no return type.
*/
  public void executeMove(int moveFrom, int moveTo){
    //????????
  }

/*
 * gameOver
 *
 * This method will test whether the game is over or not
 *
 * Parameters:
 *   This method holds no parameters
 *
  * Return value: The method returns whether the game is over or not
*/
  public boolean gameOver(){
    if(blueCheckers == 0){
      System.out.println("Yellow is the winner!");
      return true;
    }else{
        System.out.println("Blue is the winner!");
      return true;
    }
  }

  public static void main(String[] args){

    //Initialize all variables
    int bluePiece = 1;
    int yellowPiece = 2;
    int blueKing = 3;
    int yellowKing = 4;

    //Create 2D array matrix
    int[][] myMatrix = new int[8][8];
  }
}
