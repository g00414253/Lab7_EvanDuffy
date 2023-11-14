package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Please enter a number between 0-9 :");
            Scanner myScan = new Scanner(System.in);
            //Read user input as a string
            String input = myScan.nextLine();

            //Try and catch added
            //Check if the number is between 0 and 9
            //While loop to keep repeating
            try {
                int MyNum = Integer.parseInt(input);
                if (MyNum >= 0 && MyNum <= 9) {
                     System.out.println("You entered : " + MyNum);
                     return;
                } else {
                    System.out.println("Not a valid number entered");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Number Format Entered");
            }
        }
    }
}