package Objects;

public class Car {
    String model;
    int year;
    String price;
    String color;

    public void read() {
        System.out.println(model + " is driving");
    }

    public void playMusic() {
        System.out.println(model + " is playing music ");
    }

    public void printInfo() {
        System.out.println("Car model is " + model + " and year is " + year);
        System.out.println("Car color is " + color);
        System.out.println("Cars details info: " + model + " and year is: " + year + " and the color is: "
                + color + " and cost " + price);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "BMW";
        car1.year = 2023;
        car1.price = "70000";
        car1.color = "blue";

        car1.read();
        car1.printInfo();
        car1.playMusic();

    }
}
