/**
 * file: Question9_13.java
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 6
 * due date: April 18, 2017
 * version: 1
 *
 *  This program will take in an array from the user and find the location of
 * the largest number
 */
import java.util.Scanner;
public class Question9_13{
  public static void main(String[] args){

    //Import Scanner
    Scanner input = new Scanner(System.in);

    //Prompt the user to enter how many rows and columns they want and store it
    System.out.println("Enter the number of rows and columns in the array: ");
    int rows = input.nextInt();
    int cols = input.nextInt();

    //Prompt the user to enter values based on the rows and columns they want
    System.out.println("Please enter values for the " + rows + " rows and "
        + cols + " columns");

    //Create an array for the user
    double[][] userArray = new double[rows][cols];

    //Use nested for loops to store the input
    for(int i = 0; i < userArray.length; i++){
      for(int j = 0; j < userArray[i].length; j++){
        userArray[i][j] = input.nextDouble();
      }
    }

    //Create an instnace of the object and call if maxValLoc
    Location maxValLoc = locateLargest(userArray);

    //Display the location of the largest element in the array
    System.out.println("The loactation of the largest element in the array is "
        + " at ("  + maxValLoc.rows + ", " + maxValLoc.cols + ")");
  }
  /*
   * Location
   *
   *  This class will take values from the user and determine where the largerst
   * element in the array is.
   *
   */
  public static class Location{

    //Initalize all data fields
    public int rows = 0;
    public int cols = 0;
    public double maxVal;

    //Default constructor
    Location(){

    }
    
  /*
   * getRows
   *
   * This method gets the rows
   *
   * Parameters: There are no parameters
   *   
   *
   * Return value: The method returns the rows.
  */
    public int getRows() {
      return rows;
    }

  /* setRows
   *
   * This method sets the rows
   *
   * Parameters: int a: The rows themselves
   *   
   *
   * Return value: The method is void and requires no return value.
  */
    public void setRows(int rows) {
      this.rows = rows;
    }

  /* getCols
   *
   * This method gets the columns
   *
   * Parameters: There are no parameters
   *   
   *
   * Return value: The method returns the columns.
  */
    public int getCols() {
      return cols;
    }

  /* setCols
   *
   * This method sets the columns
   *
   * Parameters: int cols: The columns themselves
   *   
   *
   * Return value: The method is void and has no return value.
  */
    public void setCols(int cols) {
      this.cols = cols;
    }

  /* getMaxValue
   *
   * This method gets the MaxValue
   *
   * Parameters: There are no parameters
   *   
   *
   * Return value: The method returns the MaxValue.
  */
    public double getMaxVal() {
      return maxVal;
    }

  /* setMavVal
   *
   * This method sets the MaxVal
   *
   * Parameters: double maxVal: The maxValue itself
   *   
   *
   * Return value: The method is void and has no return value.
  */
    public void setMaxVal(double maxVal) {
      this.maxVal = maxVal;
    }

    //Second construtor takes in the array being passed
    Location(double[][] a){

      //Sets default location for largest element
      maxVal = a[0][0];

      //Nested for loops are used to go through every index and check which is
      // the largest
      for(int i = 0; i < a.length; i++){
        for(int j = 0; j < a[i].length; j++){
          //Checks if the first input is greater than the next and checks every
          // index.  If it is greater it will assign it to the maxVal.
          if(a[i][j] > maxVal){
            rows = i;
            cols = j;
            maxVal = a[i][j];
          }
        }
      }
    }
  }
  /*
   * locateLargest
   *
   * This method will take the maxValue from the if statement above and assigne
   * it to "answer"
   *
   * Parameters:
   *   double[][] a: This array holds the user input and knows the highest
   * element in the array
   *
   * Return value: The method returns the highest element in the array.
  */
    public static Location locateLargest(double[][] a){
      Location answer = new Location(a);
      return answer;
    }
 }
