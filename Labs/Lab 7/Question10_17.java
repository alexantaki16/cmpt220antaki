/*
 * file: Question10_17.java
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 7
 * due date: April 18, 2017
 * version: 1
 *
 *  This program will find the first 10 square numbers that are greater
 * than Long.MAX_VALUE.
 */
import java.math.BigInteger;
public class Question10_17{
  public static void main(String[] args){
    //Create a string to hold the long value and convert it to a string
    String maxVal = Long.toString(Long.MAX_VALUE);

    //Create an instance of the BigInteger class and give it maxVal becasue it
    // is now a string
    BigInteger a = new BigInteger(maxVal);

    //Find and display the next square numbers
    for(int i = 0; i < 10; i++){
      a = a.add(BigInteger.ONE);
      System.out.println(a.pow(2));
    }
  }
}
