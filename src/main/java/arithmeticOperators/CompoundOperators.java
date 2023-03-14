package arithmeticOperators;

public class CompoundOperators {
    public static void main (String [] args){

        int a = 5;
        a++; //a = a + 1
        a++;
        a++;

        System.out.println(a); //8

        a--; //a = a - 1
        a--;
        System.out.println(a);


        int age = 18;

        System.out.println(age++); //post increment 18
        System.out.println(age);  //19

        int price = 20;

        System.out.println(++price); //pre increment 21
        System.out.println(price); //21

        int money = 20;

        money += 3; //money = money + 3
        System.out.println(money);

        money += 5;
        System.out.println(money); //28

        money -= 8;
        System.out.println(money); //20
    }
}
