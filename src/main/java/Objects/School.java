package Objects;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Leo";
        student1.phone = "123456789";
        student1.email = "leo@gmail.com";
        student1.age = 18;
        student1.major = "Law";

        Student student2 = new Student();
        student2.name = "Kyle";
        student2.phone = "987654321";
        student2.email = "kyle@gmail.com";
        student2.age = 25;
        student2.major = "Finance";

        student1.read();
        student2.read();

        student1.attendClass();
        student2.attendClass();

        student1.printInfo();
        student2.printInfo();

    }
}
