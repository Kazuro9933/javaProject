package ifElse;

public class IntroToIfElse {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        System.out.println("I will compare a and b below ");
        if(a > b){
            System.out.println("a is more than b");
        }else {
            System.out.println("a is less than b");
        }

        int number1 = 100;
        int number2 = 50;

        if (number1 / number2 == 2){
            System.out.println("YES, two!");
        } else {
            System.out.println("NOT, two!");
        }

        String elon = "Tesla SPaceX Paypal Twitter";
        if (elon.contains("Paypal")){
            System.out.println("Elon owned Paypal");
        } else {
            System.out.println("Elon did not own Paypal");
        }
        /*
        create 5 if else statements,
        2 boolean statements with numbers
        3 boolean statements with Strings
         */
        int car1 = 50;
        int car2 = 50;
        if (car1 >= car2){
            System.out.println("CORRECT");
        } else {
            System.out.println("NOT CORRECT");
        }
        int weight1 = 110;
        int weight2 = 75;
        if (weight1 <= weight2){
            System.out.println("fit");
        }else  {
            System.out.println("not fit");
        }

        String cars = "bmw mercedes lamborgini rangerover";
        if (cars.contains("bmw")){
            System.out.println("RIGHT");
        }else {
            System.out.println("not right");
        }
    }
}
