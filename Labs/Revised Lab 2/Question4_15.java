/**
 * file: Question4_15.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 8, 2017
 * version: 1
 *
 * This file will take input from the user and display a corresponding number.
 */
import java.util.Scanner;
public class Question4_15{
  public static void main(String[] args){

    //Use imported scanner
    Scanner input = new Scanner(System.in);

    //Prompt the user to enter a letter
    System.out.println("Please enter a letter: ");

    //Store the string
    String userLetter = input.nextLine();

    //This if will assign the letter to it corresponding number on a telephone pad
    if(userLetter.equalsIgnoreCase("A"))
      System.out.println("2");
    else if(userLetter.equalsIgnoreCase("B"))
      System.out.println("2");
    else if(userLetter.equalsIgnoreCase("C"))
      System.out.println("2");
    else if(userLetter.equalsIgnoreCase("D"))
      System.out.println("3");
    else if(userLetter.equalsIgnoreCase("E"))
      System.out.println("3");
    else if(userLetter.equalsIgnoreCase("F"))
      System.out.println("3");
    else if(userLetter.equalsIgnoreCase("G"))
      System.out.println("4");
    else if(userLetter.equalsIgnoreCase("H"))
      System.out.println("4");
    else if(userLetter.equalsIgnoreCase("I"))
      System.out.println("4");
    else if(userLetter.equalsIgnoreCase("J"))
      System.out.println("5");
    else if(userLetter.equalsIgnoreCase("K"))
      System.out.println("5");
    else if(userLetter.equalsIgnoreCase("L"))
      System.out.println("5");
    else if(userLetter.equalsIgnoreCase("M"))
      System.out.println("6");
    else if(userLetter.equalsIgnoreCase("N"))
      System.out.println("6");
    else if(userLetter.equalsIgnoreCase("O"))
      System.out.println("6");
    else if(userLetter.equalsIgnoreCase("P"))
      System.out.println("7");
    else if(userLetter.equalsIgnoreCase("Q"))
      System.out.println("7");
    else if(userLetter.equalsIgnoreCase("R"))
      System.out.println("7");
    else if(userLetter.equalsIgnoreCase("S"))
      System.out.println("7");
    else if(userLetter.equalsIgnoreCase("T"))
      System.out.println("8");
    else if(userLetter.equalsIgnoreCase("U"))
      System.out.println("8");
    else if(userLetter.equalsIgnoreCase("V"))
      System.out.println("8");
    else if(userLetter.equalsIgnoreCase("W"))
      System.out.println("9");
    else if(userLetter.equalsIgnoreCase("X"))
      System.out.println("9");
    else if(userLetter.equalsIgnoreCase("Y"))
      System.out.println("9");
    else
      System.out.println("9");
  }
}
