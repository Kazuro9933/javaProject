package homeAssignments;

public class VariableCastingHomework {
    public static void main(String[] args) {
        /*
        1. create and assign different values to 1 byte, 1 short, 1 int, 1 long, 1 float, 1 double variables

        2. one by one, assign short, int, long, float, double variable values to byte. Cast values if needed.

        3. one by one, assign byte, int, long, float, double variable values to short. Cast values if needed.

        4. one by one, assign short, byte, long, float, double variable values to int. Cast values if needed.

        5. one by one, assign short, int, byte, float, double variable values to long. Cast values if needed.

        6. one by one, assign short, int, long, byte, double variable values to float. Cast values if needed.

        7. one by one, assign short, int, long, float, byte variable values to double. Cast values if needed.
                 */

        byte a = 56;
        short b = 27345;
        int c = 345782;
        long d = 465900002;
        float e = 99.999f;
        double f = 69.9876343;

        byte byte1 = (byte) b;
        byte1 = (byte) c;
        byte1 = (byte) d;
        byte1 = (byte) e;
        byte1 = (byte) f;

        short short1 = a;
        short1 = (short) c;
        short1 = (short) d;
        short1 = (short) e;





    }
}
