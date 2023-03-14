package Objects;

public class FacebookUser {
    String username;
    String password;
    String firstName;
    String lastName;

    public void login (String username, String password){
        System.out.println(username + " logged in to the application");
    }

    public static void main(String[] args) {
        FacebookUser user = new FacebookUser();
        user.login("abc", "abc123");
        user.username = "tokyo";
        user.password = "abc123";

        FacebookUser user2 = new FacebookUser();
        user2.login("efg", "efg123");
        user2.username = "bangkok";
        user2.password = "thailand";


    }
}
