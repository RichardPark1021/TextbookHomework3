/**
 * @Class: AlphabeticalOrder
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: February 9, 2023
 * Description: The program will ask the user for a word, and rearrange each character in to alphabetical order
 */

import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input
        System.out.println("Please enter a word: ");
        String word = sc.nextLine();
        char temp;

        //Sorting characters in a for loop
        char[] charArray = word.toCharArray();

        for(int i = 0; i < charArray.length; i++) {
            for(int j = i + 1; j <charArray.length; j++) {
                if(charArray[i] > charArray[j]) {
                    temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        //output of the word
        System.out.println(new String(charArray));
    }
}
