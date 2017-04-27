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

public class Checkers extends Application{

  final public static int numRows = 8;
  final public static int numCols = 8;
  public static Color tile1 = Color.BLACK;
  public static Color tile2 = Color.RED;

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

    //This for loop will alternate black and red panes for the board
    JPanel[][] myPanels = new JPanel[numRows][numCols];
    JPanel panels = new JPanel();

    for(int i = 0; i < numRows; i++){
      if(i % 2 == 0)
        temp = tile1;
      else
        temp = tile2;
      for(int j = 0; j < numCols; j++){

        //The JPanel is used to group components in the same contianer together
        JPanel panel = new JPanel();
        myPanels[i][j] = panel;

        //Set the background color to temp
        panel.setBackground(temp);

        //Alternates the tiles
        if(temp.equals(tile1)){
          temp = tile2;
          if(i <= 2){
            ImageIcon image = new ImageIcon("checkerpiece.png");
            JLabel label = new JLabel("", image, JLabel.CENTER);
            panel.add(label, BorderLayout.CENTER);
          }
          if(i >= 5){
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
    //Allow board to actually be displayed
    myBoard.setVisible(true);
  }
}
