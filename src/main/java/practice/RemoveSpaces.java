package practice;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Remove spaces");

        String strn = scann.nextLine();
        System.out.println(strn.replace(" ", ""));


    }
}
