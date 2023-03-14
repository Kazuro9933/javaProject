package strings;

public class StringIsEmpty {
    public static void main (String [] args){

        String veggie1 = "potato";
        String veggie2 = "";

        boolean isEmptyVeggie = veggie1.isEmpty();  //false
        boolean isEmptyVeggie2 = veggie2.isEmpty();

        System.out.println(isEmptyVeggie);
        System.out.println(isEmptyVeggie2);
    }
}
