package switchStatement;

public class WeekDays {
    public static void main(String[] args) {

        int day = 5;
        switch (day) {

            case 1, 2, 3, 4, 5:
                System.out.println("Weekday");
                break;
            case 6, 7:
                System.out.println("Weekend");

            default:
                System.out.println("INVALID Day");
                break;
        }

        char letter = 'A';
        switch (letter){
            case 'A', 'E', 'I', 'O', 'U' :
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }


    }
}
