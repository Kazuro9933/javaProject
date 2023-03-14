package switchStatement;

import java.util.Scanner;

public class PracticeSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: A, B, C, D, E or F");
        String grade = sc.nextLine();
        switch (grade) {
            case "A":
                System.out.println("Excellent, proud of you");
                break;
            case "B":
                System.out.println("Good job!");
                break;
            case "C":
                System.out.println("Good, study more");
                break;
            case "D":
                System.out.println("Bad, study more");
                break;
            case "F":
                System.out.println("Very bad, study harder");
                break;
            default:
                System.out.println("Wrong Letter");
        }

        /*
        Using if-else, Scanner class, create a program that asks the user to enter month's number between 1 and 12 and
        prints out the corresponding season.
        For example, if the user enters "3", the program should output "Spring".
        12, 1, 2 => winter
        3, 4, 5 => spring
        6, 7, 8 => summer
        9, 10, 11 => fall
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int month = scanner.nextInt();
        if (month == 12 || month ==  1 || month == 2){
            System.out.println("Winter");
        }
        else if (month == 3 || month == 4 || month == 5){
            System.out.println("Spring");
        }
        else if (month == 6 || month == 7 || month == 8){
            System.out.println("Summer");
        }
        else if (month == 9 || month == 10 || month ==  11){
            System.out.println("Fall");
        }
        else{
            System.out.println("Invalid month");
        }
//   =======================================================================================================

        switch (month) {
            case 12, 1, 2:
                System.out.println("winter");
                break;
            case 3, 4, 5:
                System.out.println("spring");
                break;
            case 6, 7, 8:
                System.out.println("summer");
                break;
            case 9, 10, 11:
                System.out.println("fall");
                break;
            default:
                System.out.println("INVALID NUMBER");
        }
        }
    }