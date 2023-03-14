package ifElse;

public class IfElseDay2 {
    public static void main(String[] args) {

        /*
        if (boolean) {
        write some code
        }

        else if (boolean) {
        write else code
        }

        else {
        write else code
        }
         */

        int day = 3;
        if (day == 1){
            System.out.println("monday");
        }
            else if (day == 2) {
            System.out.println("tuesday");
        }
            else if (day == 3){
            System.out.println("wednesday");
        }
            else if (day == 4){
            System.out.println("thursday");
        }

            String dayOfWeek = "Tuesday";
            if (dayOfWeek == "Monday"){
                System.out.println("1");
            }
            else if (dayOfWeek == "Tuesday"){
                System.out.println("2");
            }
            else if (dayOfWeek == "Wednesday"){
                System.out.println("3");
            }
            else if (dayOfWeek == "Thursday"){
                System.out.println("4");
            }
            else if (dayOfWeek == "Friday"){
                System.out.println("5");
            }
            else if (dayOfWeek == "Saturday"){
                System.out.println("6");
            }

            byte time = 18;
        if (time >= 9 && time <= 17) {
            System.out.println("Work Hours");
        }
        else if (time >= 7 && time <= 9 || time >= 18 && time <= 19){
            System.out.println("Commute hours");
        }
        else if (time >= 6 && time <= 8){
            System.out.println("Breakfast time");
        }
        else if (time >= 12 && time <= 13){
            System.out.println(("Lunch time"));
        }
        else if (time >= 20 && time <= 22){
            System.out.println("Dinner time");
        }
        else if (time >= 22 && time <= 24){
            System.out.println("Late hours");
        }
    }
}
