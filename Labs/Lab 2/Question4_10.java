/**
 * file: Question4_10.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 8, 2017
 * version: 1
 *
 * This file will tell you the day of your birthday.
 */
import java.util.Scanner;
 public class Question4_10{
   public static void main(String[] args){

     //Create string set 1
     String set1 =
       " 1  3  5  7\n" +
       " 9 11 13 15\n" +
       "17 19 21 23\n" +
       "25 27 29 31";

    //Create String set 2
    String set2 =
      " 2  3  6  7\n" +
      "10 11 14 15\n" +
      "18 19 22 23\n" +
      "26 27 30 31";

    //Create String set 3
    String set3 =
      " 4  5  6  7\n" +
      "12 13 14 15\n" +
      "20 21 22 23\n" +
      "28 29 30 31";

    //Create String set 4
    String set4 =
      " 8  9 10 11\n" +
      "12 13 14 15\n" +
      "24 25 26 27\n" +
      "28 29 30 31\n";

    //Create String set 5
    String set5 =
      "16 17 18 19\n" +
      "20 21 22 23\n" +
      "24 25 26 27\n" +
      "28 29 30 31";

      //Initialize day to 0
      int day = 0;

      //Use imported Scanner
      Scanner input = new Scanner(System.in);

      //Ask the user if their birthday is in Set 1 and ask them to enter y for
      //yes and n for no
      System.out.print("Is your birthday in Set1\n");
      System.out.println(set1);
      System.out.println("\nEnter N for No and Y for Yes: ");
      String answer = input.nextLine();

      if(answer.equalsIgnoreCase("y")){
        day += 1;
      }

      //Ask the user if their birthday is in Set 2 and ask them to enter y for
      //yes and n for no
      System.out.print("\nIs your birthday in Set2?\n");
      System.out.print(set2);
      System.out.print("\nEnter N for No and Y for Yes: ");
      answer = input.nextLine();

      if(answer.equalsIgnoreCase("y")){
        day += 2;
      }

      //Ask the user if their birthday is in Set 3 and ask them to enter y for
      //yes and n for no
      System.out.print("Is your birthday in Set3?\n");
      System.out.print(set3);
      System.out.print("\nEnter N for No and Y for Yes: ");
      answer = input.nextLine();

      //Checks if the user said yes or no and will change the value of "day"
      //accordingly.  It will also ignore the case.
      if(answer.equalsIgnoreCase("y")){
        day += 4;
      }

      //Ask the user if their birthday is in Set 4 and ask them to enter y for
      //yes and n for no
      System.out.print("\nIs your birthday is Set4\n");
      System.out.print(set4);
      System.out.print("\nEnter N for No and Y for Yes: ");
      answer = input.nextLine();

      //Checks if the user said yes or no and will change the value of "day"
      //accordingly.  It will also ignore the case.
      if(answer.equalsIgnoreCase("y")){
        day += 8;
      }
      //Ask the user if their birthday is in Set 5 and ask them to enter y for
      //yes and n for no
      System.out.print("\nIs your answer in Set5\n");
      System.out.print(set5);
      System.out.print("\nEnter N for No and Y for Yes: ");
      answer = input.nextLine();

      //Checks if the user said yes or no and will change the value of "day"
      //accordingly.  It will also ignore the case.
      if(answer.equalsIgnoreCase("y")){
        day += 16;
      }

      //Check the value of "day" one last time and will display the day on the
      //screen
      if(day == 1 || day == 21){
        System.out.println("Your birthday is on the " + day + "st!");
      }else if(day == 2 || day == 22){
        System.out.println("Your birthday is on the " + day + "nd!");
      }else if(day == 3  || day == 23){
        System.out.println("Your birthday is on the " + day + "rd!");
      }else{
      System.out.println("\nYour birthday is on the " + day + "th!");
      }
   }
 }
