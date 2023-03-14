package homeAssignments;

import java.util.Scanner;

public class IfElseHomework {
    public static void main(String[] args) {
        /*
        1. Write a program that checks whether the number is positive, negative, or zero.
           The program should print out a message indicating the result.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
