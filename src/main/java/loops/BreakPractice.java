package loops;

import java.util.Scanner;

public class BreakPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;

        for (int i = 1; i <= sum; i++) {
            if (i == 45) {
                System.out.println("Loop stopped at 45.");
                break;
            }
            System.out.println(i);
        }
    }
}
