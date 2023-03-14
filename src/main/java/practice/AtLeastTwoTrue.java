package practice;

import java.util.Scanner;

public class AtLeastTwoTrue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three booleans: ");

        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();
        boolean c = sc.nextBoolean();

        if(a && b && c){
            System.out.println("all true");
        }
        else if ((a && b) || (b && c) || (c && a)){
            System.out.println("At least two are true");
        }
        else {
            System.out.println("At least 2 are not true");
        }
    }
}
