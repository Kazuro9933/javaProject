package homeAssignments;

import java.sql.SQLOutput;

public class StringManipulationHomework2 {
    public static void main(String[] args) {

        /*
        1. Write a program that prints out the index of the first occurrence
        of the word "world" in the string "Hello world" using the indexOf method.
         */
        String str = "Hello world";
        System.out.println(str.indexOf("world"));

        /*
        2. Write a program that prints the first letter of the string "Hello" using the charAt method.
         */
        String word = "Hello";
        System.out.println(word.charAt(0));

        /*
        3. Write a program that prints the string "HELLO" in all lowercase using the toLowerCase method.
         */
        String str1 = "HELLO";
        System.out.println(str1.toLowerCase());

        /*
        4. Write a program that prints the string "hello" in all uppercase using the toUpperCase method.
         */
        String str2 = "hello";
        System.out.println(str2.toUpperCase());

        /*
        5. Write a program that checks if the strings "hello" and "Hello" are equal or not using the equals method.
         */
        System.out.println(str1 == str2);

        /*
        6. Write a program that prints a new string with the first letter of each word
        in the string "the quick brown fox" capitalized using the substring, toUpperCase, and toLowerCase methods.
         */

        String str3 = "the quick brown box";
        String str4 = "the";
        String str5 = "quick";
        String str6 = "brown";
        String str7 = "box";

        System.out.print(str4.substring(0,1).toUpperCase() + str4.substring(1));
        System.out.print(" " + str5.substring(0,1).toUpperCase() + str5.substring(1));
        System.out.print(" " + str6.substring(0,1).toUpperCase() + str6.substring(1));
        System.out.print(" " + str7.substring(0,1).toUpperCase() + str7.substring(1));

        System.out.println(" ");

        String str8 = "THE QUICK BROWN BOX";
        String str9 = "THE";
        String str0 = "QUICK";
        String str11 = "BROWN";
        String str12 = "BOX";

        System.out.print(str9.substring(0,1).toLowerCase() + str9.substring(1));
        System.out.print(" " + str0.substring(0,1).toLowerCase() + str0.substring(1));
        System.out.print(" " + str11.substring(0,1).toLowerCase() + str11.substring(1));
        System.out.print(" " + str12.substring(0,1).toLowerCase() + str12.substring(1));
        /*
        7. Write a program that prints the string "Hello" in reverse order using the charAt method.
         */
        System.out.println("\n");
        String str13 = "Hello";
        System.out.println("" + str13.charAt(4) + str13.charAt(3) + str13.charAt(2) + str13.charAt(1) + str13.charAt(0));

        /*
        8. Write a program that counts the number of vowels in the string "Hello World"
        using the charAt and toLowerCase methods. Mistake!!!
         */
        /*
        9. Write a program that concatenates the strings "Hello" and "World"
        using the concat method and prints the resulting string.
         */
        String sign = "Hello";
        String sign2 = "World";
        String sign3 = sign.concat(sign2);
        System.out.println(sign3);
        /*
        10. Write a program that checks if the strings "hello" and "HELLO"
        are equal ignoring case using the equalsIgnoreCase method.
         */
        String a = "hello";
        String b = "HELLO";
        System.out.println(a.equalsIgnoreCase(b));
        /*
        11. Write a program that prints the length of the string "Hello World" using the length method.
         */
        String c = "Hello World";
        System.out.println(c.length());
        /*
        12. Write a program that prints the third character of the string "Hello" using the charAt method.
         */
        String d = "Hello";
        System.out.println(d.charAt(3));
        /*
        13. Write a program that prints out the index of the first occurrence of the letter "l"
        in the string "Hello World" using the indexOf method.
         */
        String e = "Hello World";
        System.out.println(e.indexOf("l"));
        /*
        14. Write a program that checks if the string "hello" and "hello" are equal
        using both the == and equals methods.
         */
        String f = "hello";
        String g = "hello";
        System.out.println(f == g);
        System.out.println(f.equals(g));
        /*
        15. Write a program that prints the string "HELLO WORLD" in all lowercase using the toLowerCase method.
         */
        String h = "HELLO WORLD";
        System.out.println(h.toLowerCase());
        /*
        16. Write a program that prints the string "hello world" in all uppercase using the toUpperCase method
         */
        String i = "hello world";
        System.out.println(i.toUpperCase());
        /*
        17. Write a program that replaces all occurrences of the letter "l" with the letter "r"
        in the string "Hello World" using the replace method
         */
        String j = "Hello World";
        System.out.println(j.replace("l", "r"));





    }

}
