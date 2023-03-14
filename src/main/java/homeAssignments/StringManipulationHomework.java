package homeAssignments;

import com.sun.security.jgss.GSSUtil;

public class StringManipulationHomework {
    public static void main(String[] args) {

        String message = "Hello everyone, Let's do Java String exercises";
        /*
        1. write a program that will create a following output: The character at position 10 is y
         */

        System.out.println("The character at position 10 is: " + message.charAt(10));
        System.out.println("The length of message is: " + message.length());
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println("letter #5 " + message.charAt(4));
        System.out.println("Last letter of the message is: " + message.charAt(message.length()-1));
        System.out.println(message.substring(0,1).toLowerCase() + message.substring(1));
        System.out.println(message.substring(0, message.length()-1) + message.substring(message.length()-1, message.length()).toUpperCase());

        String hello1 = "Hello World!";
        String hello2 = "Hello world!";
        String hello3 = new String("HelloWorld!");
        /*
        1. write a program that compares values of hello1 and hello2, and results in true
        2. write a program that compares values of hello1 and hello3, and results in false
        3. write a program that compares values of hello1 and hello2, and results in false
         */
        System.out.println(hello1 != hello2);
        System.out.println(hello1 == hello3);
        System.out.println(hello1 == hello2);
        /*
        4. convert hello1 and hello2 to all lower case and compare them
        5. convert hello1 and hello3 to upper case and compare them
         */
        System.out.println(hello1.toLowerCase() + " " + hello2.toLowerCase());
    }
}
