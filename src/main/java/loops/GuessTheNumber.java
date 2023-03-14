package loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int randomNumber = new Random().nextInt(1, 100);

        Scanner user = new Scanner(System.in);
        int num;

        do {
            System.out.println("Enter number: ");
            num = user.nextInt();
            if (num < randomNumber){
                System.out.println("Too low");
            }
            else if (num > randomNumber){
                System.out.println("Too high");
            }
            else {
                System.out.println("U guessed the right number");
                break;
            }
            if (num < 1 || num > 100){
                System.out.println("Enter number in range 1 - 100");
            }
        }while(num != randomNumber);

    }
}