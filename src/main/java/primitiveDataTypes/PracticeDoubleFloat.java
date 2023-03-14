package primitiveDataTypes;

public class PracticeDoubleFloat {

    public static void main (String [] args) {

        /*
        - float and double are variable that store decimal numbers
        - double is larger than float
        - double is the most precise variable
        - java thinks all decimal numbers are double
        - to make sure float is float put F/f in the end
         */

        double priceOfBread = 4.99;
        double priceOfApples = 3.9999999999999999999999998;
        System.out.println(priceOfApples);

        priceOfBread = 98.1;

        byte byte1 = 2;
        short short1 = 5;
        int int1 = 7;
        long long1 = 345;
        float float1 = 3545;
        double double1 = 2343;

        float1 = (float)double1;
        double1 = float1;
        double1 = 4.99;
        long1 = (long)double1;
        System.out.println(long1);

        int a = 111;
        double b = a;
        System.out.println(b);


        /* create 10 doubles, 10 floats
        assign values, reassign values
        do casting
        */
        /*
        4.88 - floating, fractional, decimal numbers
        1, 2, 3 - whole numbers
        1234567890 - decimal system
        012345678 - octal system
        0123456789abcdef - hexadecimal
        10 - binary system
         */

        int a1 = 5;
        double d = 8.5;

        a = (int)d;

        System.out.println(a1);

        short sh;
        float f = (float)12.7;
        f = 12.7F;

        sh = (short)f;
        System.out.println(sh);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        int num1 = 45;
        double price = 99.99;
        int fgh = (int) 567.77;

        int price2 = (int) price;
        System.out.println(price2);



    }
}
