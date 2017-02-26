/**
 * file: Problem6_8.java.
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 28, 2017
 * version: 1
 *
 * This file will take values in celsius and convert them to degrees fahrenheit.
 *  It will also tak values in fahrenheit and convert them to degrees celsius.
 */

public class Problem6_8{
  public static void main(String[] args){

    //This for loop will take the degrees from 40 and count down to 31 and
    //display the temperatures in celsius and fahrenheit.
    System.out.println("Celsius" + "\t\t" + "Fahrenheit");
    for(int i = 40; i <= 40 && i >= 31; i--){
      fahrenheitToCelsius(31.0);
      System.out.println(i + "\u00b0" + "\t\t" + celsiusToFahrenheit(i) + "\u00b0");
    }

    //This for loop will take the degrees from 120 and count down to 30 and
    //display the temperatures in celsius and fahrenheit.
    //It will decrement by 10
    System.out.println("Fahrenheit" + "\t" + "Celsius");
      for(int i = 120; i >= 30; i-=10){
        celsiusToFahrenheit(120.0);
        System.out.println(i + "\u00b0" + "\t\t" + fahrenheitToCelsius(i) + "\u00b0");
      }
  }
  /**
      * celsiusToFahrenheit
      *
      * This function takes degrees in celsius and converts it to fahrenheit.
      * Parameters:
      *   Double: The value of the converted value
      *
      * Return value: The degree in fahrenheit.
      */
  public static double celsiusToFahrenheit(double celsius){
    double fahrenheit = (9.0 / 5) * celsius + 32;
    return fahrenheit;
  }
  /**
      * fahrenheitToCelsius
      *
      * This function takes degress in fahrenheit and converts it to celsius.
      * Parameters:
      *   Double: The value of the converted value
      *
      * Return value: The degree in celsius.
      */
  public static double fahrenheitToCelsius(double fahrenheit){
    double celsius = (5.0 / 9) * (fahrenheit - 32);
    return celsius;
  }
}
