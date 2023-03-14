package primitiveDataTypes;

public class IntroToPrimitives {
    public static void main (String [] args) {
        int age = 27;
        int number = 100;

        System.out.println(age);
        System.out.println (number);

        age = 28;

        byte myByte1 = 36; //declaring variable
        byte myByte2 = -117;
        byte myByte3 = 127;
        byte myByte4 = -128;

        myByte1 = 50; //reassigning value

        byte myb = 30;
        myb = 40;
        
        System.out.println(myByte1);  //100
        myByte1 = 40;
        System.out.println(myByte1);

        myByte2 = -109;

        System.out.println(myByte2);
        myByte2 = -115;
        System.out.println(myByte2);


        myByte3 = 113;
        System.out.println(myByte3);
        myByte3 = 120;
        System.out.println(myByte3);

        myByte4 = 108;
        System.out.println(myByte4);
        myByte4 = 99;
        System.out.println(myByte4);



        short iceCreamPerDay = 5000;
        short iceCreamPerWeek = 25000;

        System.out.println(iceCreamPerDay);
        System.out.println(iceCreamPerWeek);


        int numoffollowers = 1300;
        numoffollowers = 300000;
        numoffollowers = 213000000;
        System.out.println(numoffollowers);


        long creditCard1 = 11112222333344444L;
        long creditCard2 = 21500000000L;
        System.out.println(creditCard1);
        System.out.println(creditCard2);
    }
    
}
