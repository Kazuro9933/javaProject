package scannerClass;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter month:" );
        String month = scanner.nextLine();

        if (month.equalsIgnoreCase("January") ||
                month.equalsIgnoreCase("February") ||
                month.equalsIgnoreCase("December")){
            System.out.println("Winter time !!!");
        } else if (month.equalsIgnoreCase("March") ||
                   month.equalsIgnoreCase("April") ||
                   month.equalsIgnoreCase("May")){
            System.out.println("Spring Time!!!");
        } else if (month.equalsIgnoreCase("June") ||
                   month.equalsIgnoreCase("july") ||
                   month.equalsIgnoreCase("august")){
            System.out.println("Summer !!!");
        }else if (month.equalsIgnoreCase("september")||
                  month.equalsIgnoreCase("octber")||
                  month.equalsIgnoreCase("november")){
            System.out.println("Autumn !!!");
        }else {
            System.out.println("INVALID SEASON");
        }



    }
}
