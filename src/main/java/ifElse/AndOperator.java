package ifElse;

public class AndOperator {
    public static void main(String[] args) {

        if (2 <3){
            System.out.println("hello");
        }
        if (5 < 10){
            System.out.println("hello");
        }
 //     ====================

        if (2 < 3 && 5< 10){
            System.out.println("bye bye");
        }
        if (false && true){
            System.out.println("potato");
        }
        if (true && false){
            System.out.println("do something");
        }
        if (true && true){
            System.out.println("finally true");
        }
 //     ========================================================================================


        String username = "sunshine123";
        String password = "moonlight456!true";
        String actualEmail = "sunshine123@gmail.com";

        String enteredUsername = "sunshine123";
        String enteredPassword = "moonlight456!tru";
        String enteredEmail = "sunshine123@gmail.com";

        /*
        if username and password are correct ===> logged in
        if username is correct, but password incorrect ====> incorrect password
        if username is incorrect, dont check password ====> username does not exist
        if username is incorrect, but email is correct and password is correct ==> recover username
        if username is correct, email is correct, but password is incorrect ==> recover password
        if username is correct, email is incorrect password is correct ===> recover email
         */
        if (enteredUsername.equals(username) && enteredPassword.equals(password) && enteredEmail.equals(actualEmail)) {
            System.out.println("logged in");
        }
        if (enteredUsername.equals(username) && !enteredPassword.equals(password)){
            System.out.println("Incorrect password, try again");
        }



        }
    }

