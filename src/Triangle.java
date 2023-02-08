/**
 * @Class: Triangle
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: February 9, 2023
 * Description: The program will prompt the user to enter the length of the three edges of a triangle. The program
 * will calculate the perimeter of the triangle if the input is valid, otherwise it will print invalid input. The
 * input is valid if the sum of every pair of two edges is greater than the remaining edge.
 */

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input the length of the edges
        System.out.println("Input the length of the first edge: ");
        double firstEdge = sc.nextInt();

        System.out.println("Input the length of the second edge: ");
        double secondEdge = sc.nextInt();

        System.out.println("Input the length of the third edge: ");
        double thirdEdge = sc.nextInt();

        double perimeter = firstEdge + secondEdge + thirdEdge; // Perimeter formula of a triangle

        //Condition for each possible outcome and output
        if(firstEdge + secondEdge > thirdEdge && firstEdge + thirdEdge > secondEdge &&
                secondEdge + thirdEdge > firstEdge) {
            System.out.println("The perimeter of the triangle is " + perimeter);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
