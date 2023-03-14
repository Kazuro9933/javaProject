package Objects;

public class Animal {
    String type;
    boolean isMammal;
    boolean isCarnivore;
    int age;
    String habitat;
    public void eat() {
        System.out.println(type + isCarnivore + age + habitat + " is eating " + isMammal);
    }
    public  void sleep(){
        System.out.println(type + isCarnivore + age + habitat + isMammal +  " is sleeping " );
    }
    public  void play(){
        System.out.println(type + isCarnivore + age + habitat + isMammal + " Playing " );
    }
}
