package practice;

import java.util.Scanner;

public class CompareInts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first integer: ");
        int user = sc.nextInt();
        System.out.println("Enter second integer: ");
        int user2 = sc.nextInt();
        System.out.println("enter your third integer: ");
        int user3 = sc.nextInt();

        if(user > user2 && user > user3){
            System.out.println("1st integer is larger");
        }else if (user2 > user && user2 >user3){
            System.out.println("2nd integer is larger");
        }else if (user > user2 && user3 > user){
            System.out.println("3rd integer is larger");
        }else {
            System.out.println();
        }



    }
}
