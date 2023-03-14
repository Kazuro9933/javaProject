package loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean yesNo = true;

        do {
            System.out.println("Enter one number: ");

            int num1 = scanner.nextInt();
            System.out.println("Enter ariphmetic operator: / * + - %");
            String ariphmetic = scanner.next();

            System.out.println("Enter second number:");
            int num2 = scanner.nextInt();

            if (ariphmetic.equals("/")) {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            } else if (ariphmetic.equals("*")) {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            } else if (ariphmetic.equals("-")) {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            } else if (ariphmetic.equals("+")) {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            } else if (ariphmetic.equals("%")) {
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
            } else {
                System.out.println("Try again using / * + - %");
            }
            System.out.println("Want to try again: true/ false");
            yesNo = scanner.nextBoolean();
        }while (yesNo);

    }
    }

