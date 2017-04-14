/**
 * file: Problem9_1.java
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 6
 * due date: April 18, 2017
 * version: 1
 *
 * This file will take values for the width and height for two rectangles and
 * display their areas and perimeters.
 */
public class Question9_1{
  public static void main(String[] args){

    //Create two rectangle objects and pass values for the widths and heights
    Rectangle test1 = new Rectangle(4, 40);
    Rectangle test2 = new Rectangle(3.5, 35.9);

    //Display the width, height, area, and perimeter for each of the rectangle
    System.out.println("\t   First Rectangle \t Second Rectangle");
    System.out.println("Width " + "\t\t" + test1.width + "\t\t\t" + test2. width);
    System.out.println("Height " + "\t\t" + test1.height + "\t\t\t" + test2.height);
    System.out.println("Area " + "\t\t" + test1.getArea() + "\t\t\t" + test2.getArea());
    System.out.println("Perimeter " + "\t" + test1.getPerimeter() + "\t\t\t" + test2.getPerimeter());
  }
  /*
   * Rectangle
   *
   *  This rectangle class will take in values for the width and height.  By
   * default they are both given the value of one.  The class will return the
   * area and perimeters for two rectangles.
  */
  public static class Rectangle{

    //Initialize both variables
    private double width = 1;
    private double height = 1;

    //Create default constructor to initialze the object
    Rectangle(){

    }

    //Create a second constuctor and give it values.
    Rectangle(double newWidth, double newHeight){
      width = newWidth;
      height = newHeight;
    }

  /**
   * setArea
   *
   * This method will take in the width and height.
   *
   * Parameters:
   *   double width: This double holds the value the width will be assigned
   *   double height: This double holds the value the height will be assinged
   *
   * Return value: The method is void and therefore has no return value
  */
    public void setArea(double width, double height) {
      this.width = width;
      this.height = height;
    }

  /**
   * getArea
   *
   * This method will calculate the area using the width and height
   *
   * Parameters:
   *   There are no parameters
   *
   * Return value: This method returns the area
  */
    public double getArea(){
      return width*height;
    }

  /**
   * setPeriemter
   *
   * This method will calculate the perimeter using the width and height
   *
   * Parameters:
   *   double width: This double holds the value the width will be assigned
   *   double height: This double holds the value the height will be assinged
   *
   * Return value: This method returns the perimeter
  */
    public void setPeriemter(double width, double height) {
      this.width = width;
      this.height = height;
    }

  /**
   * getPerimeter
   *
   * This method will calculate the perimeter using the width and height
   *
   * Parameters:
   *   There are no parameters
   *
   * Return value: This method returns the perimeter
  */
    public double getPerimeter(){
      return 2*(width+height);
    }
  }
}
