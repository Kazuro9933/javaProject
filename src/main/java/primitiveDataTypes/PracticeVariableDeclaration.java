package primitiveDataTypes;

public class PracticeVariableDeclaration {

    public static void main (String [] args){
        /*
        multiline comment

        for comments and describe your work
        1. Declair variable (means create container)
        2. Assign value to variable (put value inside variable)
        3. Reassign value to variable (put new value to the same variable)
        ----------------------------------------------------------------------------------------------
        Variable Declaration

        byte myByte;
        short myShort;
        int myInt;
        long myLong
        ----------------------------------------------------------------------------------------------
        VALUE ASSIGNMENT

        byte myByte = 3; (declare variable and assign value)

        short age; (declaring variable)
        age = 40 (assigning value to variable)
        -----------------------------------------------------------------------------------------------
        REASSIGN VALUE

        int number = 100;
        number = 30; (reassign value)
        number = 0;
        ----------------------------------------------------------------------------------------------
        NAMING CONVENTION
        - all variables must start with lower case
        - all variables must use camelCase (thisIsMyCamelCasesLongWord)
        - all classes must start with upper case, use camelCase
        - all packages must start with lower case, use camelCase
        - manes start with any letter, or _ or $

         */

        // single line comment

        byte myByte; // declared variable
        byte _another_byte;

        myByte = 5;
        myByte = 10;

        System.out.println(myByte); //10

        myByte = 20;

        System.out.println(myByte);  //20

        myByte = 20;


        //---------------------------------

        /*
        create 5 short variable
        assign values, reassign values twice
        print them

         */
        short lazor;
        short mylazor = 9300;
        System.out.println (mylazor);
    }
}
