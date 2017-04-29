import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Group;

/*
 * file: Piece.java
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Movement for prj:2
 * due date: May 4, 2017
 * version: 1
 *
 *  This program will create a circle object
 */
public class Piece extends Application {
  //Create circle object
  Circle myCircle;

  //Override start method in Application class
  @Override
  public void start(Stage primaryStage){

    //Create circle object and set its size and style
    myCircle = new Circle();
    myCircle.setCenterX(75);
    myCircle.setCenterY(75);
    myCircle.setRadius(35);
    myCircle.setStyle("-fx-fill: blue;");

    //Create a pane to hold the values
    Pane pane = new Pane();
    pane.getChildren().add(myCircle);

    //Place the pane onto the scene to be displayed
    Scene scene = new Scene(pane, 200, 200);
    primaryStage.setTitle("Show Circle");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
