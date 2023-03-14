package primitiveDataTypes;

public class shortVariable {
    public static void main (String [] args){

        short first1 = 3000;
        first1 = 4000;

        System.out.println(first1);

        int myInt1;  // created variable and didnt give any value
        int myInt2;

        myInt1 = 343434;
        myInt1 = 200;

        myInt2 = myInt1;

        System.out.println(myInt1);
        System.out.println(myInt2);

        int myInt3 = 40;
        myInt3 =43000;

                System.out.println(myInt3);

        long myLong1 = 4;
        myLong1 = -2343444444L;

        long myLong2 = -2985858585858L;
        long myLong3 = 23940400595959L;

        myLong2 = myInt3;

        System.out.println(myLong2);

        byte byteNumber = 126;
        short shortNumber = 32000;
        int intNumber = -145 ;
        long longNumber = 120;

        longNumber = byteNumber;
        // shortNumber = intNumber; NOT WORK
        // ShortNumber = longNumber;
        // CASTING is used to store larger variable values into smaller variable values

        intNumber = (int)longNumber;
        byteNumber = (byte)intNumber;
        shortNumber = (byte)longNumber;

        System.out.println(byteNumber);






    }
}
