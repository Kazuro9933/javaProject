package loops;

public class NestedLoop {
    public static void main(String[] args) {
        /*
        nested loop - loop inside loop
         */
        for (int k = 1; k <= 15; k++) {
            for (int m = 1; m <= 15; m++) {
                System.out.print((k * m) + "\t");
            }
            System.out.println();
        }
        for (int j = 1; j <= 6; j++) {
            for (int w = 1; w <= j; w++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}