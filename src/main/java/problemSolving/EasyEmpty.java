package problemSolving;

import java.util.Scanner;

public class EasyEmpty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        if (word.isEmpty()){
            System.out.println("Empty");
        }
        else{
            System.out.println("Not empty");
        }


    }
}
