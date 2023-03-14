package scannerClass;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {

        Scanner nlp = new Scanner(System.in);

        System.out.println("Enter number between 1 to 10");
        int number1 = nlp.nextInt();

        if(number1 >= 1 && number1 <= 10){
            System.out.println("Valid input");
        }
        else{
            System.out.println("Invalid input");
        }

    }
}
