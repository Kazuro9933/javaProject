package practice;

import java.util.Scanner;

public class AscendingIntegers {
    public static void main(String[] args) {

        Scanner aa = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = aa.nextInt();

        System.out.println("Enter 2nd number");
        int b = aa.nextInt();

        System.out.println("Enter 3rd number");
        int c = aa.nextInt();


        if (a > b && a > c) {
            if (b > c) {
                System.out.println("Ascending order: " + c + "," + b + "," + a);
                System.out.println("Descending order: " + a + "," + b + "," + c);
            } else {
                System.out.println("Ascending order: " + c + "+" + a + "+" + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println();
            }
        }
    }
}
