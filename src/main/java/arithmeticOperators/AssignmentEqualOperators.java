package arithmeticOperators;

public class AssignmentEqualOperators {
    public static void main (String [] args){

        /*

        = assignment operators (when you give value to variable)
        == equal equal operator (compares two variables if they are equal or not)
        != not equal operator (compare if two variables are not equal)
         */

        int number1 = 10; //assignment
        int number2 = 8;
        System.out.println(number1 == number2); //false
        System.out.println(100 == 100); //true

        boolean isEqual = 100 == 100 + 1;
        System.out.println(isEqual);

        boolean isEven; // if number can divided by 2

        isEven = 100 == 100 % 2;
        System.out.println(isEven);


    }
}
