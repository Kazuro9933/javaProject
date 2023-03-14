package loops;

public class DoWhileLoop {
    public static void main(String[] args) {

        int  i = 1;

        do {
            System.out.println(i);
            i++;
        }while (i <= 10);

        int j = 1;
        do {
            if (j % 2 != 0) {
                System.out.println(j);
            }
            j++;
        } while (j <= 100);
    }
}
