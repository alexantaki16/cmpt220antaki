/**
 * file: Question4_8.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 8, 2017
 * version: 1
 *
 * This file calculates the area of a polygon.
 */
import java.util.Scanner;
public class Question4_8{
    public static void main(String[] args){

    //Initialize letter
    char letter;

    //Import Scanner
    Scanner input = new Scanner(System.in);

    //Prompt the user to enter an ASCII code
    System.out.println("Enter an ASCII code: ");

    //Have user enter a code
    int ascii = input.nextInt();

    //Assign letter to ascii casted as a char
    letter = (char)ascii;

    //Display results
    System.out.println("The character code for the ASCII code is " + letter);
   }
 }
