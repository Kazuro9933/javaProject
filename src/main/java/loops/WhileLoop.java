package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 99;

        while (i >= 1){
            System.out.println(i);
            i-= 2;
        }

        int k = 31;

        while (k >= 1){
            System.out.println(k + " January 2023");
            k--;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        boolean isPrime = true;

        int number2 = 2;

        while (number2 < number){
            if (number % number2 == 0){
                isPrime = false;
                break;
            }
            number2++;
        }
        if (isPrime) {
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Not prime");
        }

    }
}
