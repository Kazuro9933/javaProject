package scannerClass;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int numb1 = scan.nextInt();

        System.out.println("Enter second number: ");
        int numb2 = scan.nextInt();

        System.out.println("Enter third number: ");
        int numb3  = scan.nextInt();

        System.out.println("The answer is: " + (numb1 * numb2 * numb3));

    }
}
