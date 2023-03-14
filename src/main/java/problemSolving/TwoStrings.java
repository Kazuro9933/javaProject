package problemSolving;

import java.util.Scanner;

public class TwoStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");

        String word1 = sc.next();
        String word2 = sc.next();

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        System.out.println(word1 + word2.toUpperCase().charAt(0) + word2.substring(1));

        System.out.println(word1.toUpperCase().charAt(0) + word1.substring(1) + word2.toUpperCase().charAt(0) +
                word2.substring(1));

        System.out.println(word1.toUpperCase() + " " + word2 + " " + word2 + " " + word1.toUpperCase());

        System.out.println(word1.toUpperCase().charAt(word1.length()-2) + "" + word1.toLowerCase().charAt(word1.length()-1)
        + word2.toUpperCase().charAt(word2.length()-2) + "" + word2.toLowerCase().charAt(word2.length()-1));
    }
}
