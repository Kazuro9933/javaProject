package scannerClass;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = user.nextDouble();

        System.out.println("Enter ariphmetic operator: / * + - %");
        String ariphmeticOperator = user.next();

        System.out.println("Enter second number:");
        double num2 = user.nextDouble();

        if (ariphmeticOperator.equals("/")){
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2) );
        }
        else if (ariphmeticOperator.equals("*")){
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        }
        else if (ariphmeticOperator.equals("-")){
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }
        else if (ariphmeticOperator.equals("+")){
            System.out.println(num1 + " + " + num2 + " = " + (num1 +num2));
        }
        else if (ariphmeticOperator.equals("%")){
            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        }
        else {
            System.out.println("The opertor is invalid, please enter / * + - %");
        }
    }
}
