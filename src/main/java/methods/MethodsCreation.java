package methods;

public class MethodsCreation {

    /*
    1. create public static method which takes 2 ints, returns string ""
    2. create public instance method which takes 1 int, returns boolean false
    3. create public instance method which does not take anything, returns int 1
    4. create static method which takes 1 String, returns double 1.8
    5. create instance method which takes nothing, returns nothing
    6. create static method which takes 3 ints, returns nothing
    7. create public instance method which takes 2 Strings and returns short
    8. create instance method which takes 1 int, returns 1 byte
    9. create static method which takes 2 Strings, 2 int, 1 boolean and returns nothing
    10. create instance method which takes 1 string, 1 int, 1 short, 2 bytes
and returns boolean
     */

    public static String method(int a, int b) {
        return "";
    }

    public boolean method2(int c) {
        return false;
    }

    public int method3() {
        return 1;
    }

    public static double method4(String d) {
        return 1.8;
    }

    public void method5() {
    }

    public static void method6(int e, int f, int g) {
    }

    public short method7(String h, String i){
        short outcome = 8;
        return outcome;
    }
    byte method8(int j){
        return 0;
    }

    static void method9(String k, String l, int m, int n, boolean o){
    }

    boolean method10(String p, int q, short r, byte s, byte t){
        return true;
    }
}
