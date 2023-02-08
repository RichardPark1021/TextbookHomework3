/**
 * @Class: BodyMassIndex
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: February 9, 2023
 * Description: The program will prompt the user to enter his/her weight in pounds and his/her height in inches, and
 * it will compute and interpret the Body Mass Index.
 */

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input
        System.out.println("Please enter your weight in pounds: ");
        double userWeight = sc.nextDouble();

        System.out.println("Please enter your height in inches: ");
        double userHeight =  sc.nextDouble();

        //formulas and calculations
        double weight = userWeight * 0.4536; //converts pounds to kilograms
        double height = userHeight * 0.0254; //converts inches to meters
        double BMI = weight / (height * height);

        //outputs
        if(BMI < 18.5) {
            System.out.println("You're BMI is " + BMI + "kg/m");
            System.out.println("You are Underweight");
        }
        else if(18.5 <= BMI && BMI < 25.0) {
            System.out.println("You're BMI is " + BMI + "kg/m");
            System.out.println("You are Normal");
        }
        else if(25.0 <= BMI && BMI < 30.0) {
            System.out.println("You're BMI is " + BMI + "kg/m");
            System.out.println("You are Overweight");
        }
        else {
            System.out.println("You're BMI is " + BMI + "kg/m");
            System.out.println("You are Obese");
        }
    }
}
