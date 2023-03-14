package loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }


        for (int k = 1; k <= 100; k++) {
            if (k % 2 == 0) {
                continue;
            }
            System.out.println(k);
        }

        /*
        ask user to enter one negative and one positive number and print all numbers
        in that range
        if number is even and negative, do not print it
        if number is  odd and positive, do not print it
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int positiveNumber = scanner.nextInt();
        int negativeNumber = scanner.nextInt();


        for (int p = negativeNumber; p <= positiveNumber; p++) {
            if (p < 0 && p % 2 == 0) {
                continue;
            } else if (p > 0 && p % 2 != 0) {
                continue;
            }
            System.out.println(p);
        }
    }
}
