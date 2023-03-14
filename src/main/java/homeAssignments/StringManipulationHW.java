package homeAssignments;

public class StringManipulationHW {
    public static void main(String[] args) {
    /*
    1. Check if a given String contains a specific character:
     */
        String str1 = "Hello, Universe!";
        char ch = 'o';
        System.out.println(str1.contains("o"));

    /*
    2. Extract a substring from a given String:
     */
        String str2 = "Hello, World!";
        int start = 7;
        int end = 12;
        System.out.println(str2.substring(7, 12));
    /*
    3. Using charAt() method extract letter 'W'
     */
        String str3 = "Good morning World";
        char letter = str3.charAt(13);
        System.out.println(letter);
    /*
    4. Remove extra white spaces from both ends
     */
        String str4 = "         I love coding     ";
        System.out.println(str4.trim());
    /*
    5. Remove all occurrences of letter 'o' in the below String
     */
        String str5 = " Learn as if you will live forever, live like you will die tomorrow.";
        str5 = str5.replace("o", "");
        System.out.println(str5);

    }
}
