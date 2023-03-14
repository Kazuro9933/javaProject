package scannerClass;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        double temp = user.nextDouble();

        System.out.println("Is it raining? true/false");
        boolean isRaining = user.nextBoolean();

        if (temp < 0){
            System.out.println("its freezing outside! wear a heavy coat, gloves and hat.");
        }
        else if (isRaining && temp >= 0 && temp <= 10){
            System.out.println("its chilly and rainy! wear a raincoat, boots and scarf.");
        }
        else if (temp >=0 && temp <= 10){
            System.out.println("Its chilly outside! wear a jacket, gloves and a hat.");
        }
        else if (isRaining && temp >=11 && temp <= 20){
            System.out.println("It's cool and rainy! Wear a light jacket, boots, and a scarf.");
        }
        else if (temp >= 11 && temp<= 20){
            System.out.println("It's cool and rainy! Wear a light jacket, boots, and a scarf.");
        }
        else if (isRaining && temp > 20){
            System.out.println("It's warm and rainy! Wear a light jacket, shorts, and sandals.");
        }
    }
}
