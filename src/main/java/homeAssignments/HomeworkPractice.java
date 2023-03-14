package homeAssignments;

public class HomeworkPractice {
    public static void main(String[] args) {
        /*
        1. Print multiplication table from 1 to 10 with x. The output should look like below:
        int x = 4;
        4 * 1 = 4
        4 * 2 = 8
        4 * 3 = 12
        ...
        4 * 10 = 40
        2. Create int a and b, store their sum in int ab. Print the sum

        3. Create short t and v, multiply them by each other and store in short tv. Print the result.
         */

        int x = 1;
        System.out.println(x + " * " + "1" + " = " +  x * 1);
        System.out.println(x + " * " + "2" + " = " +  x * 2);
        System.out.println(x + " * " + "3" + " = " +  x * 3);
        System.out.println(x + " * " + "4" + " = " +  x * 4);
        System.out.println(x + " * " + "5" + " = " +  x * 5);
        System.out.println(x + " * " + "6" + " = " +  x * 6);
        System.out.println(x + " * " + "7" + " = " +  x * 7);
        System.out.println(x + " * " + "8" + " = " +  x * 8);
        System.out.println(x + " * " + "9" + " = " +  x * 9);
        System.out.println(x + " * " + "10" + " = " +  x * 10);

        int y = 2;
        System.out.println(y + " * " + "1" + " = " + y * 1);
        System.out.println(y + " * " + "2" + " = " + y * 2);
        System.out.println(y + " * " + "3" + " = " + y * 3);
        System.out.println(y + " * " + "4" + " = " + y * 4);
        System.out.println(y + " * " + "5" + " = " + y * 5);
        System.out.println(y + " * " + "6" + " = " + y * 6);
        System.out.println(y + " * " + "7" + " = " + y * 7);
        System.out.println(y + " * " + "8" + " = " + y * 8);
        System.out.println(y + " * " + "9" + " = " + y * 9);
        System.out.println(y + " * " + "10" + " = " + y * 10);

        int a = 22;
        int b = 24;

        int ab = a + b;
        System.out.println(a + " + " + b + " = " + ab);

        short t = 45;
        short v = 5;
        short tv = 45 * 5;
        System.out.println(t + " * " + v + " = " + tv);

        String hello1 = "Hello World!";
        String hello2 = "Hello world!";
        String hello3 = new String("HelloWorld!");
        /*
        1. write a program that compares values of hello1 and hello2, and results in true
        2. write a program that compares values of hello1 and hello3, and results in false
        3. write a program that compares values of hello1 and hello2, and results in false
        4. convert hello1 and hello2 to all lower case and compare them
        5. convert hello1 and hello3 to upper case and compare them
         */
        boolean hello = !hello1.equals(hello2);
        System.out.println(hello);
        boolean hp = hello1==hello2;
        System.out.println(hp);
        System.out.println(hello1.equals(hello2));
        String np = hello1.toLowerCase();
        String kl = hello2.toLowerCase();
        System.out.println(np.equals(kl));
        np = hello1.toUpperCase();
        kl = hello2.toUpperCase();
        System.out.println(np.equals(kl));





    }
}
