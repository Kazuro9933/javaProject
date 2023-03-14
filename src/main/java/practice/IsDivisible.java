package practice;

import java.util.Scanner;

public class IsDivisible {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        String word = sc.nextLine();
        int num1 = 10;
        int num2 = 5;

        if (num1 % num2 == 0){
            System.out.println("Divisible");
        }
        else {
            System.out.println("NO, divisible");
        }
    }
}
