package strings;

public class StringStartsEndsWith {
    public static void main (String [] args){

        String banner = "ThanksGiving Sale 20%";

        boolean isSale = banner.startsWith("Thanks"); //true
        System.out.println(isSale);
    }
}
