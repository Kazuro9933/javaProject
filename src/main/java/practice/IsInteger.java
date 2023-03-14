package practice;

import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = scanner.nextInt();

        System.out.println("Enter second number");
        int y = scanner.nextInt();

        if(x > 0 && y > 0){
            System.out.println("Both x and y are positive");
        }
        else if(x == 0 || y == 0){
            System.out.println("Either x and y is zero");
        }
        else if (x < 0 && y < 0){
            System.out.println("Both x and y are negative");
        }
        else {
            System.out.println("one is positive, the other is negative");
        }
    }
}
