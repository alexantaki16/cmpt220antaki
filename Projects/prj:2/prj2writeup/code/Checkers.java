/**
   * file: Checkers.java
   * author: Alex Antaki
   * course: CMPT 220
   * assignment: Project 2
   * due date: April 4, 2017
   * version: 1
   *
   * This file is my checkers program.
   */
import javax.swing.*;
import java.applet.*;
import java.awt.*;
import javafx.scene.shape.Circle;
import javafx.scene.Group;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/*
  Approach A: Use the JFrame itself as the board state
      when moving, need to lookup the JPanel at the
      desired coordinates, then check to see if it has
      any child components (e.g., JLabel), if not then
      it is free, otherwise it's occupied. Moving is then
      a matter of detaching the JLabel from its currently
      JPanel and then adding it to the destination JPanel.

  Approach B: Use a matrix (2D array) of integers
      0 is empty, 1 is occupied, 2 is king, do all your
      checking and movement on the matrix. Then after
      moving, you need to "refresh" the graphical board
      to match the state of the matrix.
*/
public class Checkers extends Application{

  //Initalize all variables
  final public static int numRows = 8;
  final public static int numCols = 8;
  public static Color tile1 = Color.BLACK;
  public static Color tile2 = Color.RED;
  JPanel[][] myPanels = new JPanel[numRows][numCols];

  //Override the start method in the Application class
  @Override
  public void start(Stage primaryStage){

    //Used to create window for the checker board
    JFrame myBoard = new JFrame();

    //Initialize the size of the board and title it Checkers
    myBoard.setSize(800,800);
    myBoard.setTitle("Checkers");

    //The getContentPane creates a content pane layer to hold objects
    Container myContainer = myBoard.getContentPane();

    //This sets the layout of the checker board with the rows and columns as parameters.
    myContainer.setLayout(new GridLayout(numRows, numCols));

    //Create a temporary color.
    Color temp = Color.ORANGE;

    //This outer for loop colors the tiles
    for(int i = 0; i < numRows; i++){
      if(i % 2 == 0)
        temp = tile1;
      else
        temp = tile2;

      //This inner for loop will add the pieces to the board
      for(int j = 0; j < numCols; j++){

        //The JPanel is used to group components in the same contianer together
        JPanel panel = new JPanel();
        myPanels[i][j] = panel;

        //Set the background color to temp
        panel.setBackground(temp);

        //Assigns the pieces to the proper positions on the board
        if(temp.equals(tile1)){
          temp = tile2;
          if(i <= 2){
            //Imports the blue piece
            ImageIcon image = new ImageIcon("checkerpiece.png");
            JLabel label = new JLabel("", image, JLabel.CENTER);
            panel.add(label, BorderLayout.CENTER);
          }
          if(i >= 5){
            //Imports the yellow piece
            ImageIcon image = new ImageIcon("circle2.png");
            JLabel label = new JLabel("", image, JLabel.CENTER);
            panel.add(label, BorderLayout.CENTER);
          }
        }else
          temp = tile1;

        //Add each pane to the panel.
        myContainer.add(panel);
      }
    }
    //Allow board to be displayed
    myBoard.setVisible(true);
  }
}
