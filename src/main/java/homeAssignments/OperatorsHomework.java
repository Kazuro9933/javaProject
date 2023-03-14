package homeAssignments;

public class OperatorsHomework {
    public static void main(String[] args) {
        /*
        1) given: int a = 100; int b = 200;
        write a program that will print the sum of two variables.
         */
        int a = 100;
        int b = 200;

        System.out.println(a + " + " + b + " = " + (a + b));

        /*
        2) given int q = 5; int w = 9, int e = 10;
        write a program that will print the sum of all three variables.
         */
        int q = 5;
        int w = 9;
        int e = 10;
        System.out.println(q + " + " + w + " + " + e + " = " + (q + w + e));

        /*
        3) using operators and variables, write a program that will print following lines of code:
        1 + 2 = 3
        3 - 1 = 2
        2 * 2 = 4
        4 / 2 = 2
        2 + 8 = 10
        10 % 7 = 3
         */
        int int1 = 1;
        int int2 = 2;
        System.out.println(int1 + " + " + int2 + " = " + (int1 + int2));
        int int3 = 3;
        int int4 = 1;
        System.out.println(int3 + " - " + int4 + " = " + (int3 - int4));
        int int5 = 2;
        int int6 = 2;
        System.out.println(int5 + " * " + int6 + " = " + int5 * int6);
        int int7 = 4;
        int int8 = 2;
        System.out.println(int7 + " / " + int8 + " = " + int7 / int8);
        int int9 = 10;
        int int0 = 7;
        System.out.println(int9 + " % " + int0 + " = " + int9 % int0);

        /*
        4) Length and width of a rectangle are 9 and 15 respectively. Write a program to calculate the area and perimeter of the rectangle. Print results as following:

        The area of a rectangle is:
        The perimeter of rectangle is:
         */
        int lenght = 9;
        int width = 15;
        System.out.println("The area of a ractangle is: " + lenght * width);
        System.out.println("The perimeter of a ractangle is: " + (lenght + width) * 2);

        /*
        5) Write a program to add 8 to the number 2345 and then divide it by 3.
        Now, the modulus the total sum with 5 and then multiply the result value by 5. Print the final result as following:
         */


        int number1 = 8;
        int number2 = 2345;
        int number3 = 3;
        int number4 = 5;
        int number5 = 5;
        System.out.println((number1 + number2) + "/" + number3 + " = " + (number1 + number2) / number3);
        int number6 = 784;
        System.out.println(number6 + " % " + number4 + " = " + number6 % number4);
        int number7 = 4;
        System.out.println(number7 + " * " + number5 + " = " + number7 * number5);

        /*
        6) Now, solve the above question using compound operators (eg. +=, -=, *=).
         */
        int price = 8;
        price += 2345;
        price /= 3;
        price %= 5;
        price *= 5;
        System.out.println( price );

        /*
        7) Write a program to check if the two numbers 23 and 45 are equal.
         */
        System.out.println(23 == 45);

        /*
        8) Write a program to check if the two numbers -10 and 10 are equal.
         */
        System.out.println(-10 == 10);
    }
}
