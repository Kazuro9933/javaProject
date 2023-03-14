package ifElse;

import java.util.Scanner;

public class ContainsE {
    public static void main(String[] args) {
        String a = "temperature";
        if (a.contains("e")){
            System.out.println(a.indexOf('e'));
        }else {
            System.out.println("The word doesnt contain the letter 'e'");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 digit zipcode:");
        int zipcode = sc.nextInt();

        String zip = zipcode + "";
        if (zip.length() == 5 && !zip.contains("9") && !zip.startsWith("0")){
            System.out.println("zipcode is valid");
        }else{
            System.out.println("zipcode is not valid");
        }
    }
}
