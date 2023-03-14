package ifElse;

public class IfIf {
    public static void main(String[] args) {

        String weather = "warm and rainy";

        if (weather.equals("cold")){
            System.out.println("cold, stay home!");
        }
        else if (weather.equals("hot")){
            System.out.println("hot, stay home!");
        }
        else if (weather.equals("warm")){
            System.out.println("warm, go out!");
        }
        else {
            System.out.println("party hard!");
        }



        System.out.println("IF IF IF IF IF IF");
        if (1 > 2){
            System.out.println("one is less than two");
        }
        if (1 < 3){
            System.out.println("one is less than three");
        }
        if (10 < 4){
            System.out.println("one is less than 4");
        }
    }
}
