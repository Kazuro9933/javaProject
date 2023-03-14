package ifElse;

public class EvenOrOdd {
    public static void main(String[] args) {
        /*
        write a programm that checks if a given integer is even or odd.
        print "Even" if the number is even, and "Odd" if the number is odd.
        even is the  number that can be divided by 2
        number % 2 ====> even
         */
         int number = 9;
         if (number % 2 == 2){
             System.out.println("EVEN");
         }else {
             System.out.println("ODD");
         }
    }
}
