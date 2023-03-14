package practice;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);
        System.out.println("equal or not");
        String word1 = l.nextLine();
        String word2 = l.nextLine();

        if (word1.equals(word2)){
            System.out.println("EQUAL");
        }else {
            System.out.println("NOT EQUAL");
        }
    }
}
