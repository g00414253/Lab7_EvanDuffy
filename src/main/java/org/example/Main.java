package org.example;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a number between 0-9 :");
        Scanner myScan = new Scanner(System.in);

        //Read user input as a string
        String input = myScan.nextLine();

        //Parse the input to an integer
        int MyNum = Integer.parseInt(input);

        //Check if the number is between 0 and 9
        if (MyNum >= 0 && MyNum<=9){
            System.out.println("You entered : " + MyNum);
        }
        else{
            System.out.println("Not a valid number entered");
        }
    }
}