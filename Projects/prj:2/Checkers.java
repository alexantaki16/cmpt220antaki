/**
   * file: Checkers.java
   * author: Alex Antaki
   * course: CMPT 220
   * assignment: Project 2
   * due date: April 4, 2017
   * version: 1
   *
   * This file is my milestone.  So far it displays the checker board using JavaFX
   */
import java.util.Scanner;
import java.util.Arrays;
import javax.swing.*;
import java.applet.*;
import java.awt.*;

public class Checkers {
  final public static int numRows = 8;
  final public static int numCols = 8;
  public static Color tile1 = Color.BLACK;
  public static Color tile2 = Color.RED;
  public static void main(String[] args){

    //This JFrame is used to create a window for the actual checker board
    //When run, the window that pops up is encapsulated by this JFrame
    JFrame myBoard = new JFrame();

    //Initialize the size of the board and title it CheckerBoard
    myBoard.setSize(400,400);
    myBoard.setTitle("CheckerBoard");

    //This uses the imported javax.swing to hold objects.  The getContentPane
    //creates a content pane layer to hold objects in the container called pane
    Container pane = myBoard.getContentPane();

    //This sets the layout of the checker board.  It creates a new grid that has
    //the dimensions of numRows and numCols
    pane.setLayout(new GridLayout(numRows, numCols));

    //Create a temporary color.  Also allows us to alternate colors later in
    // the up coming for loops
    Color temp;

    //This for loop will test if i is even.  If it is it will assign tile1 the
    // color black.  If it is not it will assign tile the color red.
    for(int i = 0; i < numRows; i++){
      if(i % 2 == 0)
        temp = tile1;
      else
        temp = tile2;

      //This nested for loop will make sure the tiles alternate
      for(int j = 0; j < numCols; j++){
        //The JPanel is used to group components in the same contianer together
        JPanel panel = new JPanel();
        //Set the background color to temp
        panel.setBackground(temp);

        //Alternates the tiles
        if(temp.equals(tile1))
          temp = tile2;
        else
          temp = tile1;
        //Add each pane to the panel.
        pane.add(panel);
      }
    }
    //Allow board to actually be displayed
    myBoard.setVisible(true);
  }
}
