/**
 * file: Question3_11.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 8, 2017
 * version: 1
 *
 * This file takes prompts the user to enter number and year.  The program will
 display the corresponding days in that month.
 */
import java.util.Scanner;
public class Question3_11 {
  public static void main(String[] args) {
    int month = 0;
    int year = 0;
    int days = 0;

    //Import Scanner
    Scanner input = new Scanner(System.in);

    //Prompt user to enter a number for the month and a year.
    System.out.println("Please enter a number from 1 through 12 and a year");

    //Ask user for month and year input
    month = input.nextInt();
    year = input.nextInt();

    //This is the number the user inputs and it will display the name of the
    //month and the year.
    switch(month){
      case 1:System.out.print("January " + year);
              break;
      case 2:System.out.print("February " + year);
              break;
      case 3:System.out.print("March " + year);
              break;
      case 4:System.out.print("April " + year);
              break;
      case 5:System.out.print("May " + year);
              break;
      case 6:System.out.print("June " + year);
              break;
      case 7:System.out.print("July " + year);
              break;
      case 8:System.out.print("August " + year);
              break;
      case 9:System.out.print("September " + year);
              break;
      case 10:System.out.print("October " + year);
              break;
      case 11:System.out.print("November " + year);
              break;
      case 12:System.out.print("December " + year);
              break;
      default:System.out.print("You entered an invalid number.");
    }

      //This if determines the months that have 28, 30, 31, and sometimes 29 days.
      if(month == 1 || month == 3 || month == 5 || month == 7 ||
          month == 8 || month == 10 || month == 12)
        System.out.print(" has 31 days ");
      else if(month == 4 || month == 6 || month == 9 || month == 11)
        System.out.print(" has 30 days ");
      else if (year % 4 != 0 && year % 400 != 0)
        System.out.print(" has 28 days ");
      else
        System.out.print(" has 29 days ");

      //This if determines if the year is a leap year or any normal year.
      if(year % 4 != 0)
        System.out.print("and is not a leap year.");
      else if(year % 100 != 0)
        System.out.print("and is a leap year.");
      else if(year % 400 != 0)
        System.out.print("and is not a leap year.");
      else
        System.out.print("and is a leap year.");
  }
}
