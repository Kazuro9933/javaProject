package strings;

public class IntroToStrings {
    public static void main (String [] args){

        String firstname = "John";
        String lastname = "Doe";

        System.out.println(firstname);
        System.out.println(lastname);

        firstname = "Ernest";
        lastname = "Mumbaev";

        System.out.println(firstname);
        System.out.println(lastname);

        String myname = "Ernest";
        String mymiddlename = "Kursanalievich";
        String mylastname = "Mumbaev";
        int myage = 32;
        String address = "2530 W foster";
        String mobile = "7739920527";
        String friendship = "Ulik";
        String city = "Chicago";

        System.out.println(myname);
        System.out.println(mymiddlename);
        System.out.println(mylastname);
        System.out.println(myage);
        System.out.println(address);
        System.out.println(mobile);
        System.out.println(friendship);
        System.out.println(city);
        System.out.println(myname + " " + mylastname);

        System.out.println("My name is" + " " + myname + " " + mylastname);

        /*
        Declare String (means Create)
        1 String name = "value"
        2 String name = new String ("value")
         */
        String fruit1 = "apple";
        String fruit2 = new String("banana");

       // ---------------------------------------------------------------------------------------------------------

        String city1 = "London";

        System.out.println(city1);

        String city2 = new String("New York");

        //======================================================================================

        System.out.println(city1.length()); //6
        /*
        lenght () method us the number of characters in String
         */

        String name = "Antananarivo";
        System.out.println("the lenght of Antananarivo is: " + name.length());

        /*
        equals () method compares values of 2 strings
         */

        String fruit3 = "apple";
        String fruit4 = "apple";
        String fruit5 = "Apple";

        boolean isSame = fruit3.equals(fruit4);
        System.out.println(isSame);
        isSame = fruit3.equals(fruit5);
        System.out.println(isSame);     // false

        fruit3 = "banana";
        fruit4 = "orange";
        System.out.println("Is banana same as orange? " + fruit3.equals(fruit4));

        boolean isSame2 = !fruit3.equals(fruit4); //not equals, TRUE

        String state1 = "California";
        String state2 = "Illinois";
        String state3 = "Florida";
        String state4 = "Illinois";
        String state5 = "florida";

        boolean isSamestate1 = !state1.equals(state2);
        System.out.println(isSamestate1);
        boolean isSamestate2 = !state2.equals(state4);
        System.out.println(isSamestate2);

        int cucumber = 5;
        int tomato = 10;
        int empty = cucumber;
        cucumber = tomato;
        tomato = empty;




    }
}
