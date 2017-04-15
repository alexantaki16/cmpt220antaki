/*
 * file: Question10_2.java
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 7
 * due date: April 18, 2017
 * version: 1
 *
 *  This program will take the BMI program and use feet and inches instead of
 * "height"
 */
public class Question10_2{
  public static void main(String[] args){

    //Create first object called bmi1 and change height value to 5 feet 10 inches
    BMI bmi1 = new BMI("Kim Yang", 18, 145, 5, 10);

    //Display results
    System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI()
        + " : " + bmi1.getStatus());

    //Create second object called bmi2 and change height value to 5 feet 10 inches
    BMI bmi2 = new BMI("Susan King", 215, 5, 10);

    //Display results
    System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI()
        + " : " + bmi2.getStatus());
  }
  /*
   * BMI
   *
   *  This class will take in values for the person's name, age, weight, height
   * in feet and inches and convert it to check what your BMI is.  It will also
   * display whether the individual is Underweight, Normal, Overweight, or Obese
  */
  public static class BMI {

    //Create all of the data fields including KILOGRAMS_PER_POUND and METERS_PER_INCH
    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;
    public static final double KILOGRAMS_PER_POUND = 0.45350237;
    public static final double METERS_PER_INCH = 0.0254;

    //Create a deafult constructor and assign the values passed into the constructor
    // to the direct references above.
    public BMI(String name, int age, double weight, double feet, double inches){
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.feet = feet;
      this.inches = inches;
    }

    //Create a second constructor and assign the values
    public BMI(String name, double weight, double feet, double inches){
      this(name, 20, weight, feet, inches);
    }

  /*
   * getBMI
   *
   * This method will take in the values and calculate the BMI.
   *
   * Parameters:
   *   There are none
   *
   * Return value: This method returns the bmi
  */
    public double getBMI(){
      double bmi = weight * KILOGRAMS_PER_POUND / ((((feet*12) + inches)
          * METERS_PER_INCH) * (((feet*12) + inches) * METERS_PER_INCH));
      return (bmi * 100) / 100;
    }

  /*
   * getStatus
   *
   * This method will take the BMI and determine whether you are underweight,
   * normal, overwieght, or obese
   *
   * Parameters:
   *   There are no parameters
   *
   * Return value: This method returns the string stating whether you are
   * underweight, normal, overwieght, or obese
  */
    public String getStatus() {
      double bmi = getBMI();
      if(bmi < 18.5)
        return "Underweight";
      else if(bmi < 25)
        return "Normal";
      else if(bmi < 30)
        return "Overweight";
      else
        return "Obese";
    }

  /*
   * getName
   *
   * This method will take in the user's name
   *
   * Parameters:
   *   There are no parameters
   *
   * Return value: The name of the user as a String
  */
    public String getName(){
      return name;
    }

  /*
   * getAge
   *
   * This method will take the age of the user
   *
   * Parameters:
   *   There are no parameters
   *
   * Return value: This method returns the age as an int
  */
    public int getAge(){
      return age;
    }

  /*
   * getWeight
   *
   * This method will take the weight.
   *
   * Parameters:
   *   There are no parameters
   *
   * Return value: This method returns the weight as a double
  */
    public double getWeight(){
      return weight;
    }

  /*
   * getFeet
   *
   * This method will take the feet value
   *
   * Parameters:
   *   There are no parameters
   *
   * Return value: This method returns the feet value as a double
  */
    public double getFeet(){
      return feet;
    }

  /*
   * getInches
   *
   * This method will take the inches value
   *
   * Parameters:
   *   There are no parameters
   *
   * Return value: This method returns the inches as a double value
  */
    public double getInches(){
      return inches;
    }
  }
}
