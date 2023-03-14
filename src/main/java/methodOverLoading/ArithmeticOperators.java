package methodOverLoading;

public class ArithmeticOperators {
    /*
    create a method which returns the sum of numbers
    1. takes 2 ints
    2. takes 3 ints

    create a method which returns the average of numbers
    1. takes 4 ints
    2. takes 6 ints
     */

    public int sumOfNumbers(int a, int b){
        return a + b;
    }
    public int sumOfNumbers(int c, int d, int e){
        return c + d + e;
    }
    public double averageOfNumbers(int num1, int num2, int num3, int num4) {
        int sum = num1 + num2 + num3 + num4;
        double average = (double) sum / 4.0;
        return average;

    /*
    create 2 getAreas OfTriangle methods
    1. int base, int heigth
    (1/2 * base * height)

    2. int a, int b, int c

    int s = (a + b + c) / 2
    int area = sqrt(s (s-a)(s-b)(s-c))
    Math.sqrt()
     */
        public double getAreaOfTriangle(int base, int height){
            return getAreaOfTriangle((double)base, height);
        }

        public double getAreaOfTriangle(int a, int b, int c){
            return getAreaOfTriangle((double)a,b,c);
        }

        public double getAreaOfTriangle(double base, double height){
            return 0.5 * base * height;
        }

        public double getAreaOfTriangle(double a, double b, double c){
            double semiPerimeter = (a + b + c) / 2;
            return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
        }
        public static void main (String [args]);

    }
}
