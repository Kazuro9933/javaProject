package strings;

public class PracticeStrings {
    public static void main(String[] args) {

        String singerName = "Michael Jackson";
        System.out.println(singerName.length());

        System.out.println(singerName.endsWith("ON"));
        System.out.println(singerName.startsWith("Misha"));
        System.out.println(!singerName.isEmpty());

        System.out.println(singerName.toLowerCase());
        System.out.println(singerName);

        singerName = singerName.toUpperCase();
        System.out.println(singerName);

        System.out.println(singerName.charAt(0));
        System.out.println("" + singerName.charAt(0) + singerName.charAt(3));
        System.out.println(singerName.charAt(8));

        System.out.println(singerName.indexOf("C"));
        System.out.println(singerName.indexOf('C', 3));
        System.out.println(singerName.indexOf("W"));

        String singerName2 = "Justin Bieber" ;
        boolean areTheSame = singerName2.equals(singerName);
        System.out.println(areTheSame);

        System.out.println(!singerName.equals(singerName2));

        singerName = singerName2;
        System.out.println(singerName.equals(singerName2));
        System.out.println(singerName == singerName2);
    }
}
