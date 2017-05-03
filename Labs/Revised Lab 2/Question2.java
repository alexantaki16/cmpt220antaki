/**
 * file: Question2.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 8, 2017
 * version: 1
 *
 * This file will take generate a random license plate.
 */
import java.util.Scanner;
public class Question2 {
  public static void main(String[] args) {

    //Use imported scanner
    Scanner input = new Scanner(System.in);

    //Initialize grade to 0.
    double grade = 0;

    System.out.println("Please enter your grades for your midterm, final, " 
        +"projects, and homework and labs as percentages: ");

    //Have user input all four grades.
    double midterm = input.nextDouble();
    double final1 = input.nextDouble();
    double projects = input.nextDouble();
    double hwandlab = input.nextDouble();

    //Averages all inputed values
    double average = (midterm + final1 + projects + hwandlab) / 4;

    //Calcualte letter grade for class
    if(average >= 95)
      System.out.print("Your final grade is: A");
    else if(average >= 90)
      System.out.print("Your final grade is: A-");
    else if(average >= 87)
      System.out.print("Your final grade is: B+");
    else if(average >= 83)
      System.out.print("Your final grade is: B");
    else if(average >= 80)
      System.out.print("Your final grade is : B-");
    else if(average >= 77)
      System.out.print("Your final grade is: C+");
    else if(average >= 73)
      System.out.print("Your final grade is: C");
    else if(average >= 70)
      System.out.print("Your final grade is: C-");
    else if(average >= 65)
      System.out.print("Your final grade is: D+");
    else if(average >= 60)
      System.out.print("Your final grade is: D");
    else
      System.out.print("Your final grade is: F");
  }
} 

