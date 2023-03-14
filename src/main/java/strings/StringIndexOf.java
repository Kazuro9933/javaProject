package strings;

public class StringIndexOf {
    public static void main (String [] args){

        String ad = "Buy two, get one for free!";
        int index = ad.indexOf('g');
        System.out.println(index);
        //
        index = ad.indexOf('o',7);
        index = ad.indexOf('o', ad.indexOf(10 + 30 - 20));
        //
    }
}
